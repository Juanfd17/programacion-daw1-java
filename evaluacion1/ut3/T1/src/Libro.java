/**
 * Esta clase mantiene información sobre un libro.
 * Podría formar parte de una aplicación más grande como un sistema que gestionase una librería, por ejemplo.
 *
 * @author (Introduce tu nombre)
 * @version (Inserta la fecha de hoy)
 */

public class Libro {
    // los atributos
    private String autor;

    private String titulo;

    private int numeroPaginas;

    private String numeroReferencia;

    private int vecesPrestado;


    /**
     * establecer el autor y el título cunado el objeto se construya
     */

    public Libro(String autor, String titulo, int numeroPaginasTiene) {
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginasTiene;
        this.numeroReferencia = "";
        this.vecesPrestado = 0;
    }

    // Añadir los métodos ...

    public static void printDetalles(Libro libro) {
        System.out.println("--------------------");
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Numero de paginas: " + libro.getNumeroPaginas());
        System.out.println("Numero de referencia: " + libro.getNumeroReferencia());
        System.out.println("Veces prestado: " + libro.getVecesPrestado());
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    public int getVecesPrestado() {
        return vecesPrestado;
    }

    public void prestar() {
        vecesPrestado++;
    }

    public void setNumeroReferencia(String numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

}
