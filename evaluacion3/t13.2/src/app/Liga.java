package app;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.*;

public class Liga {

    public static final int PUNTOS_PARTIDO_GANADO = 3;
    public static final int PUNTOS_PARTIDO_EMPATADO = 1;
    private Set<Partido> partidos;

    private Set<Equipo> equipos;

    public Liga() {
        this.partidos = new HashSet<>();
        this.equipos = new HashSet<>();
    }

    public boolean agregarPartido(Partido partido) {
        return partidos.add(partido);
    }

    public boolean agregarPartidos(Set<Partido> partidos) {
        return this.partidos.addAll(partidos);
    }

    public String obtenerClasificacion() {
        StringBuilder tabla = new StringBuilder();
        tabla.append(formatearBorde("a-----b----------------------b------b----b----c\n"));
        tabla.append(formatearFila("| Pos | Equipo               | Pts  | GF | GC |\n"));
        tabla.append(formatearBorde("d-----e----------------------e------e----e----f\n"));

        int posicion = 1;
        for (Equipo equipo : equiposPorPuntos()) {
            tabla.append(formatearFila(String.format("| %-3d | %-20s | %-4d | %-2d | %-2d |\n",
                    posicion++, equipo.getNombre(), equipo.getPuntos(), equipo.getGolesAFavor(), equipo.getGolesEnContra())));
        }

        tabla.append(formatearBorde("g-----h----------------------h------h----h----i"));
        return tabla.toString();
    }


    public static String formatearFila(String str) {
        return str.replace('|', '\u2502');
    }

    public static String formatearBorde(String str) {
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }

    private void calcularPuntuaciones() {
        if (equipos.size() == 0) {
            for (Partido partido : partidos) {
                Equipo local = buscarEquipo(partido.getLocal());
                Equipo visitante = buscarEquipo(partido.getVisitante());
                asignarPuntosYGoles(partido, local, visitante);
            }
        }
    }

    private Equipo buscarEquipo(Equipo equipo) {
        Equipo buscado = equipo;
        if (!equipos.add(equipo)) {
            for (Equipo e : equipos) {
                if (e.equals(equipo)) {
                    buscado = e;
                    break;
                }
            }
        }
        return buscado;
    }

    private void asignarPuntosYGoles(Partido partido, Equipo local, Equipo visitante) {
        asignarPuntos(partido, local, visitante);
        sumarGoles(partido, local, visitante);
    }

    private void sumarGoles(Partido partido, Equipo local, Equipo visitante) {
        local.sumarGolesAFavor(partido.getGolesLocal());
        local.sumarGolesEnContra(partido.getGolesVisitante());
        visitante.sumarGolesAFavor(partido.getGolesVisitante());
        visitante.sumarGolesEnContra(partido.getGolesLocal());
    }

    private void asignarPuntos(Partido partido, Equipo local, Equipo visitante) {
        if (partido.getGolesLocal() > partido.getGolesVisitante()) {
            local.sumarPuntos(PUNTOS_PARTIDO_GANADO);
        } else if (partido.getGolesLocal() == partido.getGolesVisitante()) {
            local.sumarPuntos(PUNTOS_PARTIDO_EMPATADO);
            visitante.sumarPuntos(PUNTOS_PARTIDO_EMPATADO);
        } else {
            visitante.sumarPuntos(PUNTOS_PARTIDO_GANADO);
        }
    }

    public void htmlPorPuntos(){
        PrintWriter fichero = null;
        try{
            fichero = new PrintWriter(new BufferedWriter(new FileWriter("puntos.html")));
            abrirFicheroPuntos(fichero);
            int pos = 1;
            for (Equipo equipo:equiposPorPuntos()) {
                fichero.println("<tr>");
                fichero.println("<td>"+ pos + "</td>");
                fichero.println("<td>"+ equipo.getNombre() + "</td>");
                fichero.println("<td>"+ equipo.getPuntos() + "</td>");
                fichero.println("<td>"+ equipo.getGolesAFavor() + "</td>");
                fichero.println("<td>"+ equipo.getGolesEnContra() + "</td>");
                fichero.println("</tr>");
                pos++;
            }
            cerrarFichero(fichero);

        } catch (IOException e) {
            System.out.println("Error al crear el index.html");
        }
    }

