package app;

import java.util.*;

public class Main {
    public static final String DELIMITADOR = "::";

    public static void main(String[] args) {
        Liga liga = new Liga();
        liga.agregarPartidos(leerFichero());
        System.out.println(liga.obtenerClasificacion());
        liga.htmlPorPuntos();
        liga.htmlPorGolesFavor();
        liga.htmlPorGolesEnContra();

        List<String> caveceras = new ArrayList<>();
        caveceras.add("nombre");
        //caveceras.add("puntos");
        caveceras.add("golesAFavor");
        //caveceras.add("golesEnContra");

        liga.html(caveceras, false, "puntos");
    }

    private static Set<Partido> leerFichero() {
        Set<Partido> partidos = new HashSet<>();
        Scanner sc = new Scanner(Main.class.getResourceAsStream("../ut5-tarea13-partidos.txt"));
        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            String[] datos = linea.split(DELIMITADOR);
            Partido partido = new Partido(
                    new Equipo(datos[0].trim()),
                    new Equipo(datos[1].trim()),
                    Integer.parseInt(datos[2]),
                    Integer.parseInt(datos[3])
            );
            partidos.add(partido);
        }
        sc.close();

        return partidos;
    }
}