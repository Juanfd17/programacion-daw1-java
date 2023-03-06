import java.util.Date;

public abstract class Cliente {
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private String dni;
    private String tipo;
    private double precio;

    public Cliente(String nombre, String apellidos, int anioNacimento, int mesNacimiento, int diaNacimiento, String dni, String tipo, double precio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = new Date(anioNacimento, mesNacimiento, diaNacimiento);
        this.dni = dni;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getTextoComprarEntrada() {
        return "El cliente " + getNombre() + " " + getApellidos() + " de tipo Cliente " + tipo + " a comprado una entrada";
    }

    public void comprarEntrada() {
        System.out.println(getTextoComprarEntrada());
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Apellidos: ").append(apellidos).append("\n");
        sb.append("FechaNacimiento: ").append(fechaNacimiento.getYear()).append(":").append(fechaNacimiento.getMonth()).append(":").append(fechaNacimiento.getDay()).append("\n");
        sb.append("Dni: ").append(dni).append("\n");
        sb.append("Tipo cuenta: ").append(this.getClass().getSimpleName()).append("\n");
        return sb.toString();
    }
}