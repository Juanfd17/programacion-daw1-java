package ej4a5;

import java.util.Date;

public class Revista extends Publicacion{
    String periodicidad;

    public Revista(String titulo, Date fecha, String periodicidad) {
        super(titulo, fecha);
        this.periodicidad = periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }
}
