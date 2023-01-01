public class Dinero {
    int cantidad;

    public Dinero (int cantidad){
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void masCantidad(double cantidad){
        this.cantidad += cantidad;
    }

    public void menosCantidad(double cantidad){
        this.cantidad -= cantidad;
    }
}
