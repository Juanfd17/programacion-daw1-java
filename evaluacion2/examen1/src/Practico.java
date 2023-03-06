public class Practico extends Tipo implements Subvencionales{
    String sede;

    public Practico(String nombre, double precio, double horas, String sede) {
        super(nombre, precio, horas);
        this.sede = sede;
    }

    @Override
    public double getPrecioSubvencionado() {
        return (getPrecio() / 100) * 50;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Sede: [").append(sede).append("]\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        if (super.equals(o)){
            return true;
        }

        return false;
    }
}