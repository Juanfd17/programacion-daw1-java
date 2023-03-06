package ej4a5;

import java.util.Date;

public class Libro extends Publicacion{
    private String autor;
    private String ISBN;

    public Libro(String titulo, Date fecha,String autor, String ISBN) {
        super(titulo,fecha);
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
