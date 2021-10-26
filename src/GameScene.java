import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;

public class GameScene extends Scene {
    private Camera theCam;
    private StaticThing left;
    private StaticThing right;

    public Camera getTheCam() {
        return theCam;
    }

    public GameScene(Group parent){
        super(parent,600,400);
        left = new StaticThing(80,600,"C://Runner//desert.png");
        right= new StaticThing(80,600,"C://Runner//desert.png");
        this.theCam=new Camera(1000,0);

        parent.getChildren().add(left.getImg());
        parent.getChildren().add(right.getImg());


    }

    public void render(){
        double xCam=theCam.getX();
        right.getImg().setX(xCam%left.getX());
        left.getImg().setViewport(new Rectangle2D(right.getX()-xCam%right.getX(),0,xCam% right.getX(),right.getY()));
    }

    public static void update(long l){}
}
