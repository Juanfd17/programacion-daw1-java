import java.awt.*;
import java.util.ArrayList;

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
}
