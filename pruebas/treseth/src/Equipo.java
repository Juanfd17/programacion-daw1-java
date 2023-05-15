import java.util.Objects;

public class Equipo implements Comparable<Equipo>{
    private String nombre;
    private int puntos;
    private int gF;
    private int gC;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.gF = 0;
        this.gC = 0;
    }

    public void addGF(int goles){
        gF += goles;
    }

    public void addGC(int goles){
        gC += goles;
    }

    public void addPuntos(int puntos){
        this.puntos += puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getgF() {
        return gF;
    }

    public int getgC() {
        return gC;
    }

    @Override
    public int compareTo(Equipo otroEquipo) {
        int comparacionPorPuntos = Integer.compare(puntos, otroEquipo.puntos);
        if (comparacionPorPuntos != 0) {
            return comparacionPorPuntos;
        }

        return this.nombre.compareTo(otroEquipo.nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipo equipo = (Equipo) o;

        return Objects.equals(nombre, equipo.nombre);
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(nombre).append("\t\t\t").append(puntos).append("\t\t").append(gF).append("\t").append(gC);
        return sb.toString();
    }
}