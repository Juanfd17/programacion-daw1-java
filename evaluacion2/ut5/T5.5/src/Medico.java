public class Medico extends Empleado{
    int aniosExperiencia;

    public Medico(String codigo, String nombre, String apellido, int edad, int aniosExperiencia) {
        super(codigo, nombre, apellido, edad);
        this.aniosExperiencia = aniosExperiencia;
    }
}
