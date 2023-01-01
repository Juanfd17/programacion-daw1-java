public class Hucha {
    private Dinero dinero;

    public Hucha() {
        this.dinero = new Dinero(0);
    }

    public void masDinero(double cantidad){
        dinero.masCantidad(cantidad);
    }

    public void  menosDinero(double cantidad){
        dinero.menosCantidad(cantidad);
    }

    public void printDetalles(){
        System.out.println("------------------");
        System.out.println(this.dinero.getCantidad());
        System.out.println("------------------");
    }
}
