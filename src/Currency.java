public class Currency extends Magnitude {

    public Currency (double d){
        this.amount = d;
    }


    private double amount;

    @Override
    public boolean lessThan(Magnitude m) {
        Currency c = (Currency)m;
        if(this.amount < c.getAmount()){
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
