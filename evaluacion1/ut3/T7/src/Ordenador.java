public class Ordenador {
    private int memoriaMaxima;
    private int memoriaIntalada;


    public Ordenador(int memoriaMaxima) {
        if (memoriaMaxima > 0) {
            this.memoriaMaxima = memoriaMaxima;
        } else {
            this.memoriaMaxima = 1024;
        }
        this.memoriaIntalada = 0;
    }

    public int getMemoriaMaxima() {
        return memoriaMaxima;
    }

    public int obtenerMemoriaDisponible() {
        return memoriaMaxima - memoriaIntalada;
    }

    public void vaciarMemoria() {
        this.memoriaIntalada = 0;
    }

    public boolean instalar256Mb() {
        if (obtenerMemoriaDisponible() >= 256) {
            this.memoriaIntalada += 256;
            return true;
        }
        return false;
    }

    public boolean instalarMemoria(int memoria) {
        if (obtenerMemoriaDisponible() >= memoria && memoria > 0) {
            this.memoriaIntalada += memoria;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Este ordenador puede tener hasta ").append(getMemoriaMaxima()).append(" Mb de memoria. Todavia es posible intalar ").append(obtenerMemoriaDisponible()).append(" Mb");
        return sb.toString();
    }
}
