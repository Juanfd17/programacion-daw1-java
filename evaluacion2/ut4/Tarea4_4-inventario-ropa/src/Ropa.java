public class Ropa extends Prenda{
    private String talla;

    public Ropa(String codigo, String descripcion, double precio, String talla) {
        super(codigo, descripcion, precio);
        this.talla = talla;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("talla: ").append(talla).append("\n");
        return sb.toString();
    }

    public boolean equals(Prenda obj) {
        return this.talla.equals(((Ropa)obj).talla) && super.equals(obj);
    }
}
