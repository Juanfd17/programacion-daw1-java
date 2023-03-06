public class Mixtos extends Tipo implements Subvencionales{
    double horasTeoria;
    double horasPractica;

    public Mixtos(String nombre, double precio, double horas, double horasTeoria, double horasPractica) {
        super(nombre, precio, horas);
        this.horasTeoria = horasTeoria;
        this.horasPractica = horasPractica;
    }

    @Override
    public double getPrecioSubvencionado() {
        return (getPrecio() / 100) * 75;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Horas de Teoria: [").append(horasTeoria).append("]\n");
        sb.append("Horas de Practica: [").append(horasPractica).append("]\n");
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