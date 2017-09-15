public abstract class Magnitude implements MagInterface {

    abstract public boolean lessThan(Magnitude m);

    @Override
    public boolean lessThanEqualTo(Magnitude m) {

        if(lessThan(m) == true){
            return true;
        }

        else if(equalTo(m)){
            return true;
        }

        else{
            return false;
        }
    }

    @Override
    public boolean equalTo(Magnitude m) {

        if(this.lessThan(m) != true && m.lessThan(this) != true){
            return true;
        }

        else{
            return false;
        }
    }

    @Override
    public boolean greaterThanEqualTo(Magnitude m) {

        if(lessThan(m) == false){
            return true;
        }

        else if(equalTo(m) == true){
            return true;
        }

        else{
            return false;
        }
    }

    @Override
    public boolean greaterThan(Magnitude m) {

        if(lessThan(m) == true || equalTo(m) == true){
            return false;
        }

        else{
            return true;
        }
    }

    @Override
    public boolean notEqual(Magnitude m) {

        if(equalTo(m) == false){
            return true;
        }

        else{
            return false;
        }
    }
}
