import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {

    private ImageView img;   // imageview de fond

    // paramètres du constructeur : coordonnées du rectangle qui contien l'image à afficher, position où afficher l'image, nom du fichier contenant l'image

    public StaticThing(double debutX,double finX,double debutY,double finY,double offset, String fileName){

        Image background = new Image(fileName);    // ouverture du fichier image
        img = new ImageView(background);           // création de l'ImageView

        img.setViewport(new Rectangle2D(debutX,debutY,finX,finY));    // définition du rectangle à afficher
        img.setX(offset);                                             // affichage à l'offset choisi
    }

    public ImageView getImg() {
        return img;
    }    // getter


}
