public class Cafeteria {
    private int capacidadMax;
    private int capacidadActual;

    public Cafeteria() {
        this.capacidadActual = 0;
        this.capacidadMax = 1000;
    }

    public void llenarCafeteria(){
        this.capacidadActual = this.capacidadMax;
    }

    public void servirTaza(int cantidadCafe){
        if (getCapacidadActual() >= cantidadCafe){
            setCapacidadActual(getCapacidadActual() - cantidadCafe);
        } else {
            setCapacidadActual(0);
        }
    }

    public void vaciarCafetera(){
        setCapacidadActual(0);
    }

    public void agregarCafe(int cantidad){
        if (getCapacidadMax() <= getCapacidadActual()+cantidad){
            setCapacidadActual(getCapacidadMax());
        } else {
            setCapacidadActual(getCapacidadActual() + cantidad);
        }
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
}
