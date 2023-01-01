public class Main {
    public static void main(String[] args) {
        Cuadrado casa = new Cuadrado(100, 60, 195, "red", true );
        casa.hacerVisible();


        Triangulo techo = new Triangulo(50, 120,110,150,"green", true);
        techo.hacerVisible();

        Circulo sol = new Circulo(50,300,50,"yellow",true);
        sol.hacerVisible();

        Cuadrado ventana = new Cuadrado(20, 80 ,220, "black", true);
        ventana.hacerVisible();
    }
}