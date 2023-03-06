public class ClienteJoven extends Cliente {
    public ClienteJoven(String nombre, String apellidos, int anioNacimento, int mesNacimiento, int diaNacimiento, String dni) {
        super(nombre, apellidos, anioNacimento, mesNacimiento, diaNacimiento, dni, "Joven", 20);
    }
}
