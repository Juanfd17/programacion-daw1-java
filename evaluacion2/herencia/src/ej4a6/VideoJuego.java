package ej4a6;

public class VideoJuego extends Juego{
    String plataforma;

    public VideoJuego(String titulo, double duracion, boolean loTengo, String comentario, int numeroJugadores, String plataforma) {
        super(titulo, duracion, loTengo, comentario, numeroJugadores);
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("plataforma: ").append(plataforma).append("\n");
        return sb.toString();
    }
}
