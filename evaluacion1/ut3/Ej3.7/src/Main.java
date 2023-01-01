public class Main {
    public static void main(String[] args) {
        Cuadrado casa = new Cuadrado();
        casa.moverHorizontal(-250);
        casa.moverVertical(70);
        casa.cambiarTamano(100);
        casa.hacerVisible();

        Triangulo techo = new Triangulo();
        techo.cambiarTamano(50,120);
        techo.moverDespacioHorizontal(-100);
        techo.moverVertical(8);
        techo.hacerVisible();

        Circulo sol = new Circulo();
        sol.cambiarColor("yellow");
        sol.moverVertical(-50);
        sol.moverHorizontal(60);
        sol.hacerVisible();

        Cuadrado ventana = new Cuadrado();
        ventana.cambiarColor("black");
        ventana.cambiarTamano(20);
        ventana.moverHorizontal(-230);
        ventana.moverDespacioVertical(100);
        ventana.hacerVisible();
    }
}