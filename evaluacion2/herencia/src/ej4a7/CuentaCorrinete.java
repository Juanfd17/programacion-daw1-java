package ej4a7;

public class CuentaCorrinete extends Cuenta {
    private double recargo;
    private double importeMinimo;

    public CuentaCorrinete(String nombreCliente, double importe, double recargo, double importeMinimo) {
        super(nombreCliente, importe);
        this.recargo = recargo;
        this.importeMinimo = importeMinimo;
    }

    public double getRecargo(){
        if (getImporte() >= importeMinimo){
            this.recargo = 0;
        }
        return recargo;
    }

    public double getImporteMinimo(){
        return this.importeMinimo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("ImporteMinimo: ").append(getImporteMinimo()).append("\n");
        sb.append("Recargo: ").append(getRecargo()).append("\n");
        return sb.toString();
    }
}
