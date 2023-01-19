package ej4a7;

public class CuentaAhorro extends Cuenta {
    private double interes;

    public CuentaAhorro(String nombreCliente, double importe, double interes) {
        super(nombreCliente, importe);
        this.interes = interes;
    }

    public double getInteres(){
        return interes * getImporte();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Interes: ").append(getInteres()).append("\n");
        return sb.toString();
    }
}
