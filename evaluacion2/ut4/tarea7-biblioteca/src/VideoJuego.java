public class VideoJuego extends Alquilable{
    private int pegi;

    public VideoJuego(String nombre, int id, int pegi) {
        super(nombre, id);
        this.pegi = pegi;
    }

    public int getPegi() {
        return pegi;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        if (this.pegi == ((VideoJuego)o).getPegi() && super.equals(o) && this.isAlquilado() == ((VideoJuego) o).isAlquilado()){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("\n").append("Pegi: ").append(pegi).append("\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
