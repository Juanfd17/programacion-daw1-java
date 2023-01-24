public class Circulo extends Figura{
    double radio;

    public Circulo(int x, int y, int r, int g, int b, double radio) {
        super(x, y, r, g, b);
        this.radio = radio;
    }

    public double perimetro(){
        return 2 * Math.PI * radio;
    }

    public double area(){
        return Math.PI * Math.pow(radio,2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("radio: ").append(radio);
        return sb.toString();
    }

    @Override
    public boolean equals(Figura figura) {
        return super.equals(figura) && this.radio == ((Circulo)figura).radio;
    }
}
