public class Fisioterapeuta extends Empleado{
    boolean internacional;

    public Fisioterapeuta(String codigo, String nombre, String apellido, int edad, boolean internacional) {
        super(codigo, nombre, apellido, edad);
        this.internacional = internacional;
    }
}
