public enum Dias {
    LUNES(1,"Lunes"), Martes(2,"Martes"), MIERCOLES(3,"Miercoles"), JUEVES(4,"Jueves"), VIERNES(5,"Viernes"), SABADO(6, "Sabado"), DOMINGO(7, "Domingo");

    private int numero;
    private String nombre;

    Dias(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }
}
