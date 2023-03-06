public abstract class Catalogo {
    private String nombre;
    private int id;


    public Catalogo(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this.nombre.equals(((Catalogo)o).getNombre()) && this.id == ((Catalogo)o).getId()){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("ID: ").append(id).append("\n");
        return sb.toString();
    }
}
