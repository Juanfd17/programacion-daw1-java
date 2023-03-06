import java.util.Comparator;

public class ComparadorCasa implements Comparator<Casa> {
    @Override
    public int compare(Casa o1, Casa o2) {
        int r;

        if (o1.getSuperficie() > o2.getSuperficie()){
            r = 1;
        } else if (o1.getSuperficie() == o2.getSuperficie()){
            r = 0;
        } else {
            r = -1;
        }

        return r;
    }
}
