public class Triangulo extends Figura{
    double lado1;
    double lado2;
    double lado3;

    public Triangulo(int x, int y, int r, int g, int b, double lado1, double lado2, double lado3) {
        super(x, y, r, g, b);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double area(){
        double semiperimetro = perimetro()/2;
        return (Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro * lado3)));
    }

    public double perimetro(){
        return lado1 + lado2 + lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("lado1: ").append(lado1);
        sb.append("lado2: ").append(lado2);
        sb.append("lado3: ").append(lado3);
        return sb.toString();
    }

    @Override
    public boolean equals(Figura figura) {
        return super.equals(figura) && this.lado1 == ((Triangulo)figura).lado1 && this.lado2 == ((Triangulo)figura).lado2 && this.lado3 == ((Triangulo)figura).lado3;
    }
}
