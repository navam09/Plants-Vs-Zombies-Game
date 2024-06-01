//package com.PvZ;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import javafx.animation.FadeTransition;
//import javafx.application.Application;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.effect.SepiaTone;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.Pane;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//import com.PvZ.util.*;
//
//public class Main extends Application{
//	/**
//	@param primaryStage
//	 * @throws FileNotFoundException 
//	**/
//	@Override
//    public void start(Stage primaryStage) throws FileNotFoundException {
//
//        // Set title
//        primaryStage.setTitle("Plant Vs Zombies");
//
//        // Disable resizing
//        primaryStage.setResizable(false);
//
//        // Avoid unnecessary padding on right and bottom
//        primaryStage.sizeToScene();
//
//        // Initialize the Scene
//        Scene scene = new Scene(createContent());
//
//        // Set Scene and show Stage
//        primaryStage.setScene(scene);
////        primaryStage.setFullScreen(true);
//        primaryStage.show();
//    }
//	
//	private Parent createContent() throws FileNotFoundException{
//        Pane root = new Pane();
//        ImageView imageView = new ImageView(new Image(new FileInputStream("PvZbg.jpg")));
//        imageView.setFitWidth(1280);
//        imageView.setFitHeight(720);
//
////        SepiaTone tone = new SepiaTone(0);
////        imageView.setEffect(tone);
//        
//        Button button=new Button("");
//        Image image= new Image(new FileInputStream("click_to_start.gif"));
//        button.setGraphic(new ImageView(image));
//        root.getChildren().add(button);
//
//        Rectangle masker = new Rectangle(1280, 720);
//        masker.setOpacity(0);
//        masker.setMouseTransparent(true);
//
//        MenuBox menuBox = new MenuBox(250, 350);
//        menuBox.setTranslateX(250);
//        menuBox.setTranslateY(230);
//
//        MenuBox menuBox2 = new MenuBox(510, 350);
//        menuBox2.setTranslateX(250 + 20 + 250);
//        menuBox2.setTranslateY(230);
//
//        menuBox.addItem(new MenuItem("CONTINUE", 250));
//
//        MenuItem itemNew = new MenuItem("NEW", 250);
//        itemNew.setOnAction(() -> {
//            FadeTransition ft = new FadeTransition(Duration.seconds(1.5), masker);
//            ft.setToValue(1);
//
//            ft.setOnFinished(e -> {
////                try {
////					root.getChildren().setAll(new LoadingScreen(1280, 720, () -> {
////						masker.setOpacity(100);
////					    root.getChildren().setAll(imageView, menuBox, menuBox2, masker);
////					}));
////				} catch (FileNotFoundException e1) {
////					// TODO Auto-generated catch block
////					e1.printStackTrace();
////				}
//            });
//
//            ft.play();
//        });
//        menuBox.addItem(itemNew);
//        menuBox.addItem(new MenuItem("LOAD", 250));
//
//        MenuItem itemSettings = new MenuItem("SETTINGS", 250);
//        itemSettings.setOnAction(() -> {
//            menuBox2.addItems(
//                    new MenuItem("GAMEPLAY", 510),
//                    new MenuItem("CONTROLS", 510),
//                    new MenuItem("DISPLAY", 510),
//                    new MenuItem("AUDIO", 510));
//        });
//
//        menuBox.addItem(itemSettings);
//        menuBox.addItem(new MenuItem("CREW", 250));
//
//        MenuItem itemExit = new MenuItem("EXIT", 250);
//        itemExit.setOnAction(() -> System.exit(0));
//        menuBox.addItem(itemExit);
//
//        root.getChildren().addAll(imageView, menuBox, menuBox2, masker);
//        return root;	}
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//}
