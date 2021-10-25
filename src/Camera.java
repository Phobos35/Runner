public class Camera {
    private Integer x,y;

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

    @Override
    public String toString(){return x+","+y;}


}
