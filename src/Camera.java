public class Camera {
    private Integer x,y;
    private long frameDuration=1000000;
    private long time2= 0;

    public Camera(Integer x, Integer y){
        this.x=x;
        this.y=y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void update(long time){
        /*if (time-time2>frameDuration) {
            x += 100;
            x=x%800;
            time2=time;
        }*/
        x+=5;



    }

    @Override
    public String toString(){return x+","+y;}


}
