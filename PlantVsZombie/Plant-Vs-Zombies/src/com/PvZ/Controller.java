//package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Bounds;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;
import sample.Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Controller {
    public AnchorPane anchor;
    @FXML
    private Button button;
    @FXML
    void onClicked(MouseEvent event) {
        System.out.println("hi hi");
    }
    @FXML
    private ImageView background ;

    @FXML
    private ImageView mower1 = new ImageView(new Image(new FileInputStream("lawn_mower.gif")));
    @FXML
    private ImageView mower2 = new ImageView(new Image(new FileInputStream("lawn_mower.gif")));
    @FXML
    private ImageView mower3 = new ImageView(new Image(new FileInputStream("lawn_mower.gif")));
    @FXML
    private ImageView mower4 = new ImageView(new Image(new FileInputStream("lawn_mower.gif")));
    @FXML
    private ImageView mower5 = new ImageView(new Image(new FileInputStream("lawn_mower.gif")));
    private boolean mower[]=new boolean[5];
    private ImageView mowerList[]=new ImageView[]{mower1,mower2,mower3,mower4,mower5};
    private Bounds boundList[]=new Bounds[]{mower1.getBoundsInParent(),mower2.getBoundsInParent(),mower3.getBoundsInParent(),mower4.getBoundsInParent(),mower5.getBoundsInParent()};

    @FXML
    Text sunToken;
    private Bounds exist[][]=new Bounds[5][9];
    @FXML
    private  ImageView box1  = new ImageView();
    @FXML
    private  ImageView box2 = new ImageView();
    @FXML
    private ImageView box3 = new ImageView();
    @FXML
    private ImageView box4 = new ImageView();
    @FXML
    private ImageView box5 = new ImageView();
    @FXML
    private ImageView box6 = new ImageView();
    @FXML
    private ImageView box7 = new ImageView();
    @FXML
    private ImageView box8 = new ImageView();
    @FXML
    private ImageView box9 = new ImageView();
    @FXML
    private ImageView box10 = new ImageView();
    @FXML
    private ImageView box11 = new ImageView();
    @FXML
    private ImageView box12= new ImageView();
    @FXML
    private ImageView box13= new ImageView();
    @FXML
    private ImageView box14 = new ImageView();
    @FXML
    private ImageView box15 = new ImageView();
    @FXML
    private ImageView box16 = new ImageView();
    @FXML
    private ImageView box17= new ImageView();
    @FXML
    private ImageView box18= new ImageView();
    @FXML
    private ImageView box19 = new ImageView();
    @FXML
    private ImageView box20 = new ImageView();
    @FXML
    private ImageView box21  = new ImageView();
    @FXML
    private ImageView box22  = new ImageView();
    @FXML
    private ImageView box23  = new ImageView();
    @FXML
    private ImageView box24  = new ImageView();
    @FXML
    private ImageView box25  = new ImageView();
    @FXML
    private ImageView box26  = new ImageView();
    @FXML
    private ImageView box27  = new ImageView();
    @FXML
    private ImageView box28  = new ImageView();
    @FXML
    private ImageView box29  = new ImageView();
    @FXML
    private ImageView box30  = new ImageView();
    @FXML
    private ImageView box31  = new ImageView();
    @FXML
    private ImageView box32  = new ImageView();
    @FXML
    private ImageView box33  = new ImageView();
    @FXML
    private ImageView box34  = new ImageView();
    @FXML
    private ImageView box35  = new ImageView();
    @FXML
    private ImageView box36  = new ImageView();
    @FXML
    private ImageView box37  = new ImageView();
    @FXML
    private ImageView box38  = new ImageView();
    @FXML
    private ImageView box39  = new ImageView();
    @FXML
    private ImageView box40  = new ImageView();
    @FXML
    private ImageView box41  = new ImageView();
    @FXML
    private ImageView box42  = new ImageView();
    @FXML
    private ImageView box43  = new ImageView();
    @FXML
    private ImageView box44  = new ImageView();
    @FXML
    private ImageView box45  = new ImageView();

    @FXML
    private ImageView iv1  = new ImageView(new Image(new FileInputStream("Peashooter.gif"))); // peashooter
    @FXML
    private ImageView iv2 = new ImageView(new Image(new FileInputStream("sunflower.gif"))); //sunflower
    @FXML
    private ImageView iv3 = new ImageView(new Image(new FileInputStream("potatomine.gif"))); //potatomine
    @FXML
    private ImageView iv4 = new ImageView(new Image(new FileInputStream("sunshroom.gif"))); //sunshroom
    @FXML
    private ImageView iv5 = new ImageView(new Image(new FileInputStream("WallnutPvZ2.gif"))); //Wallnut

    private ImageView zom4  = new ImageView(new Image(new FileInputStream("bucket_z.gif")));

    private ImageView zom3 = new ImageView(new Image(new FileInputStream("Conehead_z.gif")));

    private ImageView zom5 = new ImageView(new Image(new FileInputStream("football_z.gif")));

    private ImageView zom2 = new ImageView(new Image(new FileInputStream("normal_z.gif")));

    private ImageView zom1 = new ImageView(new Image(new FileInputStream("normal_z.gif")));


    ImageView Sun =new ImageView(new Image(new FileInputStream("Sun2.png")));
    ImageView[] zombies = new ImageView[]{zom1,zom2,zom3,zom4,zom5};
    ImageView[] row1 = new ImageView[]{ box1, box6, box11, box16, box21, box26, box31, box36, box41 };
    ImageView[] row2 = new ImageView[]{ box2, box7, box12, box17, box22, box27, box32, box37, box42 };
    ImageView[] row3 = new ImageView[]{ box3, box8, box13, box18, box23, box28, box33, box38, box43 };
    ImageView[] row4 = new ImageView[]{ box4, box9, box14, box19, box24, box29, box34, box39, box44 };
    ImageView[] row5 = new ImageView[]{ box5, box10, box15, box20, box25, box30, box35, box40, box45 };
    ImageView[][] rows = new ImageView[][]{row1,row2,row3,row4,row5};
    int x = Main.level;
    int[] ys = new int[]{38-23,167-23,305-23,420-23,551-23};
    Timer zombie_spawner = new Timer();
    Timer sun_spawner = new Timer();
    private synchronized void  call(){
        for(int i=0;i<5;i++){
            System.out.println(mowerList[i].getBoundsInLocal());
        }
        sun_spawner.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        Random rand = new Random();
                        int xstart= rand.nextInt(1000 )+260;
                        int ystart = -100;
                        int yend = 760;
                        TranslateTransition trans = new TranslateTransition();
                        ImageView sun = new ImageView();
                        sun.setImage(Sun.getImage());
                        sun.setTranslateX(xstart);
                        sun.setTranslateY(ystart);
                        trans.setFromY(sun.getTranslateY());
                        trans.setToY(yend);
                        trans.setNode(sun);
                        trans.setDuration(Duration.seconds(10));
                        trans.setCycleCount(1);
                        trans.play();
                        sun.setOnMouseClicked(e -> {
                            sun.setVisible(false);
                            sunToken.setText(Integer.toString(Integer.parseInt(sunToken.getText())+25));
                        });
                        anchor.getChildren().add(sun);
                    }
                });
            }
        },0,5000);
        zombie_spawner.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        TranslateTransition trans = new TranslateTransition();
                        Random rand = new Random();
                        ImageView zombie = new ImageView(zombies[rand.nextInt(Main.level)].getImage());
                        int xcord = 1358;
                        int r = rand.nextInt(5);
                        int ycord = ys[r];
                        ImageView[] row = rows[r];
                        zombie.setFitHeight(138);
                        zombie.setFitWidth(128);
                        zombie.setTranslateX(xcord);
                        zombie.setTranslateY(ycord);
                        trans.setFromX(zombie.getTranslateX());
                        trans.setToX(-600);
                        trans.setNode(zombie);
                        trans.setDuration(Duration.seconds(20));
                        trans.setCycleCount(1);
                        trans.play();
                        zombie.translateXProperty().addListener( o -> {
                            if(zombie.getBoundsInParent().getMinX()<250){
                                System.out.println("stopped");
                                trans.stop();
                            }
                            for(int i=0;i<row.length;i++){
                                if(exist[r][i]!=null && exist[r][i].intersects(zombie.getBoundsInParent())){
                                    System.out.println("true");
                                    trans.stop();
                                }
                            }
                            for(int i=0; i<5; i++){
                                if(mower[i] && boundList[i].intersects(zombie.getBoundsInParent())){
                                    zombie.setVisible(false);
                                    mower[i]=false;
                                    mowerList[i].setVisible(false);
                                }
                            }

                        });
                        anchor.getChildren().add(zombie);
                        System.out.println("zombie @ " + zombie.getTranslateX() + " " + zombie.getTranslateY());
                    }
                });

            }
        }, 0, 5000 );
        mower1.setVisible(true);
        mower2.setVisible(true);
        mower3.setVisible(true);
        mower4.setVisible(true);
        mower5.setVisible(true);

        if(x==1){
            iv1.setVisible(true);
            iv2.setVisible(true);
            iv3.setVisible(false);
            iv4.setVisible(false);
            iv5.setVisible(false);
        }
        else if(x==2){
            iv1.setVisible(true);
            iv2.setVisible(true);
            iv3.setVisible(false);
            iv4.setVisible(false);
            iv5.setVisible(true);
        }
        else if(x==3){
            iv1.setVisible(true);
            iv2.setVisible(true);
            iv3.setVisible(true);
            iv4.setVisible(false);
            iv5.setVisible(false);
        }
        else {
            iv1.setVisible(true);
            iv2.setVisible(true);
            iv3.setVisible(true);
            iv4.setVisible(true);
            iv5.setVisible(true);
        }
    }
    @FXML
    void initialize()
    {
        call();
    }

    @FXML
    private Rectangle rect1;

    @FXML
    private Rectangle rect2;
    Timeline t1 = new Timeline();
    @FXML
    void photoClicked(MouseEvent event) {
//        System.out.println(iv1.getBoundsInParent());
        KeyFrame f1 = new KeyFrame(Duration.seconds(7), e -> {
            if(rect1.getBoundsInParent().intersects(rect1.getBoundsInParent())){

                System.out.println(rect1.getBoundsInParent().getMaxX()-rect1.getBoundsInParent().getMinX());

//                    this.stop();
            }

        },new KeyValue(rect1.translateXProperty(),1000));

//         Timeline t2 = new Timeline()
        System.out.println(rect1.getBoundsInParent() );
        t1.getKeyFrames().add(f1);

        t1.setCycleCount(1);
        t1.play();
        System.out.println(t1.getStatus());
    }


    @FXML
    void photo2(MouseEvent event) {

    }
    @FXML
    void dragDet(MouseEvent event) {
        Dragboard db = null;
        ClipboardContent content = null;
        if(event.getSource()==iv1) {
            db = iv1.startDragAndDrop(TransferMode.ANY);
            content = new ClipboardContent();
            content.putString(iv1.getImage().toString());
        }
        else if(event.getSource()==iv2) {
            db = iv2.startDragAndDrop(TransferMode.ANY);
            content = new ClipboardContent();
            content.putString(iv2.getImage().toString());

        }
        else if(event.getSource()==iv3) {
            db = iv3.startDragAndDrop(TransferMode.ANY);
            content = new ClipboardContent();
            content.putString(iv3.getImage().toString());

        }
        else if(event.getSource()==iv4) {
            db = iv4.startDragAndDrop(TransferMode.ANY);
            content = new ClipboardContent();
            content.putString(iv4.getImage().toString());

        }
        else if(event.getSource()==iv5) {
            db = iv5.startDragAndDrop(TransferMode.ANY);
            content = new ClipboardContent();
            content.putString(iv5.getImage().toString());

        }
        if(db!=null && content!=null){
            db.setContent(content);
//        System.out.println(db.getString());
//        System.out.println("onDragDetected");

            event.consume();}
    };

    @FXML
    void dragOver(DragEvent event) {
        /* data is dragged over the target */
//        System.out.println("onDragOver");

        /* accept it only if it is  not dragged from the same node
         * and if it has a string data */
        if (event.getGestureSource() != box1 &&
                event.getDragboard().hasString()) {
            /* allow for both copying and moving, whatever user chooses */
            event.acceptTransferModes(TransferMode.ANY);
        }

        event.consume();
    };

    @FXML
    void dragEntered(DragEvent event) {
        /* the drag-and-drop gesture entered the target */
//        System.out.println("onDragEntered");
        /* show to the user that it is an actual gesture target */
        if (event.getGestureSource() != box1 &&
                event.getDragboard().hasString()) {
        }

        event.consume();
    };

    @FXML
    void dragExited(DragEvent event){
        if(event.getGestureTarget()==box1) {
            if(event.getGestureSource()==iv1) {
                if(box1.getImage()==null)	{box1.setImage(iv1.getImage()); exist[0][0] = box1.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box1.getImage()==null)	{box1.setImage(iv2.getImage()); exist[0][0] = box1.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box1.getImage()==null)	{box1.setImage(iv3.getImage()); exist[0][0] = box1.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box1.getImage()==null)	{box1.setImage(iv4.getImage()); exist[0][0] = box1.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box1.getImage()==null)	{box1.setImage(iv5.getImage()); exist[0][0] = box1.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box2) {
            if(event.getGestureSource()==iv1) {
                if(box2.getImage()==null)	{box2.setImage(iv1.getImage()); exist[1][0] = box2.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box2.getImage()==null)	{box2.setImage(iv2.getImage()); exist[1][0] = box2.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box2.getImage()==null)	{box2.setImage(iv3.getImage()); exist[1][0] = box2.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box2.getImage()==null)	{box2.setImage(iv4.getImage()); exist[1][0] = box2.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box2.getImage()==null)	{box2.setImage(iv5.getImage()); exist[1][0] = box2.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box3) {
            if(event.getGestureSource()==iv1) {
                if(box3.getImage()==null)	{box3.setImage(iv1.getImage()); exist[2][0] = box3.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box3.getImage()==null)	{box3.setImage(iv2.getImage()); exist[2][0] = box3.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box3.getImage()==null)	{box3.setImage(iv3.getImage()); exist[2][0] = box3.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box3.getImage()==null)	{box3.setImage(iv4.getImage()); exist[2][0] = box3.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box3.getImage()==null)	{box3.setImage(iv5.getImage()); exist[2][0] = box3.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box4) {
            if(event.getGestureSource()==iv1) {
                if(box4.getImage()==null)	{box4.setImage(iv1.getImage()); exist[3][0] = box4.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box4.getImage()==null)	{box4.setImage(iv2.getImage()); exist[3][0] = box4.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box4.getImage()==null)	{box4.setImage(iv3.getImage()); exist[3][0] = box4.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box4.getImage()==null)	{box4.setImage(iv4.getImage()); exist[3][0] = box4.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box4.getImage()==null)	{box4.setImage(iv5.getImage()); exist[3][0] = box4.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box5) {
            if(event.getGestureSource()==iv1) {
                if(box5.getImage()==null)	{box5.setImage(iv1.getImage()); exist[4][0] = box5.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box5.getImage()==null)	{box5.setImage(iv2.getImage()); exist[4][0] = box5.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box5.getImage()==null)	{box5.setImage(iv3.getImage()); exist[4][0] = box5.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box5.getImage()==null)	{box5.setImage(iv4.getImage()); exist[4][0] = box5.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box5.getImage()==null)	{box5.setImage(iv5.getImage()); exist[4][0] = box5.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box6) {
            if(event.getGestureSource()==iv1) {
                if(box6.getImage()==null)	{box6.setImage(iv1.getImage()); exist[0][1] = box6.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box6.getImage()==null)	{box6.setImage(iv2.getImage()); exist[0][1] = box6.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box6.getImage()==null)	{box6.setImage(iv3.getImage()); exist[0][1] = box6.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box6.getImage()==null)	{box6.setImage(iv4.getImage()); exist[0][1] = box6.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box6.getImage()==null)	{box6.setImage(iv5.getImage()); exist[0][1] = box6.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box7) {
            if(event.getGestureSource()==iv1) {
                if(box7.getImage()==null)	{box7.setImage(iv1.getImage()); exist[1][1] = box7.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box7.getImage()==null)	{box7.setImage(iv2.getImage()); exist[1][1] = box7.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box7.getImage()==null)	{box7.setImage(iv3.getImage()); exist[1][1] = box7.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box7.getImage()==null)	{box7.setImage(iv4.getImage()); exist[1][1] = box7.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box7.getImage()==null)	{box7.setImage(iv5.getImage()); exist[1][1] = box7.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box8) {
            if(event.getGestureSource()==iv1) {
                if(box8.getImage()==null)	{box8.setImage(iv1.getImage()); exist[2][1] = box8.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box8.getImage()==null)	{box8.setImage(iv2.getImage()); exist[2][1] = box8.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box8.getImage()==null)	{box8.setImage(iv3.getImage()); exist[2][1] = box8.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box8.getImage()==null)	{box8.setImage(iv4.getImage()); exist[2][1] = box8.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box8.getImage()==null)	{box8.setImage(iv5.getImage()); exist[2][1] = box8.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box9) {
            if(event.getGestureSource()==iv1) {
                if(box9.getImage()==null)	{box9.setImage(iv1.getImage()); exist[3][1] = box9.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box9.getImage()==null)	{box9.setImage(iv2.getImage()); exist[3][1] = box9.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box9.getImage()==null)	{box9.setImage(iv3.getImage()); exist[3][1] = box9.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box9.getImage()==null)	{box9.setImage(iv4.getImage()); exist[3][1] = box9.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box9.getImage()==null)	{box9.setImage(iv5.getImage()); exist[3][1] = box9.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box10) {
            if(event.getGestureSource()==iv1) {
                if(box10.getImage()==null)	{box10.setImage(iv1.getImage()); exist[4][1] = box10.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box10.getImage()==null)	{box10.setImage(iv2.getImage()); exist[4][1] = box10.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box10.getImage()==null)	{box10.setImage(iv3.getImage()); exist[4][1] = box10.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box10.getImage()==null)	{box10.setImage(iv4.getImage()); exist[4][1] = box10.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box10.getImage()==null)	{box10.setImage(iv5.getImage()); exist[4][1] = box10.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box11) {
            if(event.getGestureSource()==iv1) {
                if(box11.getImage()==null)	{box11.setImage(iv1.getImage()); exist[0][2] = box11.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box11.getImage()==null)	{box11.setImage(iv2.getImage()); exist[0][2] = box11.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box11.getImage()==null)	{box11.setImage(iv3.getImage()); exist[0][2] = box11.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box11.getImage()==null)	{box11.setImage(iv4.getImage()); exist[0][2] = box11.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box11.getImage()==null)	{box11.setImage(iv5.getImage()); exist[0][2] = box11.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box12) {
            if(event.getGestureSource()==iv1) {
                if(box12.getImage()==null)	{box12.setImage(iv1.getImage()); exist[1][2] = box12.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box12.getImage()==null)	{box12.setImage(iv2.getImage()); exist[1][2] = box12.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box12.getImage()==null)	{box12.setImage(iv3.getImage()); exist[1][2] = box12.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box12.getImage()==null)	{box12.setImage(iv4.getImage()); exist[1][2] = box12.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box12.getImage()==null)	{box12.setImage(iv5.getImage()); exist[1][2] = box12.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box13) {
            if(event.getGestureSource()==iv1) {
                if(box13.getImage()==null)	{box13.setImage(iv1.getImage()); exist[2][2] = box13.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box13.getImage()==null)	{box13.setImage(iv2.getImage()); exist[2][2] = box13.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box13.getImage()==null)	{box13.setImage(iv3.getImage()); exist[2][2] = box13.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box13.getImage()==null)	{box13.setImage(iv4.getImage()); exist[2][2] = box13.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box13.getImage()==null)	{box13.setImage(iv5.getImage()); exist[2][2] = box13.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box14) {
            if(event.getGestureSource()==iv1) {
                if(box14.getImage()==null)	{box14.setImage(iv1.getImage()); exist[3][2] = box14.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box14.getImage()==null)	{box14.setImage(iv2.getImage()); exist[3][2] = box14.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box14.getImage()==null)	{box14.setImage(iv3.getImage()); exist[3][2] = box14.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box14.getImage()==null)	{box14.setImage(iv4.getImage()); exist[3][2] = box14.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box14.getImage()==null)	{box14.setImage(iv5.getImage()); exist[3][2] = box14.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box15) {
            if(event.getGestureSource()==iv1) {
                if(box15.getImage()==null)	{box15.setImage(iv1.getImage()); exist[4][2] = box15.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box15.getImage()==null)	{box15.setImage(iv2.getImage()); exist[4][2] = box15.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box15.getImage()==null)	{box15.setImage(iv3.getImage()); exist[4][2] = box15.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box15.getImage()==null)	{box15.setImage(iv4.getImage()); exist[4][2] = box15.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box15.getImage()==null)	{box15.setImage(iv5.getImage()); exist[4][2] = box15.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box16) {
            if(event.getGestureSource()==iv1) {
                if(box16.getImage()==null)	{box16.setImage(iv1.getImage()); exist[0][3] = box16.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box16.getImage()==null)	{box16.setImage(iv2.getImage()); exist[0][3] = box16.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box16.getImage()==null)	{box16.setImage(iv3.getImage()); exist[0][3] = box16.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box16.getImage()==null)	{box16.setImage(iv4.getImage()); exist[0][3] = box16.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box16.getImage()==null)	{box16.setImage(iv5.getImage()); exist[0][3] = box16.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box17) {
            if(event.getGestureSource()==iv1) {
                if(box17.getImage()==null)	{box17.setImage(iv1.getImage()); exist[1][3] = box17.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box17.getImage()==null)	{box17.setImage(iv2.getImage()); exist[1][3] = box17.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box17.getImage()==null)	{box17.setImage(iv3.getImage()); exist[1][3] = box17.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box17.getImage()==null)	{box17.setImage(iv4.getImage()); exist[1][3] = box17.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box17.getImage()==null)	{box17.setImage(iv5.getImage()); exist[1][3] = box17.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box18) {
            if(event.getGestureSource()==iv1) {
                if(box18.getImage()==null)	{box18.setImage(iv1.getImage()); exist[2][3] = box18.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box18.getImage()==null)	{box18.setImage(iv2.getImage()); exist[2][3] = box18.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box18.getImage()==null)	{box18.setImage(iv3.getImage()); exist[2][3] = box18.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box18.getImage()==null)	{box18.setImage(iv4.getImage()); exist[2][3] = box18.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box18.getImage()==null)	{box18.setImage(iv5.getImage()); exist[2][3] = box18.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box19) {
            if(event.getGestureSource()==iv1) {
                if(box19.getImage()==null)	{box19.setImage(iv1.getImage()); exist[3][3] = box19.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box19.getImage()==null)	{box19.setImage(iv2.getImage()); exist[3][3] = box19.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box19.getImage()==null)	{box19.setImage(iv3.getImage()); exist[3][3] = box19.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box19.getImage()==null)	{box19.setImage(iv4.getImage()); exist[3][3] = box19.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box19.getImage()==null)	{box19.setImage(iv5.getImage()); exist[3][3] = box19.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box20) {
            if(event.getGestureSource()==iv1) {
                if(box20.getImage()==null)	{box20.setImage(iv1.getImage()); exist[4][3] = box20.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box20.getImage()==null)	{box20.setImage(iv2.getImage()); exist[4][3] = box20.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box20.getImage()==null)	{box20.setImage(iv3.getImage()); exist[4][3] = box20.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box20.getImage()==null)	{box20.setImage(iv4.getImage()); exist[4][3] = box20.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box20.getImage()==null)	{box20.setImage(iv5.getImage()); exist[4][3] = box20.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box21) {
            if(event.getGestureSource()==iv1) {
                if(box21.getImage()==null)	{box21.setImage(iv1.getImage()); exist[0][4] = box21.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box21.getImage()==null)	{box21.setImage(iv2.getImage()); exist[0][4] = box21.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box21.getImage()==null)	{box21.setImage(iv3.getImage()); exist[0][4] = box21.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box21.getImage()==null)	{box21.setImage(iv4.getImage()); exist[0][4] = box21.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box21.getImage()==null)	{box21.setImage(iv5.getImage()); exist[0][4] = box21.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box22) {
            if(event.getGestureSource()==iv1) {
                if(box22.getImage()==null)	{box22.setImage(iv1.getImage()); exist[1][4] = box22.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box22.getImage()==null)	{box22.setImage(iv2.getImage()); exist[1][4] = box22.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box22.getImage()==null)	{box22.setImage(iv3.getImage()); exist[1][4] = box22.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box22.getImage()==null)	{box22.setImage(iv4.getImage()); exist[1][4] = box22.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box22.getImage()==null)	{box22.setImage(iv5.getImage()); exist[1][4] = box22.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box23) {
            if(event.getGestureSource()==iv1) {
                if(box23.getImage()==null)	{box23.setImage(iv1.getImage()); exist[2][4] = box23.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box23.getImage()==null)	{box23.setImage(iv2.getImage()); exist[2][4] = box23.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box23.getImage()==null)	{box23.setImage(iv3.getImage()); exist[2][4] = box23.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box23.getImage()==null)	{box23.setImage(iv4.getImage()); exist[2][4] = box23.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box23.getImage()==null)	{box23.setImage(iv5.getImage()); exist[2][4] = box23.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box24) {
            if(event.getGestureSource()==iv1) {
                if(box24.getImage()==null)	{box24.setImage(iv1.getImage()); exist[3][4] = box24.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box24.getImage()==null)	{box24.setImage(iv2.getImage()); exist[3][4] = box24.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box24.getImage()==null)	{box24.setImage(iv3.getImage()); exist[3][4] = box24.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box24.getImage()==null)	{box24.setImage(iv4.getImage()); exist[3][4] = box24.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box24.getImage()==null)	{box24.setImage(iv5.getImage()); exist[3][4] = box24.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box25) {
            if(event.getGestureSource()==iv1) {
                if(box25.getImage()==null)	{box25.setImage(iv1.getImage()); exist[4][4] = box25.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box25.getImage()==null)	{box25.setImage(iv2.getImage()); exist[4][4] = box25.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box25.getImage()==null)	{box25.setImage(iv3.getImage()); exist[4][4] = box25.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box25.getImage()==null)	{box25.setImage(iv4.getImage()); exist[4][4] = box25.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box25.getImage()==null)	{box25.setImage(iv5.getImage()); exist[4][4] = box25.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box26) {
            if(event.getGestureSource()==iv1) {
                if(box26.getImage()==null)	{box26.setImage(iv1.getImage()); exist[0][5] = box26.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box26.getImage()==null)	{box26.setImage(iv2.getImage()); exist[0][5] = box26.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box26.getImage()==null)	{box26.setImage(iv3.getImage()); exist[0][5] = box26.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box26.getImage()==null)	{box26.setImage(iv4.getImage()); exist[0][5] = box26.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box26.getImage()==null)	{box26.setImage(iv5.getImage()); exist[0][5] = box26.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box27) {
            if(event.getGestureSource()==iv1) {
                if(box27.getImage()==null)	{box27.setImage(iv1.getImage()); exist[1][5] = box27.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box27.getImage()==null)	{box27.setImage(iv2.getImage()); exist[1][5] = box27.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box27.getImage()==null)	{box27.setImage(iv3.getImage()); exist[1][5] = box27.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box27.getImage()==null)	{box27.setImage(iv4.getImage()); exist[1][5] = box27.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box27.getImage()==null)	{box27.setImage(iv5.getImage()); exist[1][5] = box27.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box28) {
            if(event.getGestureSource()==iv1) {
                if(box28.getImage()==null)	{box28.setImage(iv1.getImage()); exist[2][5] = box28.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box28.getImage()==null)	{box28.setImage(iv2.getImage()); exist[2][5] = box28.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box28.getImage()==null)	{box28.setImage(iv3.getImage()); exist[2][5] = box28.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box28.getImage()==null)	{box28.setImage(iv4.getImage()); exist[2][5] = box28.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box28.getImage()==null)	{box28.setImage(iv5.getImage()); exist[2][5] = box28.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box29) {
            if(event.getGestureSource()==iv1) {
                if(box29.getImage()==null)	{box29.setImage(iv1.getImage()); exist[3][5] = box29.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box29.getImage()==null)	{box29.setImage(iv2.getImage()); exist[3][5] = box29.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box29.getImage()==null)	{box29.setImage(iv3.getImage()); exist[3][5] = box29.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box29.getImage()==null)	{box29.setImage(iv4.getImage()); exist[3][5] = box29.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box29.getImage()==null)	{box29.setImage(iv5.getImage()); exist[3][5] = box29.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box30) {
            if(event.getGestureSource()==iv1) {
                if(box30.getImage()==null)	{box30.setImage(iv1.getImage()); exist[4][5] = box30.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box30.getImage()==null)	{box30.setImage(iv2.getImage()); exist[4][5] = box30.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box30.getImage()==null)	{box30.setImage(iv3.getImage()); exist[4][5] = box30.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box30.getImage()==null)	{box30.setImage(iv4.getImage()); exist[4][5] = box30.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box30.getImage()==null)	{box30.setImage(iv5.getImage()); exist[4][5] = box30.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box31) {
            if(event.getGestureSource()==iv1) {
                if(box31.getImage()==null)	{box31.setImage(iv1.getImage()); exist[0][6] = box31.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box31.getImage()==null)	{box31.setImage(iv2.getImage()); exist[0][6] = box31.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box31.getImage()==null)	{box31.setImage(iv3.getImage()); exist[0][6] = box31.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box31.getImage()==null)	{box31.setImage(iv4.getImage()); exist[0][6] = box31.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box31.getImage()==null)	{box31.setImage(iv5.getImage()); exist[0][6] = box31.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box32) {
            if(event.getGestureSource()==iv1) {
                if(box32.getImage()==null)	{box32.setImage(iv1.getImage()); exist[1][6] = box32.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box32.getImage()==null)	{box32.setImage(iv2.getImage()); exist[1][6] = box32.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box32.getImage()==null)	{box32.setImage(iv3.getImage()); exist[1][6] = box32.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box32.getImage()==null)	{box32.setImage(iv4.getImage()); exist[1][6] = box32.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box32.getImage()==null)	{box32.setImage(iv5.getImage()); exist[1][6] = box32.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box33) {
            if(event.getGestureSource()==iv1) {
                if(box33.getImage()==null)	{box33.setImage(iv1.getImage()); exist[2][6] = box33.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box33.getImage()==null)	{box33.setImage(iv2.getImage()); exist[2][6] = box33.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box33.getImage()==null)	{box33.setImage(iv3.getImage()); exist[2][6] = box33.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box33.getImage()==null)	{box33.setImage(iv4.getImage()); exist[2][6] = box33.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box33.getImage()==null)	{box33.setImage(iv5.getImage()); exist[2][6] = box33.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box34) {
            if(event.getGestureSource()==iv1) {
                if(box34.getImage()==null)	{box34.setImage(iv1.getImage()); exist[3][6] = box34.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box34.getImage()==null)	{box34.setImage(iv2.getImage()); exist[3][6] = box34.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box34.getImage()==null)	{box34.setImage(iv3.getImage()); exist[3][6] = box34.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box34.getImage()==null)	{box34.setImage(iv4.getImage()); exist[3][6] = box34.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box34.getImage()==null)	{box34.setImage(iv5.getImage()); exist[3][6] = box34.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box35) {
            if(event.getGestureSource()==iv1) {
                if(box35.getImage()==null)	{box35.setImage(iv1.getImage()); exist[4][6] = box35.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box35.getImage()==null)	{box35.setImage(iv2.getImage()); exist[4][6] = box35.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box35.getImage()==null)	{box35.setImage(iv3.getImage()); exist[4][6] = box35.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box35.getImage()==null)	{box35.setImage(iv4.getImage()); exist[4][6] = box35.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box35.getImage()==null)	{box35.setImage(iv5.getImage()); exist[4][6] = box35.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box36) {
            if(event.getGestureSource()==iv1) {
                if(box36.getImage()==null)	{box36.setImage(iv1.getImage()); exist[0][7] = box36.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box36.getImage()==null)	{box36.setImage(iv2.getImage()); exist[0][7] = box36.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box36.getImage()==null)	{box36.setImage(iv3.getImage()); exist[0][7] = box36.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box36.getImage()==null)	{box36.setImage(iv4.getImage()); exist[0][7] = box36.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box36.getImage()==null)	{box36.setImage(iv5.getImage()); exist[0][7] = box36.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box37) {
            if(event.getGestureSource()==iv1) {
                if(box37.getImage()==null)	{box37.setImage(iv1.getImage()); exist[1][7] = box37.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box37.getImage()==null)	{box37.setImage(iv2.getImage()); exist[1][7] = box37.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box37.getImage()==null)	{box37.setImage(iv3.getImage()); exist[1][7] = box37.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box37.getImage()==null)	{box37.setImage(iv4.getImage()); exist[1][7] = box37.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box37.getImage()==null)	{box37.setImage(iv5.getImage()); exist[1][7] = box37.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box38) {
            if(event.getGestureSource()==iv1) {
                if(box38.getImage()==null)	{box38.setImage(iv1.getImage()); exist[2][7] = box38.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box38.getImage()==null)	{box38.setImage(iv2.getImage()); exist[2][7] = box38.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box38.getImage()==null)	{box38.setImage(iv3.getImage()); exist[2][7] = box38.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box38.getImage()==null)	{box38.setImage(iv4.getImage()); exist[2][7] = box38.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box38.getImage()==null)	{box38.setImage(iv5.getImage()); exist[2][7] = box38.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box39) {
            if(event.getGestureSource()==iv1) {
                if(box39.getImage()==null)	{box39.setImage(iv1.getImage()); exist[3][7] = box39.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box39.getImage()==null)	{box39.setImage(iv2.getImage()); exist[3][7] = box39.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box39.getImage()==null)	{box39.setImage(iv3.getImage()); exist[3][7] = box39.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box39.getImage()==null)	{box39.setImage(iv4.getImage()); exist[3][7] = box39.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box39.getImage()==null)	{box39.setImage(iv5.getImage()); exist[3][7] = box39.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box40) {
            if(event.getGestureSource()==iv1) {
                if(box40.getImage()==null)	{box40.setImage(iv1.getImage()); exist[4][7] = box40.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box40.getImage()==null)	{box40.setImage(iv2.getImage()); exist[4][7] = box40.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box40.getImage()==null)	{box40.setImage(iv3.getImage()); exist[4][7] = box40.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box40.getImage()==null)	{box40.setImage(iv4.getImage()); exist[4][7] = box40.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box40.getImage()==null)	{box40.setImage(iv5.getImage()); exist[4][7] = box40.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box41) {
            if(event.getGestureSource()==iv1) {
                if(box41.getImage()==null)	{box41.setImage(iv1.getImage()); exist[0][8] = box41.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box41.getImage()==null)	{box41.setImage(iv2.getImage()); exist[0][8] = box41.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box41.getImage()==null)	{box41.setImage(iv3.getImage()); exist[0][8] = box41.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box41.getImage()==null)	{box41.setImage(iv4.getImage()); exist[0][8] = box41.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box41.getImage()==null)	{box41.setImage(iv5.getImage()); exist[0][8] = box41.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box42) {
            if(event.getGestureSource()==iv1) {
                if(box42.getImage()==null)	{box42.setImage(iv1.getImage()); exist[1][8] = box42.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box42.getImage()==null)	{box42.setImage(iv2.getImage()); exist[1][8] = box42.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box42.getImage()==null)	{box42.setImage(iv3.getImage()); exist[1][8] = box42.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box42.getImage()==null)	{box42.setImage(iv4.getImage()); exist[1][8] = box42.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box42.getImage()==null)	{box42.setImage(iv5.getImage()); exist[1][8] = box42.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box43) {
            if(event.getGestureSource()==iv1) {
                if(box43.getImage()==null)	{box43.setImage(iv1.getImage()); exist[2][8] = box43.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box43.getImage()==null)	{box43.setImage(iv2.getImage()); exist[2][8] = box43.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box43.getImage()==null)	{box43.setImage(iv3.getImage()); exist[2][8] = box43.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box43.getImage()==null)	{box43.setImage(iv4.getImage()); exist[2][8] = box43.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box43.getImage()==null)	{box43.setImage(iv5.getImage()); exist[2][8] = box43.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box44) {
            if(event.getGestureSource()==iv1) {
                if(box44.getImage()==null)	{box44.setImage(iv1.getImage()); exist[3][8] = box44.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box44.getImage()==null)	{box44.setImage(iv2.getImage()); exist[3][8] = box44.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box44.getImage()==null)	{box44.setImage(iv3.getImage()); exist[3][8] = box44.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box44.getImage()==null)	{box44.setImage(iv4.getImage()); exist[3][8] = box44.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box44.getImage()==null)	{box44.setImage(iv5.getImage()); exist[3][8] = box44.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box45) {
            if(event.getGestureSource()==iv1) {
                if(box45.getImage()==null)	{box45.setImage(iv1.getImage()); exist[4][8] = box45.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box45.getImage()==null)	{box45.setImage(iv2.getImage()); exist[4][8] = box45.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box45.getImage()==null)	{box45.setImage(iv3.getImage()); exist[4][8] = box45.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box45.getImage()==null)	{box45.setImage(iv4.getImage()); exist[4][8] = box45.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box45.getImage()==null)	{box45.setImage(iv5.getImage()); exist[4][8] = box45.getBoundsInParent() ;}
            }
        }
        event.consume();
    }

    @FXML
    void dragDropped(DragEvent event) {
        /* data dropped */
//        System.out.println("onDragDropped");
        /* if there is a string data on dragboard, read it and use it */
        Dragboard db = event.getDragboard();
        boolean success = false;
        if(event.getGestureTarget()==box1) {
            if(event.getGestureSource()==iv1) {
                if(box1.getImage()==null)	{box1.setImage(iv1.getImage()); exist[0][0] = box1.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box1.getImage()==null)	{box1.setImage(iv2.getImage()); exist[0][0] = box1.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box1.getImage()==null)	{box1.setImage(iv3.getImage()); exist[0][0] = box1.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box1.getImage()==null)	{box1.setImage(iv4.getImage()); exist[0][0] = box1.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box1.getImage()==null)	{box1.setImage(iv5.getImage()); exist[0][0] = box1.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box2) {
            if(event.getGestureSource()==iv1) {
                if(box2.getImage()==null)	{box2.setImage(iv1.getImage()); exist[1][0] = box2.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box2.getImage()==null)	{box2.setImage(iv2.getImage()); exist[1][0] = box2.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box2.getImage()==null)	{box2.setImage(iv3.getImage()); exist[1][0] = box2.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box2.getImage()==null)	{box2.setImage(iv4.getImage()); exist[1][0] = box2.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box2.getImage()==null)	{box2.setImage(iv5.getImage()); exist[1][0] = box2.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box3) {
            if(event.getGestureSource()==iv1) {
                if(box3.getImage()==null)	{box3.setImage(iv1.getImage()); exist[2][0] = box3.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box3.getImage()==null)	{box3.setImage(iv2.getImage()); exist[2][0] = box3.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box3.getImage()==null)	{box3.setImage(iv3.getImage()); exist[2][0] = box3.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box3.getImage()==null)	{box3.setImage(iv4.getImage()); exist[2][0] = box3.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box3.getImage()==null)	{box3.setImage(iv5.getImage()); exist[2][0] = box3.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box4) {
            if(event.getGestureSource()==iv1) {
                if(box4.getImage()==null)	{box4.setImage(iv1.getImage()); exist[3][0] = box4.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box4.getImage()==null)	{box4.setImage(iv2.getImage()); exist[3][0] = box4.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box4.getImage()==null)	{box4.setImage(iv3.getImage()); exist[3][0] = box4.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box4.getImage()==null)	{box4.setImage(iv4.getImage()); exist[3][0] = box4.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box4.getImage()==null)	{box4.setImage(iv5.getImage()); exist[3][0] = box4.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box5) {
            if(event.getGestureSource()==iv1) {
                if(box5.getImage()==null)	{box5.setImage(iv1.getImage()); exist[4][0] = box5.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box5.getImage()==null)	{box5.setImage(iv2.getImage()); exist[4][0] = box5.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box5.getImage()==null)	{box5.setImage(iv3.getImage()); exist[4][0] = box5.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box5.getImage()==null)	{box5.setImage(iv4.getImage()); exist[4][0] = box5.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box5.getImage()==null)	{box5.setImage(iv5.getImage()); exist[4][0] = box5.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box6) {
            if(event.getGestureSource()==iv1) {
                if(box6.getImage()==null)	{box6.setImage(iv1.getImage()); exist[0][1] = box6.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box6.getImage()==null)	{box6.setImage(iv2.getImage()); exist[0][1] = box6.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box6.getImage()==null)	{box6.setImage(iv3.getImage()); exist[0][1] = box6.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box6.getImage()==null)	{box6.setImage(iv4.getImage()); exist[0][1] = box6.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box6.getImage()==null)	{box6.setImage(iv5.getImage()); exist[0][1] = box6.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box7) {
            if(event.getGestureSource()==iv1) {
                if(box7.getImage()==null)	{box7.setImage(iv1.getImage()); exist[1][1] = box7.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box7.getImage()==null)	{box7.setImage(iv2.getImage()); exist[1][1] = box7.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box7.getImage()==null)	{box7.setImage(iv3.getImage()); exist[1][1] = box7.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box7.getImage()==null)	{box7.setImage(iv4.getImage()); exist[1][1] = box7.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box7.getImage()==null)	{box7.setImage(iv5.getImage()); exist[1][1] = box7.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box8) {
            if(event.getGestureSource()==iv1) {
                if(box8.getImage()==null)	{box8.setImage(iv1.getImage()); exist[2][1] = box8.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box8.getImage()==null)	{box8.setImage(iv2.getImage()); exist[2][1] = box8.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box8.getImage()==null)	{box8.setImage(iv3.getImage()); exist[2][1] = box8.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box8.getImage()==null)	{box8.setImage(iv4.getImage()); exist[2][1] = box8.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box8.getImage()==null)	{box8.setImage(iv5.getImage()); exist[2][1] = box8.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box9) {
            if(event.getGestureSource()==iv1) {
                if(box9.getImage()==null)	{box9.setImage(iv1.getImage()); exist[3][1] = box9.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box9.getImage()==null)	{box9.setImage(iv2.getImage()); exist[3][1] = box9.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box9.getImage()==null)	{box9.setImage(iv3.getImage()); exist[3][1] = box9.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box9.getImage()==null)	{box9.setImage(iv4.getImage()); exist[3][1] = box9.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box9.getImage()==null)	{box9.setImage(iv5.getImage()); exist[3][1] = box9.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box10) {
            if(event.getGestureSource()==iv1) {
                if(box10.getImage()==null)	{box10.setImage(iv1.getImage()); exist[4][1] = box10.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box10.getImage()==null)	{box10.setImage(iv2.getImage()); exist[4][1] = box10.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box10.getImage()==null)	{box10.setImage(iv3.getImage()); exist[4][1] = box10.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box10.getImage()==null)	{box10.setImage(iv4.getImage()); exist[4][1] = box10.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box10.getImage()==null)	{box10.setImage(iv5.getImage()); exist[4][1] = box10.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box11) {
            if(event.getGestureSource()==iv1) {
                if(box11.getImage()==null)	{box11.setImage(iv1.getImage()); exist[0][2] = box11.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box11.getImage()==null)	{box11.setImage(iv2.getImage()); exist[0][2] = box11.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box11.getImage()==null)	{box11.setImage(iv3.getImage()); exist[0][2] = box11.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box11.getImage()==null)	{box11.setImage(iv4.getImage()); exist[0][2] = box11.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box11.getImage()==null)	{box11.setImage(iv5.getImage()); exist[0][2] = box11.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box12) {
            if(event.getGestureSource()==iv1) {
                if(box12.getImage()==null)	{box12.setImage(iv1.getImage()); exist[1][2] = box12.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box12.getImage()==null)	{box12.setImage(iv2.getImage()); exist[1][2] = box12.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box12.getImage()==null)	{box12.setImage(iv3.getImage()); exist[1][2] = box12.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box12.getImage()==null)	{box12.setImage(iv4.getImage()); exist[1][2] = box12.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box12.getImage()==null)	{box12.setImage(iv5.getImage()); exist[1][2] = box12.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box13) {
            if(event.getGestureSource()==iv1) {
                if(box13.getImage()==null)	{box13.setImage(iv1.getImage()); exist[2][2] = box13.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box13.getImage()==null)	{box13.setImage(iv2.getImage()); exist[2][2] = box13.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box13.getImage()==null)	{box13.setImage(iv3.getImage()); exist[2][2] = box13.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box13.getImage()==null)	{box13.setImage(iv4.getImage()); exist[2][2] = box13.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box13.getImage()==null)	{box13.setImage(iv5.getImage()); exist[2][2] = box13.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box14) {
            if(event.getGestureSource()==iv1) {
                if(box14.getImage()==null)	{box14.setImage(iv1.getImage()); exist[3][2] = box14.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box14.getImage()==null)	{box14.setImage(iv2.getImage()); exist[3][2] = box14.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box14.getImage()==null)	{box14.setImage(iv3.getImage()); exist[3][2] = box14.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box14.getImage()==null)	{box14.setImage(iv4.getImage()); exist[3][2] = box14.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box14.getImage()==null)	{box14.setImage(iv5.getImage()); exist[3][2] = box14.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box15) {
            if(event.getGestureSource()==iv1) {
                if(box15.getImage()==null)	{box15.setImage(iv1.getImage()); exist[4][2] = box15.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box15.getImage()==null)	{box15.setImage(iv2.getImage()); exist[4][2] = box15.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box15.getImage()==null)	{box15.setImage(iv3.getImage()); exist[4][2] = box15.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box15.getImage()==null)	{box15.setImage(iv4.getImage()); exist[4][2] = box15.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box15.getImage()==null)	{box15.setImage(iv5.getImage()); exist[4][2] = box15.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box16) {
            if(event.getGestureSource()==iv1) {
                if(box16.getImage()==null)	{box16.setImage(iv1.getImage()); exist[0][3] = box16.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box16.getImage()==null)	{box16.setImage(iv2.getImage()); exist[0][3] = box16.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box16.getImage()==null)	{box16.setImage(iv3.getImage()); exist[0][3] = box16.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box16.getImage()==null)	{box16.setImage(iv4.getImage()); exist[0][3] = box16.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box16.getImage()==null)	{box16.setImage(iv5.getImage()); exist[0][3] = box16.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box17) {
            if(event.getGestureSource()==iv1) {
                if(box17.getImage()==null)	{box17.setImage(iv1.getImage()); exist[1][3] = box17.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box17.getImage()==null)	{box17.setImage(iv2.getImage()); exist[1][3] = box17.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box17.getImage()==null)	{box17.setImage(iv3.getImage()); exist[1][3] = box17.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box17.getImage()==null)	{box17.setImage(iv4.getImage()); exist[1][3] = box17.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box17.getImage()==null)	{box17.setImage(iv5.getImage()); exist[1][3] = box17.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box18) {
            if(event.getGestureSource()==iv1) {
                if(box18.getImage()==null)	{box18.setImage(iv1.getImage()); exist[2][3] = box18.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box18.getImage()==null)	{box18.setImage(iv2.getImage()); exist[2][3] = box18.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box18.getImage()==null)	{box18.setImage(iv3.getImage()); exist[2][3] = box18.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box18.getImage()==null)	{box18.setImage(iv4.getImage()); exist[2][3] = box18.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box18.getImage()==null)	{box18.setImage(iv5.getImage()); exist[2][3] = box18.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box19) {
            if(event.getGestureSource()==iv1) {
                if(box19.getImage()==null)	{box19.setImage(iv1.getImage()); exist[3][3] = box19.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box19.getImage()==null)	{box19.setImage(iv2.getImage()); exist[3][3] = box19.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box19.getImage()==null)	{box19.setImage(iv3.getImage()); exist[3][3] = box19.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box19.getImage()==null)	{box19.setImage(iv4.getImage()); exist[3][3] = box19.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box19.getImage()==null)	{box19.setImage(iv5.getImage()); exist[3][3] = box19.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box20) {
            if(event.getGestureSource()==iv1) {
                if(box20.getImage()==null)	{box20.setImage(iv1.getImage()); exist[4][3] = box20.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box20.getImage()==null)	{box20.setImage(iv2.getImage()); exist[4][3] = box20.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box20.getImage()==null)	{box20.setImage(iv3.getImage()); exist[4][3] = box20.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box20.getImage()==null)	{box20.setImage(iv4.getImage()); exist[4][3] = box20.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box20.getImage()==null)	{box20.setImage(iv5.getImage()); exist[4][3] = box20.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box21) {
            if(event.getGestureSource()==iv1) {
                if(box21.getImage()==null)	{box21.setImage(iv1.getImage()); exist[0][4] = box21.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box21.getImage()==null)	{box21.setImage(iv2.getImage()); exist[0][4] = box21.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box21.getImage()==null)	{box21.setImage(iv3.getImage()); exist[0][4] = box21.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box21.getImage()==null)	{box21.setImage(iv4.getImage()); exist[0][4] = box21.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box21.getImage()==null)	{box21.setImage(iv5.getImage()); exist[0][4] = box21.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box22) {
            if(event.getGestureSource()==iv1) {
                if(box22.getImage()==null)	{box22.setImage(iv1.getImage()); exist[1][4] = box22.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box22.getImage()==null)	{box22.setImage(iv2.getImage()); exist[1][4] = box22.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box22.getImage()==null)	{box22.setImage(iv3.getImage()); exist[1][4] = box22.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box22.getImage()==null)	{box22.setImage(iv4.getImage()); exist[1][4] = box22.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box22.getImage()==null)	{box22.setImage(iv5.getImage()); exist[1][4] = box22.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box23) {
            if(event.getGestureSource()==iv1) {
                if(box23.getImage()==null)	{box23.setImage(iv1.getImage()); exist[2][4] = box23.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box23.getImage()==null)	{box23.setImage(iv2.getImage()); exist[2][4] = box23.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box23.getImage()==null)	{box23.setImage(iv3.getImage()); exist[2][4] = box23.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box23.getImage()==null)	{box23.setImage(iv4.getImage()); exist[2][4] = box23.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box23.getImage()==null)	{box23.setImage(iv5.getImage()); exist[2][4] = box23.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box24) {
            if(event.getGestureSource()==iv1) {
                if(box24.getImage()==null)	{box24.setImage(iv1.getImage()); exist[3][4] = box24.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box24.getImage()==null)	{box24.setImage(iv2.getImage()); exist[3][4] = box24.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box24.getImage()==null)	{box24.setImage(iv3.getImage()); exist[3][4] = box24.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box24.getImage()==null)	{box24.setImage(iv4.getImage()); exist[3][4] = box24.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box24.getImage()==null)	{box24.setImage(iv5.getImage()); exist[3][4] = box24.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box25) {
            if(event.getGestureSource()==iv1) {
                if(box25.getImage()==null)	{box25.setImage(iv1.getImage()); exist[4][4] = box25.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box25.getImage()==null)	{box25.setImage(iv2.getImage()); exist[4][4] = box25.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box25.getImage()==null)	{box25.setImage(iv3.getImage()); exist[4][4] = box25.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box25.getImage()==null)	{box25.setImage(iv4.getImage()); exist[4][4] = box25.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box25.getImage()==null)	{box25.setImage(iv5.getImage()); exist[4][4] = box25.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box26) {
            if(event.getGestureSource()==iv1) {
                if(box26.getImage()==null)	{box26.setImage(iv1.getImage()); exist[0][5] = box26.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box26.getImage()==null)	{box26.setImage(iv2.getImage()); exist[0][5] = box26.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box26.getImage()==null)	{box26.setImage(iv3.getImage()); exist[0][5] = box26.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box26.getImage()==null)	{box26.setImage(iv4.getImage()); exist[0][5] = box26.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box26.getImage()==null)	{box26.setImage(iv5.getImage()); exist[0][5] = box26.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box27) {
            if(event.getGestureSource()==iv1) {
                if(box27.getImage()==null)	{box27.setImage(iv1.getImage()); exist[1][5] = box27.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box27.getImage()==null)	{box27.setImage(iv2.getImage()); exist[1][5] = box27.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box27.getImage()==null)	{box27.setImage(iv3.getImage()); exist[1][5] = box27.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box27.getImage()==null)	{box27.setImage(iv4.getImage()); exist[1][5] = box27.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box27.getImage()==null)	{box27.setImage(iv5.getImage()); exist[1][5] = box27.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box28) {
            if(event.getGestureSource()==iv1) {
                if(box28.getImage()==null)	{box28.setImage(iv1.getImage()); exist[2][5] = box28.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box28.getImage()==null)	{box28.setImage(iv2.getImage()); exist[2][5] = box28.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box28.getImage()==null)	{box28.setImage(iv3.getImage()); exist[2][5] = box28.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box28.getImage()==null)	{box28.setImage(iv4.getImage()); exist[2][5] = box28.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box28.getImage()==null)	{box28.setImage(iv5.getImage()); exist[2][5] = box28.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box29) {
            if(event.getGestureSource()==iv1) {
                if(box29.getImage()==null)	{box29.setImage(iv1.getImage()); exist[3][5] = box29.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box29.getImage()==null)	{box29.setImage(iv2.getImage()); exist[3][5] = box29.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box29.getImage()==null)	{box29.setImage(iv3.getImage()); exist[3][5] = box29.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box29.getImage()==null)	{box29.setImage(iv4.getImage()); exist[3][5] = box29.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box29.getImage()==null)	{box29.setImage(iv5.getImage()); exist[3][5] = box29.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box30) {
            if(event.getGestureSource()==iv1) {
                if(box30.getImage()==null)	{box30.setImage(iv1.getImage()); exist[4][5] = box30.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box30.getImage()==null)	{box30.setImage(iv2.getImage()); exist[4][5] = box30.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box30.getImage()==null)	{box30.setImage(iv3.getImage()); exist[4][5] = box30.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box30.getImage()==null)	{box30.setImage(iv4.getImage()); exist[4][5] = box30.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box30.getImage()==null)	{box30.setImage(iv5.getImage()); exist[4][5] = box30.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box31) {
            if(event.getGestureSource()==iv1) {
                if(box31.getImage()==null)	{box31.setImage(iv1.getImage()); exist[0][6] = box31.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box31.getImage()==null)	{box31.setImage(iv2.getImage()); exist[0][6] = box31.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box31.getImage()==null)	{box31.setImage(iv3.getImage()); exist[0][6] = box31.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box31.getImage()==null)	{box31.setImage(iv4.getImage()); exist[0][6] = box31.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box31.getImage()==null)	{box31.setImage(iv5.getImage()); exist[0][6] = box31.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box32) {
            if(event.getGestureSource()==iv1) {
                if(box32.getImage()==null)	{box32.setImage(iv1.getImage()); exist[1][6] = box32.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box32.getImage()==null)	{box32.setImage(iv2.getImage()); exist[1][6] = box32.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box32.getImage()==null)	{box32.setImage(iv3.getImage()); exist[1][6] = box32.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box32.getImage()==null)	{box32.setImage(iv4.getImage()); exist[1][6] = box32.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box32.getImage()==null)	{box32.setImage(iv5.getImage()); exist[1][6] = box32.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box33) {
            if(event.getGestureSource()==iv1) {
                if(box33.getImage()==null)	{box33.setImage(iv1.getImage()); exist[2][6] = box33.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box33.getImage()==null)	{box33.setImage(iv2.getImage()); exist[2][6] = box33.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box33.getImage()==null)	{box33.setImage(iv3.getImage()); exist[2][6] = box33.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box33.getImage()==null)	{box33.setImage(iv4.getImage()); exist[2][6] = box33.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box33.getImage()==null)	{box33.setImage(iv5.getImage()); exist[2][6] = box33.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box34) {
            if(event.getGestureSource()==iv1) {
                if(box34.getImage()==null)	{box34.setImage(iv1.getImage()); exist[3][6] = box34.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box34.getImage()==null)	{box34.setImage(iv2.getImage()); exist[3][6] = box34.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box34.getImage()==null)	{box34.setImage(iv3.getImage()); exist[3][6] = box34.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box34.getImage()==null)	{box34.setImage(iv4.getImage()); exist[3][6] = box34.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box34.getImage()==null)	{box34.setImage(iv5.getImage()); exist[3][6] = box34.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box35) {
            if(event.getGestureSource()==iv1) {
                if(box35.getImage()==null)	{box35.setImage(iv1.getImage()); exist[4][6] = box35.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box35.getImage()==null)	{box35.setImage(iv2.getImage()); exist[4][6] = box35.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box35.getImage()==null)	{box35.setImage(iv3.getImage()); exist[4][6] = box35.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box35.getImage()==null)	{box35.setImage(iv4.getImage()); exist[4][6] = box35.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box35.getImage()==null)	{box35.setImage(iv5.getImage()); exist[4][6] = box35.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box36) {
            if(event.getGestureSource()==iv1) {
                if(box36.getImage()==null)	{box36.setImage(iv1.getImage()); exist[0][7] = box36.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box36.getImage()==null)	{box36.setImage(iv2.getImage()); exist[0][7] = box36.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box36.getImage()==null)	{box36.setImage(iv3.getImage()); exist[0][7] = box36.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box36.getImage()==null)	{box36.setImage(iv4.getImage()); exist[0][7] = box36.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box36.getImage()==null)	{box36.setImage(iv5.getImage()); exist[0][7] = box36.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box37) {
            if(event.getGestureSource()==iv1) {
                if(box37.getImage()==null)	{box37.setImage(iv1.getImage()); exist[1][7] = box37.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box37.getImage()==null)	{box37.setImage(iv2.getImage()); exist[1][7] = box37.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box37.getImage()==null)	{box37.setImage(iv3.getImage()); exist[1][7] = box37.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box37.getImage()==null)	{box37.setImage(iv4.getImage()); exist[1][7] = box37.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box37.getImage()==null)	{box37.setImage(iv5.getImage()); exist[1][7] = box37.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box38) {
            if(event.getGestureSource()==iv1) {
                if(box38.getImage()==null)	{box38.setImage(iv1.getImage()); exist[2][7] = box38.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box38.getImage()==null)	{box38.setImage(iv2.getImage()); exist[2][7] = box38.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box38.getImage()==null)	{box38.setImage(iv3.getImage()); exist[2][7] = box38.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box38.getImage()==null)	{box38.setImage(iv4.getImage()); exist[2][7] = box38.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box38.getImage()==null)	{box38.setImage(iv5.getImage()); exist[2][7] = box38.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box39) {
            if(event.getGestureSource()==iv1) {
                if(box39.getImage()==null)	{box39.setImage(iv1.getImage()); exist[3][7] = box39.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box39.getImage()==null)	{box39.setImage(iv2.getImage()); exist[3][7] = box39.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box39.getImage()==null)	{box39.setImage(iv3.getImage()); exist[3][7] = box39.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box39.getImage()==null)	{box39.setImage(iv4.getImage()); exist[3][7] = box39.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box39.getImage()==null)	{box39.setImage(iv5.getImage()); exist[3][7] = box39.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box40) {
            if(event.getGestureSource()==iv1) {
                if(box40.getImage()==null)	{box40.setImage(iv1.getImage()); exist[4][7] = box40.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box40.getImage()==null)	{box40.setImage(iv2.getImage()); exist[4][7] = box40.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box40.getImage()==null)	{box40.setImage(iv3.getImage()); exist[4][7] = box40.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box40.getImage()==null)	{box40.setImage(iv4.getImage()); exist[4][7] = box40.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box40.getImage()==null)	{box40.setImage(iv5.getImage()); exist[4][7] = box40.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box41) {
            if(event.getGestureSource()==iv1) {
                if(box41.getImage()==null)	{box41.setImage(iv1.getImage()); exist[0][8] = box41.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box41.getImage()==null)	{box41.setImage(iv2.getImage()); exist[0][8] = box41.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box41.getImage()==null)	{box41.setImage(iv3.getImage()); exist[0][8] = box41.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box41.getImage()==null)	{box41.setImage(iv4.getImage()); exist[0][8] = box41.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box41.getImage()==null)	{box41.setImage(iv5.getImage()); exist[0][8] = box41.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box42) {
            if(event.getGestureSource()==iv1) {
                if(box42.getImage()==null)	{box42.setImage(iv1.getImage()); exist[1][8] = box42.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box42.getImage()==null)	{box42.setImage(iv2.getImage()); exist[1][8] = box42.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box42.getImage()==null)	{box42.setImage(iv3.getImage()); exist[1][8] = box42.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box42.getImage()==null)	{box42.setImage(iv4.getImage()); exist[1][8] = box42.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box42.getImage()==null)	{box42.setImage(iv5.getImage()); exist[1][8] = box42.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box43) {
            if(event.getGestureSource()==iv1) {
                if(box43.getImage()==null)	{box43.setImage(iv1.getImage()); exist[2][8] = box43.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box43.getImage()==null)	{box43.setImage(iv2.getImage()); exist[2][8] = box43.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box43.getImage()==null)	{box43.setImage(iv3.getImage()); exist[2][8] = box43.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box43.getImage()==null)	{box43.setImage(iv4.getImage()); exist[2][8] = box43.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box43.getImage()==null)	{box43.setImage(iv5.getImage()); exist[2][8] = box43.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box44) {
            if(event.getGestureSource()==iv1) {
                if(box44.getImage()==null)	{box44.setImage(iv1.getImage()); exist[3][8] = box44.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box44.getImage()==null)	{box44.setImage(iv2.getImage()); exist[3][8] = box44.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box44.getImage()==null)	{box44.setImage(iv3.getImage()); exist[3][8] = box44.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box44.getImage()==null)	{box44.setImage(iv4.getImage()); exist[3][8] = box44.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box44.getImage()==null)	{box44.setImage(iv5.getImage()); exist[3][8] = box44.getBoundsInParent() ;}
            }
        }
        if(event.getGestureTarget()==box45) {
            if(event.getGestureSource()==iv1) {
                if(box45.getImage()==null)	{box45.setImage(iv1.getImage()); exist[4][8] = box45.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv2) {
                if(box45.getImage()==null)	{box45.setImage(iv2.getImage()); exist[4][8] = box45.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv3) {
                if(box45.getImage()==null)	{box45.setImage(iv3.getImage()); exist[4][8] = box45.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv4) {
                if(box45.getImage()==null)	{box45.setImage(iv4.getImage()); exist[4][8] = box45.getBoundsInParent() ;}
            }
            if(event.getGestureSource()==iv5) {
                if(box45.getImage()==null)	{box45.setImage(iv5.getImage()); exist[4][8] = box45.getBoundsInParent() ;}
            }
        }
        success = true;

        event.setDropCompleted(success);
        event.consume();
    }



    @FXML
    void dragDone(DragEvent event) {
        /* the drag-and-drop gesture ended */
//        System.out.println("onDragDone");
        /* if the data was successfully moved, clear it */
        if (event.getTransferMode() == TransferMode.MOVE) {
//            iv1.setImage(null);
        }

        event.consume();
    };

    public Controller() throws FileNotFoundException {

    }
}
