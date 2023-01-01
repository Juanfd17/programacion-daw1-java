public class Cuadrado {
    private double lado;
    private Punto centro;

    public Cuadrado() {
        this.lado = 0;
        this.centro = new Punto();
    }

    public Cuadrado(int x, int y, double lado){
        this.lado = lado;
        this.centro = new Punto(x,y);
    }

    public Cuadrado(Punto punto, double lado){
        this.centro = punto;
        this.lado = lado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder().append("lado = ").append(lado);sb
                .append("\ncentro = ").append(centro);
        return sb.toString();
    }
}
