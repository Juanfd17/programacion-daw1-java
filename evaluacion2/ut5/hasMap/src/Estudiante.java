public class Estudiante {
    private int edad;

    public Estudiante(int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Estudiante{");
        sb.append("edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }
}
