/**
 * TicketMachine models a ticket machine that issues flat-fare tickets. The
 * price of a ticket is specified via the constructor. Instances will check to
 * ensure that a user only enters sensible amounts of money, and will only print
 * a ticket if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MaquinaExpendedora {
    // El precio de un ticket en esta máquina
    private int precio;
    // Cantidad de dinero introducida por el usuario hasta ahora
    private int importe;
    // Cantidad total de dinero recogida por la máquina
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public MaquinaExpendedora(int precioTicket) {
        precio = 0;
        importe = 0;
        total = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Return The amount of money already inserted for the next ticket.
     */
    public int getImporte() {
        return importe;
    }

    /**
     * Receive an amount of money from a customer. Check that the amount is
     * sensible.
     */
    public void insertarDinero(int cantidad) {
        if (cantidad > 0) {
            importe = importe + cantidad;
        } else {
            System.out.println("Use a positive amount rather than: " + cantidad);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and reduce the current
     * balance by the ticket price. Print an error message if more money is
     * required.
     */
    public void imprimirTicket() {
        if (importe >= precio) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + precio + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + precio;
            // Reduce the balance by the price.
            importe = importe - precio;
        } else {
            System.out.println("Debes insertar al menos: " + (precio - importe) + " centimos m�s.");

        }
    }

    /**
     * Return the money in the balance. The balance is cleared.
     */
    public int devolverImporte() {
        int importeADevolver;
        importeADevolver = importe;
        importe = 0;
        return importeADevolver;
    }
}
