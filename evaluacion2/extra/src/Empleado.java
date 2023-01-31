public class Empleado extends Persona {
    double salario;
    String departamento;
    private Rol rol;

    public Empleado(String direccion, int edad, String nombre, Rol rol) {
        super(direccion, edad, nombre);
        this.salario = rol.getSalario();
        this.departamento = rol.getNombre();
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Salario: ").append(salario).append("\n");
        sb.append("Departamento: ").append(departamento).append("\n");
        return sb.toString();
    }
}
