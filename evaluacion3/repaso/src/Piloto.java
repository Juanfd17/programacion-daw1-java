import java.util.Objects;

public class Piloto implements Comparable<Piloto>{
    private String nombre;
    // Dos apellidos, separados por un espacio
    private String apellidos;
    private int edad;

    public Piloto(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(apellidos).append(", ").append(nombre).append(", Edad: ").append(edad);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Piloto piloto = (Piloto) o;

        if (edad != piloto.edad) return false;
        if (!Objects.equals(nombre, piloto.nombre)) return false;
        return Objects.equals(apellidos, piloto.apellidos);
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + edad;
        return result;
    }

    @Override
    public int compareTo(Piloto o) {
        int posicion = this.edad - o.getEdad();
        if (posicion == 0){
            return o.nombre.compareTo(this.getNombre());
        }
        return posicion;
    }
}
