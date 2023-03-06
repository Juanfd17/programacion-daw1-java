package ej4a8;

public class Aula {
    private String nombre;
    private int nPupitres;

    public Aula(String nombre, int nPupitres) {
        this.nombre = nombre;
        this.nPupitres = nPupitres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnPupitres() {
        return nPupitres;
    }

    public void setnPupitres(int nPupitres) {
        this.nPupitres = nPupitres;
    }

    public String monstrar() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Numero de pupitres: ").append(nPupitres).append("\n");
        return sb.toString();
    }
}
