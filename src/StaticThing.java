import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {
    private  double x,y;
    private ImageView img;

    public StaticThing(double debutX,double finX,double debutY,double finY,double offset, String fileName){

        Image background = new Image(fileName);
        img = new ImageView(background);

        img.setViewport(new Rectangle2D(debutX,debutY,finX,finY));
        img.setX(offset);
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
