public class Casa implements Comparable<Casa>, Cloneable{

    private double superficie;

    public Casa(double superficie) {
        this.superficie = superficie;
    }
    public double getSuperficie(){
        return superficie;
    }

    public void setSuperficie(double superficie){
        this.superficie = superficie;
    }
    @Override
    public int compareTo(Casa otraCasa) {
        int r;
        if (this.superficie == otraCasa.getSuperficie()){
            r = 0;
        } else if (this.superficie > otraCasa.getSuperficie()){
            r = 1;
        } else {
            r = -1;
        }
        return r;
    }

    public Casa clone(){
        try {
            return (Casa) super.clone();
        } catch (CloneNotSupportedException e){
            return null;
        }
    }
}
