// importations nécessaires

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

// Classe abstraite pour que plusieurs classes puissent en hériter (Hero, Ennemi)

public abstract class AnimatedThing {
    private double x=0,y=0;           // Coordonnées de la position
    private double ay=3000;           // accélération selon y pour les sauts, non nul pour tester les sauts
    private double vy=ay*0.1;         // vitesse selon y pour les sauts
    private double g=300;             // constante g pour la gravité
    private double vitesse;           // vitesse selon x
    private ImageView img;            // ImageView du sprite
    private Integer attitude;         // attitude du héros : course, saut, tir

    private double index;             // Index de l'image de la spritesheet à afficher
    private long frameDuration=100000000;   // Duréée d'une frame en ns
    private Integer maximumIndex=6;   // index maximum sur la spritesheet
    private  Integer offset=200;      // offset du héros sur l'écran pour qu'il ne soit pas collé au bord
    private long time2= 0;            // mémoire tampon pour pouvoir attendre le temps entre de frame


    // constructeur

    public AnimatedThing(String fileName, int index){
        Image heros = new Image(fileName);        // ouverture du fichier image
        img=new ImageView(heros);                 // création de l'ImageView
        img.setViewport(new Rectangle2D(85*index,0,85,100));    // On selectionne la première image de la spritesheet
        img.setX(offset);                         // On place le héros à l'offset
        img.setY(y+250);                          // On place le héros sur le sol
    }

    public void update(long time){
        System.out.println(time-time2);
        if (time-time2>frameDuration) {           //dès que le temps entre de frames est passé
            index++;                              // On prend l'index du sprite suivant
            index = index % maximumIndex;         //quand on arrive au dernier sprite, on revient au permier

            img.setViewport(new Rectangle2D(85 * index, 0, 85, 100));  // on affiche le sprite suivant
            img.setX(offset);                               // On place le héros à l'offset
            img.setY(-y+250);                               // On actualise l'altitude du héros
            time2=time;

            vitesse=50;
            x+= vitesse;


            ay = -g;                            // implémentation de la gravité
            vy += ay * 0.1;
            y += vy * 0.1;

            y=y<0 ? 0:y;                        // si l'altitude du héros est nulle, alors il ne descend plus
            ay=y<0 ? 0:ay;
            vy=y<0 ? 0:vy;
        }


    }

    public ImageView getImg() {
        return img;
    }

    public double getX() {
        return x;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public void jump(){
        ay=50;
    }
}
