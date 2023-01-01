package src.ejercicio2;


/**
 * @author -
 * <p>
 * Un objeto de esta clase representa a una máquina lanzadora situado en una
 * determinada posición en un espacio bidimensional
 * <p>
 * La lanzadora se mueve solo en horizontal
 * <p>
 * Cada vez que se mueve avanza una distancia aleatoria según la
 * dirección que tenga
 */

public class Lanzadora {
    private Punto posicion;  // posición de la lazadora   
    private Direccion direccion;  // dirección actual de movimiento de la lanzadora
    private int movimientos; // nº movimientos de la lanzadora
    private int movimientosRealizados;

    /**
     * Constructor - crea lanzadora
     * La posición inicial es (0, 0) y la
     * dirección inicial siempre es ESTE
     * <p>
     * El resto de atributos se inicializan adecuadamente
     */
    public Lanzadora() {
        this.posicion = new Punto(0,0);
        this.direccion = new Direccion();
        this.movimientos = (int) (Math.random() * 5);
        this.movimientosRealizados = 0;
    }

    /**
     * Constructor - crea la lanzadora
     * La posición inicial es (x, y) y la
     * dirección inicial la que indica el parámetro
     * <p>
     * Crea además el generador
     */
    public Lanzadora(int x, int y, Direccion direccion) {
        this.posicion = new Punto(x,y);
        this.direccion = direccion;
        this.movimientos = (int) (Math.random() * 5);
    }

    /**
     * Accesor para la posición de la lanzadora
     */
    public Punto getPosicion() {
        return posicion;
    }

    /**
     * Mutador para la posición de la lanzadora
     */
    public void setPosicion(Punto posicion) {
        this.posicion = posicion;
    }

    /**
     * Accesor para la dirección
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Mutador para la dirección
     * Cambia la dirección de movimiento de la lanzadora
     */
    public void cambiarDireccion() {
        direccion.cambiarDireccion();
    }

    /**
     * La lanzadora se mueve avanzando una distancia aleatoria,
     * un valor entre 10 y 40 (inclusive) según su dirección
     * Habrá   que   actualizar   el   estado   la lanzadora
     * adecuadamente (su posición y movimientos)
     * Muestra en pantalla un mensaje indicando el nº de movimientos,
     * y la dirección y distancia que se va a avanzar - (el valor aleatorio generado)
     */
    public void mover() {
        movimientosRealizados++;
        int movimiento = (int) (Math.random() * (41 - 10)) + 10;
        String deIz;
        if (direccion.getDireccion() == 1){
            posicion.setX(posicion.getX() + movimiento);
            deIz = "derecha (este)";
        } else {
            posicion.setX(posicion.getX() - movimiento);
            deIz = "izquierda (oeste)";
        }


        System.out.println("Movimientos: " + movimientosRealizados);
        System.out.println("Avanzando hacia la " + deIz + " " + movimiento);
    }

    /**
     * Representación textual de la lanzadora
     * Se indica la dirección en la que se mueve y posición actual
     * (ver resultados ejecución)
     */
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Direccion: ");
        if (direccion.getDireccion() == 1) {
            sb.append("ESTE");
        } else {
            sb.append("OESTE");
        }
        sb.append("\nPosicion: ").append(posicion);
        return sb.toString();
    }

    /**
     * Representación textual de la lanzadora
     * Se indica la dirección en la que se mueve y posición actual
     * (ver resultados ejecución)
     */

}
