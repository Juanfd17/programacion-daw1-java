package ej4a6;

public class Juego extends Articulo{
    private int numeroJugadores;

    public Juego(String titulo, double duracion, boolean loTengo, String comentario, int numeroJugadores) {
        super(titulo, duracion, loTengo, comentario);
        this.numeroJugadores = numeroJugadores;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("numeroJugadores: ").append(numeroJugadores).append("\n");
        return sb.toString();
    }
}
