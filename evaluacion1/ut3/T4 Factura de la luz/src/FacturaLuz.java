
/**
 * Escriba la descripci�n de la clase FacturaLuz aqu�.
 * La clase guarada inforamci�n acerca del consumo de luz efectuado 
 * @author (su nombre) 
 * @version (n� versi�n o fecha)
 */
public class FacturaLuz {
    private final double valor_KW = 8.6;
    private final int iva = 16;
    // consumo en el inicio del per�odo a facturar
    private int lecturaAnterior;
    // consumo al final del per�odo a facturar
    private int lecturaActual;

    private int kwConsumidos;

    /**
     * Constructor de la clase FacturaLuz
     */
    public FacturaLuz(){

    }

    public double obtenerConsumo(){
        return lecturaActual - lecturaAnterior;
    }

    public double obtenerImporteTotal(){
        return ((this.valor_KW * obtenerConsumo()) * iva) / 100;
    }
    
    
}
