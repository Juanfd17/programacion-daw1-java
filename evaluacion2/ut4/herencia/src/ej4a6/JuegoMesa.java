package ej4a6;

public class JuegoMesa extends Juego{

    public JuegoMesa(String titulo, double duracion, boolean loTengo, String comentario, int numeroJugadores) {
        super(titulo, duracion, loTengo, comentario, numeroJugadores);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JuegoMesa{");
        sb.append(super.toString());
        return sb.toString();
    }
}
