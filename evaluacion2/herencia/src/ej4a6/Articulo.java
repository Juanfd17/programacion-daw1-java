package ej4a6;

public class Articulo {
    private String titulo;
    private double duracion;
    private boolean loTengo;
    private String comentario;

    public Articulo(String titulo, double duracion, boolean loTengo, String comentario) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.loTengo = loTengo;
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("titulo: ").append(titulo).append("\n");
        sb.append("duracion: ").append(duracion).append("\n");
        sb.append("loTengo: ").append(loTengo).append("\n");
        sb.append("comentario: ").append(comentario).append("\n");
        return sb.toString();
    }
}
