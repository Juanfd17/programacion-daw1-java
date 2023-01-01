/**
 * @author
 * @version 0.1
 */
public class Principal {

    /**
     * Punto de entrada de la aplicación.
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cesar", "El azote de los programadores", 100);
        Libro libro2 = new Libro("Cervantes", "Historias de debajo de la luna", 50);

        libro1.setNumeroReferencia("978-3-16-148410-0");
        libro2.setNumeroReferencia("978-880-14-2517-5");

        Libro.printDetalles(libro1);

        Libro.printDetalles(libro2);

        libro1.prestar();
        libro1.prestar();

        Libro.printDetalles(libro1);
    }
}
