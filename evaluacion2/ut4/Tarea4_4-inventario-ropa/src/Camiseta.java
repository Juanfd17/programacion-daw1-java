public class Camiseta extends Ropa{

    public Camiseta(String codigo, String descripcion, double precio, String talla) {
        super(codigo, descripcion, precio, talla);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString();
    }

    public boolean equals(Prenda obj) {
        return super.equals(obj);
    }
}
