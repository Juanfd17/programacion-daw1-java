package exceptions;

public class NumeroPersonasInvalido extends Exception {
    int personas;
    String mensaje;

    public NumeroPersonasInvalido(int personas, String mensaje) {
        this.personas = personas;
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("mensaje: ").append(mensaje).append("\n");
        sb.append("Numero de personas ").append(personas);
        return sb.toString();
    }
}
