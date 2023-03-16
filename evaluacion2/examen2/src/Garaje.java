public class Garaje extends Inmueble{
    private boolean individual;

    public Garaje(String codigo, double precio, int superficie, Direccion direccion, EstadoInmueble estadoInmueble, boolean individual) {
        super(codigo, precio, superficie, direccion, estadoInmueble);
        this.individual = individual;
    }

    public boolean isIndividual() {
        return individual;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        return ((Garaje) o).isIndividual() == isIndividual() && super.equals(o);
    }
}
