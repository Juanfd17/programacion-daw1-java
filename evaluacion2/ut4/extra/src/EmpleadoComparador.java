import java.util.Comparator;

public class EmpleadoComparador implements Comparator<Empleado> {
    @Override
    public int compare(Empleado o1, Empleado o2) {
        int r;

        if (o1.getSalario() > o2.getSalario()){
            r = 1;
        } else if (o1.getSalario() == o2.getSalario()) {
            r = 0;
        } else {
            r = -1;
        }

        return r;
    }
}