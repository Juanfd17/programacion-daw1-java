public class Circulo {
    private int radio;
    private double perimetro;
    private double area;

    public Circulo(int radio){
        this.radio = radio;
        this.perimetro = 2 * Math.PI * this.radio;
        this.area = Math.PI * radio * radio;
    }

    public void imprimirDetalles(){
        System.out.println("El radio es: " + this.radio + "m");
        System.out.println("El perimetro es: " + this.perimetro + "m");
        System.out.println("El area es: " + this.area + "m");
    }
}
