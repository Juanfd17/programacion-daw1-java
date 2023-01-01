public class Linea {
    private Punto punto1;
    private Punto punto2;

    public Linea(){
        this.punto1 = new Punto(0,0);
        this.punto2 = new Punto(0,0);
    }

    public Linea(Punto punto1, Punto punto2){
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public void moverDerecha(int distancia){
        punto1.desplaza(distancia,0);
        punto2.desplaza(distancia,0);
    }

    public void moverIzquierda(int distancia){
        punto1.desplaza(-distancia,0);
        punto2.desplaza(-distancia,0);
    }

    public void moverArriba(int distancia){
        punto1.desplaza(0,distancia);
        punto2.desplaza(0,distancia);
    }

    public void moverAbajo(int distancia){
        punto1.desplaza(0,-distancia);
        punto2.desplaza(0,-distancia);
    }

    public void setPunto1(int x, int y){
        this.punto1.setX(x);
        this.punto1.setY(y);
    }

    public void setPunto2(int x, int y){
        this.punto2.setX(x);
        this.punto2.setY(y);
    }

    public String printLinea() {
        final StringBuilder sb = new StringBuilder().append("punto 1 - ").append(punto1);
        sb.append("punto2 - ").append(punto2);
        return sb.toString();
    }
}
