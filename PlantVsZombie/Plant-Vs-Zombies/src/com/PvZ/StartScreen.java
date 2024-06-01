package com.PvZ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.animation.FadeTransition;
import javafx.animation.FillTransition;
import javafx.application.Application;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import com.PvZ.util.*;


public class StartScreen extends Application{
	private static final double BLUR_AMOUNT = 10;

    private static final Effect frostEffect =
        new BoxBlur(BLUR_AMOUNT, BLUR_AMOUNT, 3);

	
	@Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        // Set title
        primaryStage.setTitle("Plant Vs Zombies");
        
        // Disable resizing
        //primaryStage.setResizable(false);        

        // Avoid unnecessary padding on right and bottom
        primaryStage.sizeToScene();

        // Initialize the Scene
        Scene scene = new Scene(createContent());
        scene.setCursor(new ImageCursor(new Image(new FileInputStream("Cursor.png"))));
        // Set Scene and show Stage
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
	
	
	private Parent createContent() throws FileNotFoundException{
        Pane root = new Pane();
        ImageView imageView = new ImageView(new Image(new FileInputStream("PvZbg.jpg")));

//        Media m=new Media("file:///C:/Users/SACHIN/Downloads/PlantsVsZombies-Game-master/Greenfoot/sounds/menu.wav");
        Media m=new Media(getClass().getResource("menu.wav").toExternalForm());
        Media mclick=new Media(getClass().getResource("MouseHover.mp3").toExternalForm());
        MediaPlayer click=new MediaPlayer(mclick);
        
        MediaPlayer pl=new MediaPlayer(m);
        pl.setVolume(0);
        pl.setOnEndOfMedia(() -> {
        	pl.seek(new Duration(0));
        	pl.play();
        });
        pl.play();
//        myThread so=new myThread();
//        so.start();
//        so.run();

        
//        BackgroundImage backgroundimage = new BackgroundImage(
//        		new Image(new FileInputStream("PvZbg.jpg")),
//                BackgroundRepeat.NO_REPEAT,  
//                BackgroundRepeat.NO_REPEAT,  
//                BackgroundPosition.DEFAULT,  
//                new BackgroundSize(1280, 720, true, true, true, true));

        
        imageView.setFitWidth(1366);
        imageView.setFitHeight(768);

//        SepiaTone tone = new SepiaTone(0);
//        imageView.setEffect(tone);
        
        ImageView image= new ImageView(new Image(new FileInputStream("click_to_start.gif")));
        image.setTranslateX(400);
        image.setTranslateY(570);
        image.setFitWidth(500);
    	image.setFitHeight(135);
    	
        image.setEffect(new DropShadow(300,Color.RED));

        image.setOnMouseEntered((MouseEvent e) -> {
        	image.setFitWidth(510);
        	image.setFitHeight(140);
            image.setTranslateX(395);
            image.setTranslateY(568);
        	click.seek(new Duration(0));
        	click.play();
        });
        
        image.setOnMouseExited((MouseEvent e) -> {
            image.setFitWidth(500);
        	image.setFitHeight(135);
            image.setTranslateX(400);
            image.setTranslateY(570);
        });
        
//        image.setOnMouseClicked((MouseEvent e) -> {
//        	System.out.println("cas");
//        });
        Rectangle masker=new Rectangle(1367,768);
        masker.setOpacity(0);
        masker.setMouseTransparent(true);
        
        image.setOnMouseClicked(e -> {
        	new MediaPlayer(new Media(getClass().getResource("MouseClick.mp3").toExternalForm())).play();
        	
        	imageView.setEffect(frostEffect);
        	
        	pl.stop();
            FadeTransition ft = new FadeTransition(Duration.seconds(1.5), masker);
            ft.setToValue(1);

            ft.setOnFinished(ee -> {
                try {
					root.getChildren().setAll(new Loading(1366, 768, () -> {
						masker.setOpacity(0);
					    root.getChildren().setAll(imageView,masker);
					}));
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
                
       
                
            });

            ft.play();
        });
        

//        root.setBackground(new Background(backgroundimage));
        root.getChildren().addAll(imageView,image,masker);
        
        return root;
	}

	
    public static void main(String[] args) {
        launch(args);
    }
}