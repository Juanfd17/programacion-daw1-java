public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(5,6);
        t1.imprimirDetalles();
        Triangulo t2 = new Triangulo(5,7);
        t2.imprimirDetalles();

        t1.setCateto1(12);
        t1.imprimirDetalles();

        Cuadrado c1 = new Cuadrado(4);

        Dibujo d1 = new Dibujo("Ecce Humano", "Felista");
        d1.setCuadrado(c1);
        d1.setTriangulo(t1);
    }
}