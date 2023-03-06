package ej4a5;

import java.util.Date;

public class Publicacion {
    private String titulo;
    private Date fecha;

    public Publicacion(String titulo, Date fecha) {
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
