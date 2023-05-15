public class ExcepcionOperadorInvalido extends Throwable {
    String operador;

    public ExcepcionOperadorInvalido(String operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(operador + " no es un operador elege un operador como + - * /");
        return sb.toString();
    }
}
