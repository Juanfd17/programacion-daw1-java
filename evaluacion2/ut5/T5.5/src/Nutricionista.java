public class Nutricionista extends Empleado{
    String categoria;

    public Nutricionista(String codigo, String nombre, String apellido, int edad, String categoria) {
        super(codigo, nombre, apellido, edad);
        this.categoria = categoria;
    }
}
