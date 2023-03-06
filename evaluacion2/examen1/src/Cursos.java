public abstract class Cursos {
    private String nombre;
    private double precio;
    private double horas;

    public Cursos(String nombre, double precio, double horas) {
        this.nombre = nombre;
        this.precio = precio;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getHoras() {
        return horas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        if (!this.getNombre().equals(((Cursos) o).getNombre())){
            return false;
        }

        if (this.getHoras() != ((Cursos)o).getHoras()){
            return false;
        }

        return true;
    }

    public int compareTo(Cursos otra) {
        return Double.compare(otra.horas, this.horas);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("------[").append(nombre).append("]------\n");
        sb.append("Tipo: [").append(getClass().getSimpleName()).append("]\n");
        sb.append("Precio: [").append(precio).append("]€\n");
        sb.append("Horas: [").append(horas).append("]\n");
        return sb.toString();
    }
}
