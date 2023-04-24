
/**
 * Modela una biblioteca
 *  
 */
import java.util.*;
import java.io.File;
import java.io.IOException;

public class Biblioteca
{

    private String nombre;
    private Set<Libro> libros;
    private int pos;

    /**
     * Constructor de la clase Biblioteca
     * crea e inicializa adecuadamente los atributos
     */
    public Biblioteca(String nombre, int n) {
         this.nombre =nombre;
         libros = new TreeSet<>();
         pos = n;
    }

    /**
     * Accesor para el nombre de la biblioteca
     * 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *  devuelve true si la biblioteca est� llena
     *  (ya no se pueden a�adir m�s t�tulos distintos)
     */
    public boolean estaLlena() {
        return libros.size() == pos;
    }

    /**
     * LLega un  libro  a la biblioteca y hay que a�adirlo
     * El libro se a�ade de forma que quede ordenado por título
     * (ojo! no hay que ordenar sino insertar en orden)
     * 
     *  
     *  Si el libro ya est� en la biblioteca
     *  significa que llega un nuevo ejemplar de ese t�tulo
     *  por lo tanto se incrementa el n� de ejemplares de ese libro
     *  
     *  Si no est� el t�tulo se a�ade como nuevo libro solo si hay sitio
     *   
     *  Se devuelve true si se ha podido registrar el libro, false en otro caso
     */
    public boolean addLibro(Libro libro) {
        for (Libro l: libros) {
            if (l.equals(libro)){
                l.incrementar(libro.getEjemplares());
                return true;
            }
        }

        if (!estaLlena()){
            libros.add(libro);
            return true;
        }

        return false;
    }

    /**
     *  Obtener todos los t�tulos diferentes
     *  que contengan en su nombre la cadena str.
     *  Es indiferente may�sculas o min�sculas
     *  Los t�tulos se devuelven ordenados
     */    
    public String[] titulos(String str) {
        List<String> libros = new ArrayList<>();
        for (Libro l: this.libros) {
            String titulo = l.getTitulo().toLowerCase();

            if (titulo.contains(str.toLowerCase())){
                libros.add(titulo);
            }
        }
        return libros.toArray(new String[0]);
    }

    /**
     * Cantidad de ejemplares de todos los libros
     * del autor indicado
     * Es indiferente may�sculas o min�sculas
     */
    public int totalEjemplaresDeAutor(String autor) {
        int cantidad = 0;
        for (Libro l: libros) {
            if (l.getAutor().equals(autor.toUpperCase())){
                cantidad += l.getEjemplares();
            }
        }

        return cantidad;
    }

    /**
     *  borrar los libros del g�nero indicado
     */
    public void borrarDeGenero(Genero genero) {
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()){
            Libro l = it.next();
            if (l.getGenero().equals(genero)){
                it.remove();
            }
        }
    }

    /**
     * Representaci�n textual de la biblioteca
     * Hacerlo de forma eficiente
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(nombre).append("\n\n");
        for (Libro l: libros) {
            sb.append(l).append("\n\n");
        }
        return sb.toString();
    }

    /**
     * Lee de un fichero de texto los datos de los libros
     *   con ayuda de un objeto de la  clase Scanner
     *   y los guarda. El m�todo devuelve
     *   la cantidad de libros que no han podido ser registrados
     */
    public int cargarDeFichero() {
        int noRegistrados = 0;
        try
        {
            Scanner sc = new Scanner(new File("src/libros.txt"));
            while (sc.hasNextLine())
            {
                Libro libro = new Libro(sc.nextLine());
                boolean exito = addLibro(libro);
                if (!exito) {
                    noRegistrados++;
                }
            }
            sc.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return noRegistrados;
    }

    /**
     *  Punto de entrada a la aplicaci�n. Contiene c�digo para probar
     *  todos los m�todos de la clase Biblioteca
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca del IES Monte Naranco", 5);
        int noRegistrados = biblioteca.cargarDeFichero();
        System.out.println("No se han podido registrar en la biblioteca " +
            noRegistrados + " libros");

        System.out.println("Situaci�n inicial de la biblioteca\n") ;
        System.out.println(biblioteca.toString());

        /* ---------------------------*/
        String str = "poTTer";
        String[] titulos = biblioteca.titulos(str);
        System.out.println("T�tulos ordenados que contienen la cadena \"" + str +
            "\"\n" + Arrays.toString(titulos));

        /* ---------------------------*/
        String autor = "Vargas Llosa, Mario";
        int total =  biblioteca.totalEjemplaresDeAutor(autor);
        System.out.println("\nEjemplares en la biblioteca del autor \"" + autor + "\": " + total + "\n") ;

        /* ---------------------------*/
        Genero genero = Genero.BIOGRAFIA;
        biblioteca.borrarDeGenero(genero);
        System.out.println("\nDespu�s de borrar los t�tulos del g�nero " + genero.toString());
        System.out.println(biblioteca.toString());
    }
}
