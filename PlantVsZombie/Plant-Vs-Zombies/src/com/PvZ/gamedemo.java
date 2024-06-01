package com.PvZ;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.scene.canvas.*; 
import javafx.scene.layout.*; 
import javafx.scene.image.*; 
import javafx.geometry.*; 
import java.io.*; 
import javafx.scene.Group; 
import javafx.scene.paint.*; 
import javafx.animation.AnimationTimer;
import javafx.scene.input.MouseEvent;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.scene.shape.*;
import java.util.*;

public class gamedemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    private Path straight(){
    	final Path path = new Path();
        path.getElements().add(new MoveTo(500,-650));
        path.getElements().add(new LineTo(500,600));
        path.setOpacity(0.0);
        return path;
    }
    
    private PathTransition generatePathTransition(final Node shape, final Path path)
    {
       final PathTransition pathTransition = new PathTransition();
       pathTransition.setDuration(Duration.seconds(9.0));
       pathTransition.setDelay(Duration.seconds(0.0));
       pathTransition.setPath(path);
       pathTransition.setNode(shape);
       pathTransition.setCycleCount(Timeline.INDEFINITE);
       pathTransition.setAutoReverse(false);
       return pathTransition;
    }
    private double determinePathOpacity()
    {
       final Parameters params = getParameters();
       final List<String> parameters = params.getRaw();
       double pathOpacity = 0.0;
       if (!parameters.isEmpty())
       {
          try
          {
             pathOpacity = Double.valueOf(parameters.get(0));
          }
          catch (NumberFormatException nfe)
          {
             pathOpacity = 0.0;
          }
       }
       return pathOpacity;
    }
    private void applyAnimation(final GridPane group, Image sun)
    {
    	Node Sun = new ImageView(sun);
       final Path path = straight();
       group.getChildren().add(path);
       group.getChildren().add(Sun);
       final PathTransition transition = generatePathTransition(Sun, path);
       transition.play(); 
    }
    
    @Override
    public void start(Stage primaryStage) throws IOException{
    	FileInputStream input = null;
    	try{
        primaryStage.setTitle("Hello World!");
        
        GridPane root = new GridPane();
        final Group g = new Group();

        String path = new File(".").getCanonicalPath();
        
        input = new FileInputStream(path+"/src/com/PvZ/lawn2.png"); // lawn photo's location
        Image image = new Image(input);
        input = new FileInputStream(path+"/src/com/PvZ/Sun2.png"); // sun photo's location
        Image sun = new Image(input);
        BackgroundImage backgroundimage = new BackgroundImage(
        		image,
                BackgroundRepeat.NO_REPEAT,  
                BackgroundRepeat.NO_REPEAT,  
                BackgroundPosition.DEFAULT,  
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true));
        root.setBackground(new Background(backgroundimage));
        root.setGridLinesVisible(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.setFullScreen(true);
        primaryStage.setResizable(false);
        primaryStage.show();
        applyAnimation(root,sun);
    	}
    	catch(Exception e){
    		System.out.println(e.getMessage());
    	}
    }
}