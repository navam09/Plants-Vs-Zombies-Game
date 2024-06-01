package com.PvZ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Loading extends Pane {

    private Timeline timeline = new Timeline();
    private Timeline timeline1 = new Timeline();
    

    public Loading(int width, int height, Runnable action) throws FileNotFoundException {
        ImageView bg = new ImageView(new Image(new FileInputStream("pvz_demo.jpg")));
        bg.setFitWidth(width);
        bg.setFitHeight(height);

        Node symbol = makeSymbol();
        symbol.setTranslateX(width - 750);
        symbol.setTranslateY(height - 100);

        timeline.setOnFinished(e -> {
            try {
				getChildren().setAll(new PromptUser(1367, 768, () -> {
					//masker.setOpacity(0);
				    getChildren().setAll(bg);
				}));
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
        });

        getChildren().addAll(bg,symbol);
    }

    private Node makeSymbol() {
        Pane symbol = new Pane();

        GaussianBlur blur = new GaussianBlur(2.5);
        symbol.setEffect(blur);

        Rectangle outer = new Rectangle(-80,-5,410,40);
        outer.setFill(Color.WHITE);
        
        Rectangle inner = new Rectangle(-75,0,400,30);
        inner.setFill(Color.BLACK);
        
        Rectangle rec = new Rectangle(-75,0,10,30);
        rec.setFill(Color.WHITE);
        rec.setStroke(Color.BLACK);        
        
        Rectangle top = new Rectangle(90, 5, Color.GREEN);
        top.setArcWidth(25);
        top.setArcHeight(25);

        Rectangle mid = new Rectangle(120, 5, Color.GREEN);
        mid.setArcWidth(25);
        mid.setArcHeight(25);

        Rectangle bot = new Rectangle(90, 5, Color.GREEN);
        bot.setArcWidth(25);
        bot.setArcHeight(25);

        top.setTranslateX(615);
        mid.setTranslateX(600);
        bot.setTranslateX(615);

        top.setTranslateY(10);
        mid.setTranslateY(10 + 10 + 5);
        bot.setTranslateY(10 + 10 + 5 + 10 + 5);

        Circle circle = new Circle(35, 35, 35, Color.BLACK);
        circle.setStroke(Color.GREEN);
        circle.setStrokeWidth(2);
        circle.setTranslateX(625);

        Circle circle2 = new Circle(35, 35, 35, Color.BLACK);
        circle2.setStroke(Color.GREEN);
        circle2.setStrokeWidth(1);
        circle2.setTranslateX(625);
        circle2.setRadius(2);

        Circle point = new Circle(35, 35, 35, Color.GREEN);
        point.setStroke(Color.GREEN);
        point.setStrokeWidth(1);
        point.setTranslateX(625);
        point.setRadius(1);

        KeyFrame frame = new KeyFrame(Duration.seconds(0.1),
                new KeyValue(circle2.radiusProperty(), 20));
        
        KeyFrame frame1 = new KeyFrame(Duration.seconds(0.1),
                new KeyValue(rec.widthProperty(), 400));
        
        timeline.getKeyFrames().addAll(frame1);
        timeline1.getKeyFrames().addAll(frame);
//        timeline.getKeyFrames().add(frame1);
        timeline.setCycleCount(1);
        timeline1.setCycleCount(5);
        timeline.play();
        timeline1.play();

        symbol.getChildren().addAll(top, mid, bot, circle, circle2, point,outer,inner,rec);
        return symbol;
    }
}