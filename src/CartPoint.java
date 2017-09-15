public class CartPoint extends Magnitude {

    public CartPoint(double d){
        this.amount = d;
    }


    private double amount;

    @Override
    public boolean lessThan(Magnitude m) {
        CartPoint tempCartPoint = (CartPoint)m;
        if(this.amount < tempCartPoint.getAmount()){
            return true;
        }
        else{
            return false;
        }
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount(){
        return this.amount;
    }
}
