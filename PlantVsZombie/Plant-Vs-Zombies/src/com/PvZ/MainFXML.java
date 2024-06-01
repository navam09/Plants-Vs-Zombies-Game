package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
    public static int level = 1;
//    @FXML
//    public AnchorPane anchor;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1366, 768));
//        Controller controller = FXMLLoader.load(getClass().getResource("sample.fxml")).(Controller);
        if(level==1){
//            root
        }
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
