package src.ejercicio1;

import java.util.Scanner;

/**
 * class DemoConsigna
 * Clase para testear la clase Consigna
 */
public class DemoConsigna {

    private Consigna consigna;

    /**
     * Constructor de la clase DemoConsigna
     */
    public DemoConsigna() {
        consigna = new Consigna("ATOCHA");
    }

    /**
     *
     */
    public void demo() {
        consigna.facturarCliente('P', 190, true);
        System.out.println();
        consigna.facturarCliente('G', 450, false);
        System.out.println();
        consigna.facturarCliente('P', 124, false);
        System.out.println();
        consigna.facturarCliente('P', 650, false);
        System.out.println();
        consigna.facturarCliente('G', 245, true);
        System.out.println();

        System.out.println("Total acumulado por la consigna en el día " +
                consigna.getTotalAcumulado() + "€");
        consigna.printMaximo();
    }
}
