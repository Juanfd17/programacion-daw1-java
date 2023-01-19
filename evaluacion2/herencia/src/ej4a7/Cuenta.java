package ej4a7;

import java.util.stream.Stream;

public class Cuenta {
    private String nombreCliente;
    private double importe;

    public Cuenta(String nombreCliente, double importe) {
        this.nombreCliente = nombreCliente;
        this.importe = importe;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            setImporte(getImporte() + cantidad);
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (getImporte() - cantidad >= 0) {
                setImporte(getImporte() - cantidad);
            }
        }
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Nombre del cliente: ").append(getNombreCliente()).append("\n");
        sb.append("Importe: ").append(getImporte()).append("\n");
        return sb.toString();
    }
}
