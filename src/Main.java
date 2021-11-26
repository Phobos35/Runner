// add any usefull package line

import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;

public class Main extends Application{

    public void start(Stage primaryStage){

        primaryStage.setTitle("Demo");
        Group root = new Group();

        //Pane pane = new  Pane(root);
        //Scene scene = new Scene(root, 600, 400);

        GameScene theScene = new GameScene(root);   //Création de la Game scene
        primaryStage.setScene(theScene);
        primaryStage.show();

        System.out.println(theScene.getTheCam());  // test por savoir le comporetement de la caméra est le bon
    }
    public static void main(String[] args) {
        launch(args);
        // write your code here

        //GameScene theScene = new GameScene(new Camera(10,50),"desert");


    }
}
