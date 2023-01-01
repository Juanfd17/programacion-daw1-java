public class Triangulo {
    private double cateto1;
    private double cateto2;

    public Triangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public void imprimirDetalles(){
        System.out.println("---------Calcular hiponesusa-------");
        System.out.println("Cateto1: " + getCateto1());
        System.out.println("Cateto2: " + getCateto2());
        System.out.println("La hipotenusa es: " + obtenerHipotenusa());
    }

    public double obtenerHipotenusa(){
        return Math.sqrt(Math.pow (cateto1, 2) + Math.pow(cateto2,2));
    }

    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }
}
