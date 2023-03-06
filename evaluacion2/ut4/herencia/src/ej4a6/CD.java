package ej4a6;

public class CD extends Articulo{
    private String artista;
    public int numeroPistas;

    public CD(String titulo, double duracion, boolean loTengo, String comentario, String artista, int numeroPistas) {
        super(titulo, duracion, loTengo, comentario);
        this.artista = artista;
        this.numeroPistas = numeroPistas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("artista: ").append(artista).append("\n");
        sb.append("numeroPistas: ").append(numeroPistas).append("\n");
        return sb.toString();
    }
}
