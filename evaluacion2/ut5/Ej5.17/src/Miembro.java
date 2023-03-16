public class Miembro {
    private String nombre;
    private int mes;
    private int anio;

    public Miembro(String nombre, int mes, int anio) {
        this.nombre = nombre;
        this.mes = mes;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Miembro");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Mes: ").append(mes).append("\n");
        sb.append("Año: ").append(anio).append("\n");
        return sb.toString();
    }
}
