package ej4a8;

public class AulaTaller extends Aula{
    private int nOrdenadores;

    public AulaTaller(String nombre, int nPupitres, int nOrdenadores) {
        super(nombre, nPupitres);
        this.nOrdenadores = nOrdenadores;
    }

    public String monstrar() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.monstrar());
        sb.append("Numero de ordenadores: ").append(nOrdenadores).append("\n");
        return sb.toString();
    }
}
