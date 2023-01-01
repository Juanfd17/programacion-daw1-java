
/**
 * Escriba la descripción de la clase FacturaLuz aquí.
 * La clase guarada inforamción acerca del consumo de luz efectuado 
 * @author (su nombre) 
 * @version (nº versión o fecha)
 */
public class FacturaLuz {
    private final double valor_KW = 8.6;
    private final int iva = 16;
    // consumo en el inicio del período a facturar
    private int lecturaAnterior;
    // consumo al final del período a facturar
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
