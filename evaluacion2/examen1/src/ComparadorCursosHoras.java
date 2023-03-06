import java.util.Comparator;

public class ComparadorCursosHoras implements Comparator<Cursos> {

    @Override
    public int compare(Cursos o1, Cursos o2) {
        if (o1 == null){
            return 0;
        }

        return o1.compareTo(o2);
    }
}