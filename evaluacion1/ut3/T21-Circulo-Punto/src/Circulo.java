
/**
 * La clase representa a circulos con un centro
 * y un valor determinado de radio
 * 
 * @author 
 * @version 
 */
public class Circulo
{
    private final double PI = 3.14;
    private double radio;
    private Punto centro;

     /**
     * constructor para los objetos de la clase Circulo
     * 
     */
    public Circulo(){
       
    }

    public Circulo(double radio, Punto centro){
        this.radio = radio;
        this.centro = centro;
    }

    public Circulo(double radio){
        this.radio = radio;
        this.centro = new Punto(0, 0);
    }

    /**
     * 
     * @return devuelve el radio del círculo    
     */
    public double getRadio(){
        return radio;
    }

    /**
     * 
     * @param   El nuevo valor del radio
     */
    public void setRadio(int nuevoRadio){
        radio = nuevoRadio;
    }
    
    /**
     * @return devuelve el área del círculo
     **/
    public double calcularArea(){
        return 2 * PI * radio * radio;
    }
    
    /**
     * @return devuelve el perímetro del círculo
     */
    public double calcularPerímetro(){
        return 2 * PI * radio;
    }

    public String getCentro(){
        return this.centro.toString();
    }

    public void setCentroX(int x){
        this.centro.setX(x);
    }

    public void setCentroY(int y){
        this.centro.setY(y);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("radio: ").append(radio).append("\n");
        sb.append("centro: ").append(centro);
        return sb.toString();
    }

    public String printCirculo(){
        return toString();
    }
}