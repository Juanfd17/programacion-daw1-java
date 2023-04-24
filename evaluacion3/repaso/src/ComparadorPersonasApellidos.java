import java.util.Comparator;

public class ComparadorPersonasApellidos implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getApellidos().compareTo(o2.getApellidos());
    }
}
