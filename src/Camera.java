public class Camera {
    private double x,y;                     // position de la caméra
    private double acceleration=0;          // accélération de la caméra
    private double k=10;                    // constante de raideur du ressort de la caméra
    private double m=10;                    // masse de la caméra
    private double vitesse=0;               // vitesse de la caméra
    private  double f=12;


    // constructeur

    public Camera(double x, double y){
        this.x=x;
        this.y=y;
    }

    // getter et setter

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    // méthode update de la caméra

    public void update(long time, Hero hero){

        acceleration=k/m*(hero.getX()-x)-f/m*vitesse;    // mise à jour de l'accélération
        vitesse+=acceleration*0.1;                       // mise à jour de la vitesse
        x+=vitesse*0.1;                                  // mise à jour de la position
        hero.setOffset((int)hero.getX()- (int)x+100);    // mise à jour de l'affichage du héros sur l'écran

    }

    @Override
    public String toString(){return x+","+y;}


}
