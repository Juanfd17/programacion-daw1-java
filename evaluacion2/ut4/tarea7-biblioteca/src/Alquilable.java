public abstract class Alquilable extends Catalogo{
    public Alquilable(String nombre, int id) {
        super(nombre, id);
        this.alquilado = false;
    }

    private boolean alquilado;

    public boolean isAlquilado() {
        return this.alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public boolean equals(Object o) {
        if (this.alquilado == ((Alquilable)o).isAlquilado() && super.equals(o)){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Alquilado: ");
        if (this.alquilado){
            sb.append("Si");
        } else {
            sb.append("No");
        }
        sb.append("\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
