public class Premio implements Comparable<Premio>{
    private int anio;
    private String pelicula;
    private int edad;

    public Premio(int anio, String pelicula, int edad) {
        this.anio = anio;
        this.pelicula = pelicula;
        this.edad = edad;
    }

    public int getAnio() {
        return anio;
    }

    public String getPelicula() {
        return pelicula;
    }

    public int getEdad() {
        return edad;
    }

    public String toString(boolean edad) {
        final StringBuilder sb = new StringBuilder("\t-");
        if (edad){
            sb.append(this.edad).append(" años, ");
        }
        sb.append(pelicula).append(", ").append(anio).append("\n");
        return sb.toString();
    }

    @Override
    public int compareTo(Premio o) {
        int posicion = o.getAnio() - this.getAnio();
        if (posicion == 0){
            posicion = this.pelicula.compareTo(o.getPelicula());
        }
        return posicion;
    }
}
