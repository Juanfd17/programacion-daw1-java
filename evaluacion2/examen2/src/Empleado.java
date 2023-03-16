public class Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    private double[][] operaciones;

    public Empleado(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.operaciones = new double[2][3];
    }

    //Todos los atributos deben tener un get.

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double[][] getOperaciones() {
        return operaciones;
    }

    public void alquilar(Inmueble i){
        int tipo = tipo(i);
        operaciones[0][tipo] += i.getPrecio();
    }

    public void vender(Inmueble i){
        int tipo = tipo(i);
        operaciones[1][tipo] += i.getPrecio();
    }

    private int tipo(Inmueble i){
        int tipo = 0;
        if (i.getClass() == Vivienda.class){
            tipo = 0;
        } else if(i.getClass() == Garaje.class){
            tipo = 1;
        } else if (i.getClass() == Finca.class) {
            tipo = 2;
        }

        return tipo;
    }
}