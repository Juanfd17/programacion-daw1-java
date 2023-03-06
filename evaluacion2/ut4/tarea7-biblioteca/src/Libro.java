public class Libro extends Alquilable{
    private int anio;
    private String autor;

    public Libro(String nombre, int id, int anio, String autor) {
        super(nombre, id);
        this.anio = anio;
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if (super.equals(o) && this.anio == ((Libro) o).getAnio() && this.autor.equals(((Libro) o).autor) && this.isAlquilado() == ((Libro) o).isAlquilado()){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("\n").append("Año: ").append(anio).append("\n");
        sb.append("Autor: ").append(autor).append("\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
