package com.PvZ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;


	public class PromptUser extends Pane {

	//    private Timeline timeline = new Timeline();
		private static final double BLUR_AMOUNT = 10;

	    private static final Effect frostEffect =
	        new BoxBlur(BLUR_AMOUNT, BLUR_AMOUNT, 3);

	    public PromptUser(int width, int height, Runnable action) throws FileNotFoundException {
	  
	    	ImageView bg = new ImageView(new Image(new FileInputStream("pvzgw.jpg")));
	        bg.setFitWidth(width);
	        bg.setFitHeight(height);
	        
	        Media mclick=new Media(getClass().getResource("MouseHover.mp3").toExternalForm());
	        MediaPlayer click=new MediaPlayer(mclick);

//	        timeline.setOnFinished(e -> action.run());
	        
	        ImageView loadgame= new ImageView(new Image(new FileInputStream("loadgame.png")));
	        loadgame.setTranslateX(400);
	        loadgame.setTranslateY(570);
	        loadgame.setFitWidth(500);
	        loadgame.setFitHeight(135);
	    	
	        ImageView newgame= new ImageView(new Image(new FileInputStream("newgame.png")));
	        newgame.setTranslateX(400);
	        newgame.setTranslateY(440);
	        newgame.setFitWidth(500);
	    	newgame.setFitHeight(135);

	        ImageView exit= new ImageView(new Image(new FileInputStream("exit.png")));
	        exit.setTranslateX(1200);
	        exit.setTranslateY(570);
	        exit.setFitWidth(50);
	    	exit.setFitHeight(50);
	    	
	    	
	    	Pane newAsk=new Pane();
	    	ImageView wooden=new ImageView(new Image(new FileInputStream("textbox.png")));
	    	wooden.setFitWidth(800);
	    	wooden.setFitHeight(700);
	    	wooden.setTranslateX(-160);
	    	wooden.setTranslateY(-250);
	    	newAsk.setTranslateX(440);
	    	newAsk.setTranslateY(260);
	    	newAsk.setVisible(false);
	    	
	    	TextField text = new TextField();
	    	text.setPrefSize(420,40);
	    	text.setFont(Font.font(java.awt.Font.MONOSPACED,FontWeight.BOLD,FontPosture.ITALIC,29));
	    	text.setStyle("-fx-background-color: rgba(150,75,0,0); -fx-text-fill: burlywood;");
	    	text.setTranslateX(45);
	    	text.setTranslateY(90);
	    	text.setAlignment(Pos.CENTER_LEFT);
	    	
	    	ImageView ok=new ImageView(new Image(new FileInputStream("ok.png")));
	    	ImageView cancel=new ImageView(new Image(new FileInputStream("cancel.png")));
	    	ok.setTranslateX(-278);
	    	ok.setTranslateY(-91);
	    	cancel.setTranslateX(-40);
	    	cancel.setTranslateY(-75);
	    	
	    	newgame.setOnMouseClicked(e -> {
	        	new MediaPlayer(new Media(getClass().getResource("MouseClick.mp3").toExternalForm())).play();
	    		bg.setEffect(frostEffect);
		    	newAsk.setVisible(true);
	    		getChildren().setAll(bg,newAsk);
		    	ok.setOnMouseClicked(e1 -> {
		        	new MediaPlayer(new Media(getClass().getResource("MouseClick.mp3").toExternalForm())).play();
		    		try {
						getChildren().setAll(new welcome(1367, 768, text.getText(),() -> {
							getChildren().setAll(bg);
						}));
					} catch (FileNotFoundException e2) {
						e2.printStackTrace();
					}
		    		System.out.println("ok");
		    	});
		    	cancel.setOnMouseClicked(e1-> {
		        	new MediaPlayer(new Media(getClass().getResource("MouseClick.mp3").toExternalForm())).play();
		    		bg.setEffect(new BoxBlur(BLUR_AMOUNT, BLUR_AMOUNT, 0));
		    		newAsk.setVisible(false);
		    		getChildren().setAll(bg,loadgame,newgame,exit);
		    	});
	    	});

	    	loadgame.setOnMouseClicked(e -> {
	        	new MediaPlayer(new Media(getClass().getResource("MouseClick.mp3").toExternalForm())).play();
	    		bg.setEffect(frostEffect);
		    	newAsk.setVisible(true);
		    	ok.setOnMouseClicked(e1 -> {
		        	new MediaPlayer(new Media(getClass().getResource("MouseClick.mp3").toExternalForm())).play();
		    		try {
						getChildren().setAll(new welcome(1367, 768, text.getText(),() -> {
							loadgame.setVisible(true);
							newgame.setVisible(true);
							exit.setVisible(true);
							bg.setEffect(new BoxBlur(BLUR_AMOUNT, BLUR_AMOUNT, 0));
							newAsk.setVisible(false);
							getChildren().setAll(bg,loadgame,newgame,exit);
							System.out.println("sds");
						}));
					} catch (FileNotFoundException e2) {
						e2.printStackTrace();
					}
		    		System.out.println("ok");
		    	});
		    	cancel.setOnMouseClicked(e1-> {
		        	new MediaPlayer(new Media(getClass().getResource("MouseClick.mp3").toExternalForm())).play();
		    		bg.setEffect(new BoxBlur(BLUR_AMOUNT, BLUR_AMOUNT, 0));
		    		newAsk.setVisible(false);
		    		getChildren().setAll(bg,loadgame,newgame,exit);
		    	});
	    		getChildren().setAll(bg,newAsk);
	    	});
	    	
	    	newAsk.getChildren().addAll(wooden,text,ok,cancel);	    	
//	        newgame.setEffect(new DropShadow(300,Color.RED));
	    	
//	    	TextField b = new TextField("initial text");
//	        b.setStyle("bb");
//	        b.setPrefSize(1000, 100);
//	        b.setTranslateX(500);
//	        b.setTranslateY(50);
	       
//	        b.setFont(Font.font(java.awt.Font.SANS_SERIF,FontWeight.BOLD, 70));
//	        b.setFont(Font.);
//	        b.setBackground(new Background(new BackgroundImage(new Image(new FileInputStream("start_screen.jpg")),
//	         null, null,null, new BackgroundSize(10,10, true, true, true, true))));
//	        b.setBlendMode(null);
//	        b.setAlignment(Pos.CENTER);
//	        TilePane r = new TilePane();
//	        Label l = new Label("no text");
//	        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
//	            public void handle(ActionEvent e)
//	            {
//	                l.setText(b.getText());
//	            }
//	        };
	 
//	        b.setOnAction(event);
//	        getChildren().add(b);
//	        r.getChildren().add(l);
//	        getChildren().add(r);


	    	loadgame.setOnMouseEntered((MouseEvent e) -> {
	    		loadgame.setFitWidth(510);
	    		loadgame.setFitHeight(140);
	        	click.seek(new Duration(0));
	    		click.play();
	        });
	        newgame.setOnMouseEntered((MouseEvent e) -> {
	        	newgame.setFitWidth(510);
	        	newgame.setFitHeight(140);
	        	click.seek(new Duration(0));
	        	click.play();
	        });
	        exit.setOnMouseEntered((MouseEvent e) -> {
	        	exit.setFitWidth(52);
	        	exit.setFitHeight(52);
	        	click.seek(new Duration(0));
	        	click.play();
	        });
	        
	        loadgame.setOnMouseExited((MouseEvent e) -> {
	        	loadgame.setFitWidth(500);
	        	loadgame.setFitHeight(135);
	        });
	        newgame.setOnMouseExited((MouseEvent e) -> {
	            newgame.setFitWidth(500);
	        	newgame.setFitHeight(135);
	        });
	        exit.setOnMouseExited((MouseEvent e) -> {
	            exit.setFitWidth(50);
	        	exit.setFitHeight(50);
	        });
	        
	        exit.setOnMouseClicked((MouseEvent e) -> {
	        	new MediaPlayer(new Media(getClass().getResource("MouseClick.mp3").toExternalForm())).play();
	        	System.exit(0);
	        });
	        getChildren().addAll(bg,loadgame,newgame,exit,newAsk);
	    }
	}