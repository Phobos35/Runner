
import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;

public class GameScene extends Scene {
    private Camera theCam;
    private StaticThing left;
    private StaticThing right;
    private Hero hero;

    public Camera getTheCam() {
        return theCam;
    }

    public GameScene(Group parent){
        super(parent,500,400);

        this.theCam=new Camera(500,0);   // on place la caméra un peu décalée par rapport au héros pour tester le ressort


        hero = new Hero("heros.png",0);

        left = new StaticThing(theCam.getX()%800,theCam.getX()%800+800 , theCam.getY()%400,theCam.getY()%400+400-theCam.getY()%400, 0,"desert.png");     // On crée deux images à partir du fond : une partie affichée à gauche qui correspond à la droite du fichier image qui est rognée petit à petit par la gauche
        right= new StaticThing(0,theCam.getX()%800, theCam.getY()%400,theCam.getY()%400+400-theCam.getY()%400,800-theCam.getX()%800,"desert.png");       // Une partie affichée à droite qui correspond à l'image en entier et que l'on décale pour avoir le fond qui défile de manière continue

        parent.getChildren().add(left.getImg());
        parent.getChildren().add(right.getImg());
        parent.getChildren().add(hero.getImg());

        timer.start();

    }

    // mise à jour de l'affichage

    public void update(long time){
        System.out.println(theCam.getX());
        left.getImg().setViewport(new Rectangle2D(theCam.getX()%800, theCam.getY()%400, 800,400));
        right.getImg().setViewport(new Rectangle2D(0,theCam.getY()%400,800 ,400));

        right.getImg().setX(800-theCam.getX()%800);
    }

    // animation timer

    AnimationTimer timer = new AnimationTimer()
    {
        public void handle(long time){
            hero.update(time);
            theCam.update(time,hero);
            update(time);
        }
    };

}
