package com.PvZ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.animation.FillTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;

public class welcome extends Pane {

    private Timeline animation = new Timeline();
   
    public welcome(int width, int height, String playerName ,Runnable action) throws FileNotFoundException {
        ImageView bg = new ImageView(new Image(new FileInputStream("pvz_demo.jpg")));
        bg.setFitWidth(width);
        bg.setFitHeight(height);
       action.run();
        Node ani = welcomeAnimation(playerName,action);
        ani.setTranslateX(width/2);
        ani.setTranslateY(height/2);

        getChildren().addAll(bg,ani);
    }

    private Node welcomeAnimation(String playerName, Runnable action) {
        Media mclick=new Media(getClass().getResource("MouseHover.mp3").toExternalForm());
        MediaPlayer click=new MediaPlayer(mclick);

        Pane symbol = new Pane();
        try{
       
          ImageView adventure = new ImageView(new Image(new FileInputStream("adventure.png")));
          adventure.setTranslateX(-160); //-160
          adventure.setTranslateY(-470); //-470
          adventure.setVisible(false);
          adventure.setPreserveRatio(true);
          adventure.setOnMouseEntered((MouseEvent e) -> {
          	  click.seek(new Duration(0));
        	  click.play();
        	  adventure.setFitWidth(+1025);
          });
          adventure.setOnMouseExited((MouseEvent e) -> {
         adventure.setFitWidth(0);
         adventure.setFitHeight(0);
          });
         
         
          ImageView options = new ImageView(new Image(new FileInputStream("options.png")));
          options.setPreserveRatio(true);
          options.setOnMouseEntered((MouseEvent e) -> {
	        options.setFitWidth(+1025);
	     	click.seek(new Duration(0));
	        click.play();
          });
          options.setOnMouseExited((MouseEvent e) -> {
	         options.setFitWidth(0);
	         options.setFitHeight(0);
          });
          
          ImageView achievements = new ImageView(new Image(new FileInputStream("achievements.png")));
          achievements.setPreserveRatio(true);
          achievements.setOnMouseEntered((MouseEvent e) -> {
	        achievements.setFitWidth(+1025);
	     	click.seek(new Duration(0));
	     	click.play();
          });
          achievements.setOnMouseExited((MouseEvent e) -> {
	         achievements.setFitWidth(0);
	         achievements.setFitHeight(0);
          });
         
          ImageView help = new ImageView(new Image(new FileInputStream("help.png")));
          help.setPreserveRatio(true);
          help.setOnMouseEntered((MouseEvent e) -> {
         help.setFitWidth(+1025);
     	click.seek(new Duration(0));
         click.play();
          });
          help.setOnMouseExited((MouseEvent e) -> {
         help.setFitWidth(0);
         help.setFitHeight(0);
          });
          
          help.setTranslateX(75);
          help.setTranslateY(-189);
          help.setVisible(false);
//          
          options.setTranslateX(-53);
          options.setTranslateY(-175);
          options.setVisible(false);
//          
          achievements.setTranslateX(-533);
          achievements.setTranslateY(-205);
          achievements.setVisible(false);
//          
          adventure.setEffect(new DropShadow(20,Color.BLACK));
          options.setEffect(new DropShadow(20,Color.BLACK));
          achievements.setEffect(new DropShadow(20,Color.BLACK));
          help.setEffect(new DropShadow(20,Color.BLACK));
         
        ImageView welcome = new ImageView(new Image(new FileInputStream("welcome.png")));
//        welcome.setFitHeight(200);
//        welcome.setFitWidth(200);
        welcome.setTranslateX(-379);
        welcome.setTranslateY(285);
       
        ImageView namebox = new ImageView(new Image(new FileInputStream("name_box.png")));
//        namebox.setFitHeight(100);
//        namebox.setFitWidth(100);
        namebox.setTranslateX(-1220);
        namebox.setTranslateY(-1095); // -1095
//        
        StackPane fortext = new StackPane();
        Text name = new Text(playerName);
        name.setFill(Color.PALEGOLDENROD);
//        name.setTranslateX(-350);
//        name.setTranslateY(-173);
//        name.setScaleX(2);
//        name.setScaleY(2);
        name.setVisible(false);
        fortext.getChildren().add(name);
        fortext.setTranslateX(-400);
        fortext.setTranslateY(-205);
//        fortext.setPrefSize(1, 1);
        name.setFont(Font.font("Eraser",FontWeight.BOLD, FontPosture.ITALIC, 30));
//        fortext.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID,
//         CornerRadii.EMPTY, new BorderWidths(5))));
        fortext.setAlignment(name, Pos.CENTER);
        namebox.setOnMouseClicked(e -> {        
	       	try {
			getChildren().setAll(new PromptUser(1367, 768, () -> {
				//masker.setOpacity(0);
			}));
			} 
	       	catch (FileNotFoundException e1){
				e1.printStackTrace();
			}
        });
        
        KeyFrame frame = new KeyFrame(Duration.seconds(0.5),
                new KeyValue(welcome.translateYProperty(), -403),new KeyValue(namebox.translateYProperty(), -775));
       

        animation.getKeyFrames().add(frame);
        animation.setCycleCount(1);
        animation.play();
        animation.setOnFinished(x -> {name.setVisible(true);help.setVisible(true);achievements.setVisible(true);
        options.setVisible(true);adventure.setVisible(true);});
        symbol.getChildren().addAll( welcome,namebox,fortext,help,options,adventure,achievements);
//        symbol.getChildren().addAll( sun);
       
        return symbol;
        }
        catch(Exception e){
        	return symbol;
        }
    }
}

