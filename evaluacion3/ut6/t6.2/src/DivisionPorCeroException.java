public class DivisionPorCeroException extends Exception{
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("No se puede dividir por 0");
        return sb.toString();
    }
}
