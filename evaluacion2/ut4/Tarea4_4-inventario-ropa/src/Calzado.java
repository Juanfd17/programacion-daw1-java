public class Calzado extends Prenda{
    private int talla;

    public Calzado(String codigo, String descripcion, double precio, int talla) {
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
        return super.equals(obj) && this.talla == ((Calzado)obj).talla;
    }
}
