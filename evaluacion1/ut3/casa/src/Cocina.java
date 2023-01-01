public class Cocina {

    private boolean tieneMesa;
    private Frigorifico frigorifico;
    private double metrosCuadrados;

    public Cocina(boolean tieneMesa, Frigorifico frigorifico, double metrosCuadrados) {
        this.tieneMesa = tieneMesa;
        this.frigorifico = frigorifico;
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("---Cocina---");
        sb.append("\ntieneMesa: ").append(tieneMesa);
        if (frigorifico != null) {
            sb.append("\nfrigorifico: ").append(frigorifico);
        }
        sb.append("\nmetrosCuadrados: ").append(metrosCuadrados);
        return sb.toString();
    }
}
