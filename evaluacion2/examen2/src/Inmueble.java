import java.util.Objects;

public abstract class Inmueble implements Comparable<Inmueble>{
    private String codigo;
    private double precio;
    private int superficie;
    private Direccion direccion;

    private EstadoInmueble estadoInmueble;

    public Inmueble(String codigo, double precio, int superficie, Direccion direccion, EstadoInmueble estadoInmueble) {
        this.codigo = codigo;
        this.precio = precio;
        this.superficie = superficie;
        this.direccion = direccion;
        this.estadoInmueble = estadoInmueble;
    }

    public int getSuperficie() {
        return superficie;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public EstadoInmueble getEstadoInmueble() {
        return estadoInmueble;
    }

    private void setEstadoInmueble(EstadoInmueble estadoInmueble) {
        this.estadoInmueble = estadoInmueble;
    }

    public boolean alquilar(){
        if (getEstadoInmueble() == EstadoInmueble.SE_ALQUILA){
           setEstadoInmueble(EstadoInmueble.ALQUILADO);
           return true;
        }
        return false;
    }

    public boolean vender(){
        if (getEstadoInmueble() == EstadoInmueble.SE_VENDE){
            setEstadoInmueble(EstadoInmueble.VENDIDO);
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        return ((Inmueble) o).getSuperficie() == getSuperficie() && ((Inmueble) o).getDireccion().equals(getDireccion());
    }
    @Override
    public int compareTo(Inmueble inmueble) {
        int cmp = this.getCodigo().compareTo(inmueble.getCodigo());

        return cmp;
    }

    public int compareToPrecio(Inmueble inmueble) {
        return Double.compare(inmueble.getPrecio(), this.getPrecio());
    }
}
