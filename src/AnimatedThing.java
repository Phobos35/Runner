import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class AnimatedThing {
    private double x=0,y=250;
    private ImageView img;
    private Integer attitude;

    private double index;
    private long frameDuration=100000000;
    private Integer maximumIndex;
    private Integer size;
    private  Integer offset=100;
    private long time2= 0;

    public AnimatedThing(String fileName, int index){
        Image heros = new Image(fileName);
        img=new ImageView(heros);
        img.setViewport(new Rectangle2D(85*index,0,85,100));
        img.setX(offset);
        img.setY(250);
    }

    public void update(long time){
        if (time-time2>frameDuration) {
            index++;
            index = index % 6;

            img.setViewport(new Rectangle2D(85 * index, 0, 85, 100));
            img.setX(offset);
            img.setY(250);
            time2=time;
            x++;
        }

    }

    public ImageView getImg() {
        return img;
    }
}
