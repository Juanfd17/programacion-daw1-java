import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GestorFiguras {
    private ArrayList<Figura> figuras = new ArrayList<Figura>();
    private int contador = 0;
    public void addFigura(Figura figura){
        figuras.add(figura);
    }

    public String listarFigura(){
        final StringBuilder sb = new StringBuilder();
        for (Figura figura: figuras) {
            sb.append(figura).append("\n");
        }
        return sb.toString();
    }

    public Figura mayorArea(){
        Figura figuraMayorArea = figuras.get(0);
        for (Figura figura: figuras) {
            if (figura.area() > figuraMayorArea.area()){
                figuraMayorArea = figura;
            }
        }
        return figuraMayorArea;
    }

    public void borrarDeColor(Color color){
        ArrayList<Figura> tempFigura = new ArrayList<Figura>();
        for (Figura figura: figuras) {
            if (figura.getColor() != color.getRGB()){
                tempFigura.add(figura);
            }
        }

        figuras = tempFigura;
    }

    public void borrarIgualesA(Figura figura){
        ArrayList<Figura> tempFigura = new ArrayList<Figura>();
        for (Figura f:figuras) {
            if (!(f.equals(figura))){
                tempFigura.add(f);
            }
        }
        tempFigura.add(figura);
        figuras = tempFigura;
    }

    public void testMovibles(){
        List<Movible> movibles = new ArrayList<Movible>();
        Movible c = new Circulo(2,2,2,2,2,2);
        Movible cua = new Cuadrado(2,2,2,2,2,2);
        Movible t = new Triangulo(2,2,2,2,2,2,2,2);
        movibles.add(c);
        movibles.add(cua);
        movibles.add(t);
        for (Movible movible : movibles){
            System.out.println(movible);
        }

        c.moverHorizontal(10);
        c.moverVertical(10);
        cua.moverHorizontal(10);
        cua.moverVertical(10);
        t.moverHorizontal(10);
        t.moverVertical(10);
    }
}
