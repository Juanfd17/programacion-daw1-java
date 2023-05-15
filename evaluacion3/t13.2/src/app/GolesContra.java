package app;

import java.util.Comparator;

public class GolesContra implements Comparator<Equipo> {
    @Override
    public int compare(Equipo o1, Equipo o2) {
        return o2.getGolesEnContra() - o1.getGolesEnContra();
    }
}
