public class Personaje {
    private final char NORTE = 'N';
    private final char SUR = 'S';
    private final char ESTE = 'E';
    private final char OESTE = 'O';

    private String nombre;
    private int cordenadaX;
    private int cordenadaY;
    private char orientacion;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.cordenadaX = 0;
        this.cordenadaY = 0;
        this.orientacion = NORTE;
    }

    public void avanzar(int distancia) {
        if (this.orientacion == NORTE) {
            this.cordenadaY += distancia;
        } else if (this.orientacion == SUR) {
            this.cordenadaY -= distancia;
        } else if (this.orientacion == ESTE) {
            this.cordenadaX += distancia;
        } else {
            this.cordenadaX -= distancia;
        }
    }

    public void girar() {
        switch (this.orientacion) {
            case NORTE:
                orientacion = ESTE;
                break;
            case ESTE:
                orientacion = SUR;
                break;
            case SUR:
                orientacion = OESTE;
                break;
            case OESTE:
                orientacion = NORTE;
                break;

        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje = ").append(this.nombre).append("\n");
        sb.append("Orientacion = ").append(this.orientacion).append("\n");
        sb.append("Posicion = [").append(cordenadaX).append(" , ").append(cordenadaY).append(" ]");
        return sb.toString();
    }
}
