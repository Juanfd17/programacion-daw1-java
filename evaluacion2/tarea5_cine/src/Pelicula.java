import java.util.Date;

public class Pelicula {
    private String nombre;
    private Date estreno;
    private int entradasVendidas;
    private double[] horas;
    private boolean infantil;
    private String productora;

    //numeros negativos si no tiene alguna hora
    public Pelicula(String nombre, int anioEstreno, int mesEstreno, int diaEstreno, int entradasVendidas, double hora1, double hora2, double hora3, double hora4, boolean infantil, String productora) {
        this.nombre = nombre;
        this.estreno = new Date(anioEstreno,mesEstreno,diaEstreno);
        this.entradasVendidas = entradasVendidas;
        double[] horas = {hora1, hora2, hora3, hora4};
        this.horas = horas;
        this.infantil = infantil;
        this.productora = productora;
    }

    public boolean isInfantil() {
        return infantil;
    }

    public void entradaComprada(){
        entradasVendidas++;
    }

    public int getAnioEstreno(){
        return estreno.getYear();
    }

    public String getNombre(){
        return nombre;
    }

    public String horas(){
        final StringBuilder sb = new StringBuilder();
        for (double hora:horas) {
            if (hora>= 0){
                sb.append(hora).append(" - ");
            }
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Estreno: ").append(estreno.getYear()).append(":").append(estreno.getMonth()).append(":").append(estreno.getDay()).append("\n");
        sb.append("Entradas vendidas: ").append(entradasVendidas).append("\n");
        sb.append("Horas a las que se reproduce: ").append(horas()).append("\n");
        if (this.infantil){
            sb.append("Es ");
        } else {
            sb.append("No es ");
        }
        sb.append("una pelicula infantil ").append("\n");
        sb.append("Productora: ").append(productora).append("\n");
        return sb.toString();
    }
}
