import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Equipo> equipos = new TreeSet<>();

        Equipo e1 = new Equipo("e1");
        Equipo e2 = new Equipo("e2");
        Equipo e3 = new Equipo("e3");
        Equipo e4 = new Equipo("e4");
        Equipo e5 = new Equipo("e1");

        equipos.add(e1);
        equipos.add(e2);
        equipos.add(e3);
        equipos.add(e4);
        equipos.add(e5);

        e1.addPuntos(4);


        imprimir(equipos);
    }

    public static void imprimir(Set<Equipo> equipos){
        int p = 1;
        System.out.println("Posicion\tEquipo\t\tPuntos\tGF\tGC");
        for (Equipo equipo: equipos) {
            System.out.println(p + "\t\t\t" + equipo);
            p++;
        }
    }
}