package src.ejercicio1;
/**
 * @author Esta clase modela la consigna de una estación de RENFE en la que se pueden
 * alquilar 2 tipos de taquillas: pequeñas y grandes.
 * Las tarifas de la consigna son las siguientes:
 * - 2€ por hasta 3 horas
 * - 0,50€ más por cada hora completa adicional o parte de hora de exceso de
 * las 3
 * - por las taquillas grandes se paga además un plus de 5€sea cual sea su
 * tiempo de alquiler
 * - los viajeros que están de Interrail tienen un descuento del 10% sobre su
 * importe total.
 * <p>
 * Se trata de calcular lo que cada cliente ha de pagar según su tiempo de
 * alquiler (por simplicidad consideramos que una taquilla no está ocupada
 * más de un día)
 * <p>
 * La consigna además realiza otros cálculos adicionales para obtener diferentes
 * estadísticas
 */
public class Consigna {
    private static int cliente = 0;
    final char PEQUENA = 'P';
    final char GRANDE = 'G';
    final double HASTA_3HORAS = 2.0;
    final double PRECIO_HORA = 0.5;
    final  double PLUS_GRANDE = 5.0;
    final  double DESCUENTO_INTERRAIL = 0.10;

    String nombre;
    int pequenas;
    int grandes;
    double importeAcumulado;
    double clienteMax = 0;
    int NClienteMax = 0;

    /**
     * Constructor de la clase Consigna
     * Recibe un parámetro, el nombre de la estación
     * e inicializa los atributos adecuadamente
     */
    public Consigna(String nombre) {
        this.nombre = nombre;
        this.pequenas = 0;
        this.grandes = 0;
        this.importeAcumulado = 0;
    }

    /**
     * Mutador para el nombre de la estación
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Accesor para el importe total recogido por la consigna en el día
     */
    public double getTotalAcumulado() {
        return importeAcumulado;
    }

    /**
     * Este método simula la facturación a un cliente por el uso de la consigna
     * en el día.
     * El método incluye 3 parámetros (suponemos todos correctos):
     * - tipo - indica el tipo de taquilla ('P' pequeña o 'G' grande)
     * - totalMinutos - cantidad de minutos que ha estado la taquilla
     * ocupada.
     * - carnetInterrail - a true si el cliente es un viajero que está de
     * Interrail, false en otro caso
     * <p>
     * Las tarifas de la consiga son las siguientes:
     * - 2€ mínimo por hasta 3 horas
     * _ 0.50€ más por cada hora completa adicional o parte de hora de exceso
     * de las 3
     * _ por las taquillas grandes se paga además un plus de 5€ sea cual sea
     * su tiempo de ocupación.
     * _ los viajeros de Interrail tienen un descuento del 10% sobre su
     * importe total
     * <p>
     * <p>
     * Hay que actualizar además los atributos registrando el nº de taquillas
     * pequeñas y grandes alquiladas y acumulando el importe total recogido por
     * la consigna entre todos los clientes.
     * <p>
     * Además se obtendrá el nº de cliente que más ha pagado
     * <p>
     * Una vez realizados los cálculos se imprimirá el ticket del cliente
     * (ver resultados de ejecución9
     * <p>
     * Analiza con una sentencia switch el tipo de taquilla
     * <p>
     * Evita repetir código
     */
    public void facturarCliente(char tipo, int totalMinutos, boolean carnetInterrail) {
        cliente++;
        double precio = HASTA_3HORAS;
        if (tipo == GRANDE){
            precio += PLUS_GRANDE;
        }

        int minutosMas = totalMinutos - (60*3);
        int horasMas = minutosMas/60;

        if (totalMinutos > 60*3){
            precio += horasMas * PRECIO_HORA;
            if (minutosMas % 60 != 0){
                precio += PRECIO_HORA;
            }
        }

        if (carnetInterrail){
            double descuento = precio * DESCUENTO_INTERRAIL;
            precio -= descuento;
        }

        importeAcumulado += precio;

        if (clienteMax < precio){
            NClienteMax = cliente;
            clienteMax = precio;
        }

        int horasFactura =totalMinutos / 60;
        if (totalMinutos % 60 != 0){
            horasFactura++;
        }

        System.out.println("Estacion: " + this.nombre);
        System.out.println("Ticket consigna cliente nº: " + cliente);
        System.out.println("Total de minutos a facturar: " + totalMinutos);
        System.out.println("Total horas a facturar: " + horasFactura);
        System.out.println("Tipo taquilla: " + tipoTaquilla(tipo));
        System.out.println("Carnet Interrail: " + carnetInterrail);
        if (tipo == GRANDE){
            System.out.println("Con suplemento: " + PLUS_GRANDE + "€");
        }
        System.out.println("Importe total a pagar: " + precio + "€");
    }

    private String tipoTaquilla(char tipo){
        switch (tipo){
            case GRANDE:
                return "GRANDE";
            case PEQUENA:
                return "PEQUEÑA";
        }
        return "NO EXISTE";
    }

    /**
     * Imprimir cliente que más ha pagado y la cantidad abonada
     */
    public void printMaximo() {
        System.out.println("Nº de cliente que más ha pagado: " + NClienteMax);
        System.out.println("Cantidad abonada: " + clienteMax + "€");
    }
}