import java.util.Objects;

public class Bota extends Calzado{
    private boolean impermeable;

    public Bota(String codigo, String descripcion, double precio, int talla, boolean impermeable) {
        super(codigo, descripcion, precio, talla);
        this.impermeable = impermeable;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("impermeable: ").append(impermeable).append("\n");
        return sb.toString();
    }

    public boolean equals(Prenda obj) {
        return super.equals(obj) && this.impermeable == ((Bota) obj).impermeable;
    }
}
