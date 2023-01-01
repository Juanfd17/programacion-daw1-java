public class Salon {

    private boolean tieneSofa;

    private double metrosCuadrados;

    public Salon(boolean tieneSofa, double metrosCuadrados) {
        this.tieneSofa = tieneSofa;
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("---Salon---");
        sb.append("\ntieneSofa: ").append(tieneSofa);
        sb.append("\nmetrosCuadrados: ").append(metrosCuadrados);
        return sb.toString();
    }
}
