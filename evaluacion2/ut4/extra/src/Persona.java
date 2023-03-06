public class Persona implements Cloneable, Comparable<Persona>{
    String direccion;
    int edad;
    String nombre;

    public Persona(String direccion, int edad, String nombre) {
        this.direccion = direccion;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona clone(){
        try {
            return (Persona) super.clone();
        } catch (CloneNotSupportedException e){
            return null;
        }
    }

    @Override
    public int compareTo(Persona o) {
        int r;

        if (this.getEdad() > o.getEdad()){
            r = 1;
        } else if (this.getEdad() == o.getEdad()) {
            r = 0;
        } else {
            r = -1;
        }

        return r;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Edad: ").append(edad).append("\n");
        sb.append("Direccion: ").append(direccion).append("\n");
        return sb.toString();
    }
}