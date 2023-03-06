class ClienteJubilado extends Cliente {
    public ClienteJubilado(String nombre, String apellidos, int anioNacimento, int mesNacimiento, int diaNacimiento, String dni) {
        super(nombre, apellidos, anioNacimento, mesNacimiento, diaNacimiento, dni, "Jubilado", 20);
    }
}
