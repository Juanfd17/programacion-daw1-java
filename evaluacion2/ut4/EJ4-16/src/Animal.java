public abstract class Animal {
    String nombre;
    int nPatas;
    Persona dueno;
    String definicion;

    public Animal(String nombre, int nPatas, Persona dueno, String definicion) {
        this.nombre = nombre;
        this.nPatas = nPatas;
        this.dueno = dueno;
        this.definicion = definicion;
    }

    abstract public void sonido();

    abstract public void comer();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Numero de Patas: ").append(nPatas).append("\n");
        sb.append("Dueño: ").append(dueno);
        sb.append("Definicion: ").append(definicion).append("\n");
        return sb.toString();
    }
}
