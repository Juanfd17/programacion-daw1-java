public enum Dias {
    LUNES("L", 1), MARTES("M", 2), MIERCOLES("M", 3), JUEVES("J", 4), VIERNES("V", 5), SABADO("S", 6), DOMINGO("D", 7);

    String nom;
    int num;

    Dias(String nom, int num) {
        this.nom = nom;
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public int getNum() {
        return num;
    }
}
