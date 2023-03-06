import java.util.Date;

public class Periodico extends Catalogo{
    private Date fecha;

    public Periodico(String nombre, int id, int dia, int mes, int anio) {
        super(nombre, id);
        this.fecha = new Date(anio, mes, dia);
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if (super.equals(o) && this.fecha.equals(((Periodico) o).getFecha())){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("\n").append("Fecha: ").append(fecha.getDay()).append("-").append(fecha.getMonth()).append("-").append(fecha.getYear()).append("\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
