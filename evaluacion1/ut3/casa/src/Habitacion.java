public class Habitacion {
    private int numeroCamas;
    private double metrosCuadrados;
    private int numerosArmarios;
    private Bano bano;

    public Habitacion(int numeroCamas, double metrosCuadrados, int numerosArmarios) {
        this.numeroCamas = numeroCamas;
        this.metrosCuadrados = metrosCuadrados;
        this.numerosArmarios = numerosArmarios;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("---Habitacion---");
        sb.append("\nnumeroCamas: ").append(numeroCamas);
        sb.append("\nmetrosCuadrados: ").append(metrosCuadrados);
        sb.append("\nnumerosArmarios:").append(numerosArmarios);
        if (bano != null) {
            sb.append("\nbano: \n").append(bano);
        }
        return sb.toString();
    }

    public Bano getBano() {
        return bano;
    }

    public void setBano(Bano bano) {
        this.bano = bano;
    }
}
