import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {
    private  double x,y;
    private ImageView img;

    public StaticThing(double x, double y, String fileName){

        Image background = new Image(fileName);
        img = new ImageView(background);
        this.x=x;
        this.y=y;
    }

    public ImageView getImg() {
        return img;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
