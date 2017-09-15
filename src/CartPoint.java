import java.lang.Math;

public class CartPoint extends Magnitude {

    public CartPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    private double x;
    private double y;

    public double distance(){
        double u = x*x;
        double v = y*y;
        return u+v;
    }

    @Override
    public boolean lessThan(Magnitude m) {
        CartPoint tempCartPoint = (CartPoint)m;
        if(this.distance() < tempCartPoint.distance()){
            return true;
        }
        else{
            return false;
        }
    }

}