    public void htmlPorGolesFavor(){
        PrintWriter fichero = null;
        try{
            fichero = new PrintWriter(new BufferedWriter(new FileWriter("golesAFavor.html")));
            abrirFicheroGolesFavor(fichero);
            for (Equipo equipo:equiposPorGolesFavor()) {
                fichero.println("<tr>");
                fichero.println("<td>"+ equipo.getNombre() + "</td>");
                fichero.println("<td>"+ equipo.getGolesAFavor() + "</td>");
                fichero.println("</tr>");
            }
            cerrarFichero(fichero);

        } catch (IOException e) {
            System.out.println("Error al crear el index.html");
        }
    }

    public void htmlPorGolesEnContra(){
        PrintWriter fichero = null;
        try{
            fichero = new PrintWriter(new BufferedWriter(new FileWriter("golesEnContra.html")));
            abrirFicheroGolesContra(fichero);
            for (Equipo equipo:equiposPorGolesContra()) {
                fichero.println("<tr>");
                fichero.println("<td>"+ equipo.getNombre() + "</td>");
                fichero.println("<td>"+ equipo.getGolesEnContra() + "</td>");
                fichero.println("</tr>");
            }
            cerrarFichero(fichero);

        } catch (IOException e) {
            System.out.println("Error al crear el index.html");
        }
    }

    public void abrirFichero(PrintWriter fichero){
        fichero.println("<html>");
        fichero.println("<body>");
        fichero.println("<table border=\"1\" cellpadding=\"2\" cellspacing=\"0\">");
        fichero.println("<thead>");
        fichero.println("<tr>");
    }

    public void html(List<String> cabeceras, boolean posiciones, String orden){
        PrintWriter fichero = null;
        try{
            fichero = new PrintWriter(new BufferedWriter(new FileWriter("general.html")));
            abrirFicheroGeneral(fichero, cabeceras, posiciones);

            int pos = 1;
            for (Equipo equipo:equiposPorPuntos()) {
                fichero.println("<tr>");
                if (posiciones){
                    fichero.println("<td>"+ pos + "</td>");
                }
                for (String string: cabeceras) {
                    Field field = equipo.getClass().getDeclaredField(string);
                    field.setAccessible(true);
                    fichero.println("<td>"+ field.get(equipo) + "</td>");
                }
                fichero.println("</tr>");
                pos++;
            }
            cerrarFichero(fichero);

        } catch (IOException e) {
            System.out.println("Error al crear el index.html");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public void abrirFicheroGeneral(PrintWriter fichero, List<String> cabeceras, boolean posiciones){
        abrirFichero(fichero);
        if (posiciones){
            fichero.println("<th>Pos</th>");
        }
        for (String cabecera: cabeceras) {
            fichero.println("<th>"+ cabecera +"</th>");
        }
        fichero.println("</tr>");
        fichero.println("</thead>");
        fichero.println("<tbody>");
    }

    public void abrirFicheroPuntos(PrintWriter fichero){
            abrirFichero(fichero);
            fichero.println("<th>Pos</th>");
            fichero.println("<th>Equipos</th>");
            fichero.println("<th>Pts</th>");
            fichero.println("<th>GF</th>");
            fichero.println("<th>GC</th>");
            fichero.println("</tr>");
            fichero.println("</thead>");
            fichero.println("<tbody>");
    }

    public void abrirFicheroGolesFavor(PrintWriter fichero){
        abrirFichero(fichero);
        fichero.println("<th>Equipos</th>");
        fichero.println("<th>GF</th>");
        fichero.println("</tr>");
        fichero.println("</thead>");
        fichero.println("<tbody>");
    }

    public void abrirFicheroGolesContra(PrintWriter fichero){
        abrirFichero(fichero);
        fichero.println("<th>Equipos</th>");
        fichero.println("<th>GC</th>");
        fichero.println("</tr>");
        fichero.println("</thead>");
        fichero.println("<tbody>");
    }

    public void cerrarFichero(PrintWriter fichero){
        fichero.println("</tbody>");
        fichero.println("</body>");
        fichero.println("</html>");
        fichero.close();
    }

    public List<Equipo> equiposPorPuntos(){
        calcularPuntuaciones();
        List<Equipo> equiposOrdenados = new ArrayList<>(equipos);
        Collections.sort(equiposOrdenados);
        return equiposOrdenados;
    }

    public List<Equipo> equiposPorGolesFavor(){
        calcularPuntuaciones();
        List<Equipo> equiposOrdenados = new ArrayList<>(equipos);
        Collections.sort(equiposOrdenados, new GolesFavor());
        return equiposOrdenados;
    }

    public List<Equipo> equiposPorGolesContra(){
        calcularPuntuaciones();
        List<Equipo> equiposOrdenados = new ArrayList<>(equipos);
        Collections.sort(equiposOrdenados, new GolesContra());
        return equiposOrdenados;
    }
}