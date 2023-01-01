public class Bano {

    private boolean tieneDucha;

    private double metrosCuadrados;

    public Bano(boolean tieneDucha, double metrosCuadrados) {
        this.tieneDucha = tieneDucha;
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("---Baño---");
        sb.append("\ntieneDucha: ").append(tieneDucha).append("\nmetrosCuadrados: ").append(metrosCuadrados);
        return sb.toString();
    }
}
