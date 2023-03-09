public enum Turnos {
    MANANA("m", 8), TARDE("t", 7), NOCHE("n", 5);

    String nombre;
    int nHoras;

    Turnos(String nombre, int nHoras) {
        this.nombre = nombre;
        this.nHoras = nHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public int getnHoras() {
        return nHoras;
    }
}
