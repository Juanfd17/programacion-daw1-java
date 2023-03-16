public class Vivienda extends Inmueble {
    private int numeroHabitaciones;
    private int numeroAseos;

    public Vivienda(String codigo, double precio, int superficie, Direccion direccion,EstadoInmueble estadoInmueble, int numeroHabitaciones, int numeroAseos) {
        super(codigo, precio, superficie, direccion, estadoInmueble);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroAseos = numeroAseos;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public int getNumeroAseos() {
        return numeroAseos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        return (((Vivienda) o).getNumeroHabitaciones() == getNumeroHabitaciones() && ((Vivienda) o).getNumeroAseos() == getNumeroAseos() && super.equals(o));
    }
}
