class ClienteVip extends Cliente {
    private int entradasCompradas;


    public ClienteVip(String nombre, String apellidos, int anioNacimento, int mesNacimiento, int diaNacimiento, String dni) {
        super(nombre, apellidos, anioNacimento, mesNacimiento, diaNacimiento, dni, "Vip", 30);
        entradasCompradas = 0;
    }

    public int getEntradasCompradas() {
        return entradasCompradas;
    }

    public void comprarEntrada() {
        System.out.println(getTextoComprarEntrada());
        entradasCompradas++;
    }
}
