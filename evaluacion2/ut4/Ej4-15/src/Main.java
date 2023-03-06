import java.awt.*;

public class Main {

    public static void main(String[] args) {

        GestorFiguras g1 = new GestorFiguras();

        Color rojo = new Color(255, 0, 0);
        Color azul = new Color(0, 0, 255);
        Color verde = new Color(0, 255, 0);

        Figura c1 = new Circulo(2, 5, 255,0,0 ,8);
        Figura c2 = new Circulo(2, 5, 255,0,0, 8);
        Figura c3 = new Circulo(4, 3, 0,0,255, 4);
        Figura c4 = new Circulo(1, 0, 0,255,0, 7);

        Figura t1 = new Triangulo(2, 4, 255,0,0, 3, 3, 4);
        Figura t2 = new Triangulo(2, 4, 255,0,0, 3, 3, 4);
        Figura t3 = new Triangulo(3, 4, 255,0,0, 6, 4, 9);
        Figura t4 = new Triangulo(6, 4, 0,255,0, 2, 2, 5);

        Figura cu1 = new Cuadrado(2, 5, 255,0,0, 5);
        Figura cu2 = new Cuadrado(2, 5, 0,0,255, 5);
        Figura cu3 = new Cuadrado(8, 0, 0,0,255, 8);
        Figura cu4 = new Cuadrado(2, 1, 0,255,0, 4);

        g1.addFigura(c1);
        g1.addFigura(c2);
        g1.addFigura(c3);
        g1.addFigura(c4);
        g1.addFigura(t1);
        g1.addFigura(t2);
        g1.addFigura(t3);
        g1.addFigura(t4);
        g1.addFigura(cu1);
        g1.addFigura(cu2);
        g1.addFigura(cu3);
        g1.addFigura(cu4);


        System.out.println(g1.listarFigura());

        System.out.println();
        System.out.println("-----------------------------------------------------------------------");

        g1.borrarDeColor(rojo);

        System.out.println();
        System.out.println("-----------------------------------------------------------------------");

        System.out.println("La figura con mayor area es:" + g1.mayorArea());

        System.out.println();
        System.out.println("-------------------------------------------------------------------------");

        g1.borrarIgualesA(c1);

        System.out.println();
        System.out.println("-------------------------------------------------------------------------");

        System.out.println(g1.listarFigura());

        g1.borrarDeColor(verde);
        System.out.println(g1.listarFigura());


    }

}