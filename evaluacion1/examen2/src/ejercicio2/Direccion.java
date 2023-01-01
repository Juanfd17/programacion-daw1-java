package src.ejercicio2;

/**
 *  Un objeto de esta clase representa 
 *  la dirección de movimiento del personaje
 *   
 */
public class Direccion
{

    private final int ESTE = 1;  
    private final int OESTE = 2;  
    private int direccion; // la dirección del personaje

    /**
     * Constructor  
     */
    public Direccion()
    {
        direccion = ESTE;

    }

    /**
     * Constructor  
     */
    public Direccion(int direccion)
    {
        this.direccion = direccion;

    }


    /**
     *  accesor para la direccion
     */
    public int getDireccion()
    {
        return direccion;
    }

    /**
     *  devuelve true si la dirección es ESTE, false en otro caso
     */
    public boolean esEste()
    {
        return direccion == ESTE;
    }

    /**
     * Mutador para la dirección
     * Cambia la dirección de movimiento del personaje
     *  
     */
    public  void cambiarDireccion()
    {
        if (direccion == ESTE)
        {
            direccion = OESTE;
        }
        else
        {
            direccion = ESTE;
        }
    }

    /**
     * Representación textual de la dirección
     *  
     */
    public  String toString()
    {
        String strDireccion = "Dirección: ";
        if (direccion == ESTE)
        {
            strDireccion = "ESTE";
        }
        else
        {
            strDireccion = "OESTE";
        }
        return  strDireccion ;
    }
}
