public class Frigorifico {
    private int numeroCajones;
    private int numeroEstanterias;
    private boolean tieneCongelador;

    public Frigorifico(int numeroCajones, int numeroEstanterias, boolean tieneCongelador) {
        this.numeroCajones = numeroCajones;
        this.numeroEstanterias = numeroEstanterias;
        this.tieneCongelador = tieneCongelador;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n-Frigorifico-");
        sb.append("\nnumeroCajones: ").append(numeroCajones);
        sb.append("\nnumeroEstanterias: ").append(numeroEstanterias);
        sb.append("\ntieneCongelador: ").append(tieneCongelador);
        return sb.toString();
    }
}
