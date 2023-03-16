public class Finca extends Inmueble{
    private boolean edificable;

    public Finca(String codigo, double precio, int superficie, Direccion direccion, EstadoInmueble estadoInmueble, boolean edificable) {
        super(codigo, precio, superficie, direccion, estadoInmueble);
        this.edificable = edificable;
    }

    public boolean isEdificable() {
        return edificable;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        return ((Finca) o).isEdificable() == isEdificable() && super.equals(o);
    }
}
