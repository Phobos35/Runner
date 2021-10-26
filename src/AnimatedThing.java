import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class AnimatedThing {
    private double x,y;
    private ImageView img;
    private Integer attitude;

    private Integer index;
    private Integer frameDuration;
    private Integer maximumIndex;
    private Integer size;
    private  Integer offset;

    public AnimatedThing(String fileName){
        Image heros = new Image(fileName);
        img=new ImageView(heros);
    }

}
