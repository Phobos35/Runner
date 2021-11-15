public class Camera {
    private double x,y;
    private long frameDuration=100000000;
    private long time2= 0;
    private double acceleration=0;
    private double k=10;
    private double m=10;
    private double vitesse=0;
    private  double f=12;


    public Camera(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void update(long time, Hero hero){

        acceleration=k/m*(hero.getX()-x)-f/m*vitesse;
        vitesse+=acceleration*0.1;
        x+=vitesse*0.1;
        hero.setOffset((int)hero.getX()- (int)x+100);

    }

    @Override
    public String toString(){return x+","+y;}


}
