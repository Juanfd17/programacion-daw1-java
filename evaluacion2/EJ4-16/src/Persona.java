public class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(nombre).append("\n");
        return sb.toString();
    }
}
