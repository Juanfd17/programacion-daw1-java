public class Cuadrado extends Figura{
    double lado;

    public Cuadrado(int x, int y, int r, int g, int b, double lado) {
        super(x, y, r, g, b);
        this.lado = lado;
    }

    public double perimetro(){
        return lado * 4;
    }

    public double area(){
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("lado: ").append(lado);
        return sb.toString();
    }

    @Override
    public boolean equals(Figura figura) {
        return super.equals(figura) && this.lado == ((Cuadrado)figura).lado;
    }
}
