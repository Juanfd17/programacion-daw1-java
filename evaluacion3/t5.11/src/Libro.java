import java.util.Objects;
import java.util.SplittableRandom;
import java.util.StringTokenizer;

/**
 * Describe un libro de la biblioteca
 *
 */

public class Libro implements Comparable<Libro> {
    private String titulo;
    private String autor;
    private Genero genero;
    private int ejemplares;  

    
    /**
     * Constructor de la clase Libro
     * Recibe todos los datos de un libro en una
     * cadena de caracteres de la forma
     * "titulo:autor:genero:ejemplares"
     * Ej. "Harry potter y el legado maldito:J. K.- Rowling:juvenil:6"
     *      la Ciudad y los perros:mario- vargas llosa:novela:3
     * 
     * A partir de este valor hay que parsear la cadena para extraer
     * los valores que se asignar�n a los atributos. Todos los atributos
     * se guardan en may�sculas y sin espacios a izquiera y derecha
     * 
     * autor contiene el nombre y apellidos del autor separados por un gui�n
     * Esto permitir� nombres  compuestos y varios apellidos 
     * "nombre - apellidos" 
     * 
     * Ej.   mario- vargas llosa  
     *       J. K.- Rowling
     * 
     * Hay que usar el m�todo privado obtenerAutor()
     *  (ver el contenido del fichero libros.txt)
     */
    public Libro(String datosLibro) {
        StringTokenizer st = new StringTokenizer(datosLibro, ":");
        titulo = st.nextToken().toUpperCase().trim();
        autor = obtenerAutor(st.nextToken()).toUpperCase().trim();
        genero = Genero.valueOf(st.nextToken().toUpperCase().trim());
        ejemplares = Integer.parseInt(st.nextToken());
    }

    /**
     *  Recibe el nombre de un autor de la forma "nombre - apellidos" y
     *  lo devuelve como la cadena "APELLIDOS, NOMBRE"
     *  
     *  No se puede utilizar split() ni charAt()
     */
    private String obtenerAutor(String autor) {
        StringTokenizer st = new StringTokenizer(autor, "-");
        String nombre = st.nextToken().trim();
        String apellidos = st.nextToken().trim();

        return apellidos + ", " + nombre;
    }

    /**
     * 
     * @return accesor para el titulo
     *       
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * 
     * @return devuelve el autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * 
     * @return devuelve el g�nero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * 
     * @return devuelve el n� de ejemplares
     */
    public int getEjemplares() {
        return ejemplares;
    }


    /**
     * 
     * mutador para el n� de ejemplares
     */
    public void incrementar(int ejemplares) {
        this.ejemplares += ejemplares;
    }


    /**
     * @return representaci�n textual del libro
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Titulo: ").append(titulo).append("\n");
        sb.append("Autor: ").append(autor).append("\n");
        sb.append("Genero: ").append(genero).append(" Nº ejemplares: ").append(ejemplares);
        return sb.toString();
    }

    /**
     *  
     */
    public void printLibro()
    {
        System.out.println(this.toString());
    }


    @Override
    public int compareTo(Libro o) {
        int posicion = this.titulo.compareTo(o.getTitulo());
        if (posicion == 0){
            return this.autor.compareTo(o.getAutor());
        }

        return posicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Libro libro = (Libro) o;

        if (!Objects.equals(titulo, libro.titulo)) return false;
        if (!Objects.equals(autor, libro.autor)) return false;
        return genero == libro.genero;
    }

    @Override
    public int hashCode() {
        int result = titulo != null ? titulo.hashCode() : 0;
        result = 31 * result + (autor != null ? autor.hashCode() : 0);
        result = 31 * result + (genero != null ? genero.hashCode() : 0);
        return result;
    }
}
