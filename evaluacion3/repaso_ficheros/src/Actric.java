import java.util.Set;
import java.util.TreeSet;

public class Actric implements Comparable<Actric>{
    private String nombre;
    private Set<Premio> premios;

    public Actric(String nombre) {
        this.nombre = nombre;
        this.premios = new TreeSet<>();
    }

    public Set<Premio> getPremios() {
        return premios;
    }

    public void setPremios(Set<Premio> premios) {
        this.premios = premios;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Actric o) {
       int posicion = o.getPremios().size() - this.getPremios().size();

        if (posicion == 0){
            posicion = -1;
        }

        return posicion;
    }

    public String toString(boolean edad) {
        final StringBuilder sb = new StringBuilder();
        sb.append(nombre).append("\t").append(premios.size()).append(" Oscars\n");
        for (Premio premio: premios) {
            sb.append(premio.toString(edad));
        }
        return sb.toString();
    }
}
