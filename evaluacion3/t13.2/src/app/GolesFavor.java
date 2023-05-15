package app;

import java.util.Comparator;

public class GolesFavor implements Comparator<Equipo> {
    @Override
    public int compare(Equipo o1, Equipo o2) {
        return o2.getGolesAFavor() - o1.getGolesAFavor();
    }
}
