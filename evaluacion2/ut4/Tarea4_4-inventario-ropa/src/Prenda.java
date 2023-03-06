public class Prenda {
    private String codigo;
    private String descripcion;
    private double precio;

    public Prenda(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("codigo: ").append(codigo).append("\n");
        sb.append("descripcion: ").append(descripcion).append("\n");
        sb.append("precio: ").append(precio).append("\n");
        return sb.toString();
    }

    public boolean equals(Prenda obj) {
        if (!(obj instanceof Prenda)) {
            return false;
        }

        return this.codigo.equals(obj.codigo) && this.descripcion.equals(obj.descripcion) && this.precio == obj.precio;
    }
}
