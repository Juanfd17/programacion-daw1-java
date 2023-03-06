package ej4a6;

public class DVD extends Articulo{
    private String director;

    public DVD(String titulo, double duracion, boolean loTengo, String comentario, String director) {
        super(titulo, duracion, loTengo, comentario);
        this.director = director;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("director: ").append(director).append("\n");
        return sb.toString();
    }
}
