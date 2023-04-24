package pkgaeropuerto.modelo;

import java.util.Comparator;
import java.util.Objects;

public abstract class Vuelo implements Comparator<Vuelo>{
    private String destino;
    private String modelo;
    private int nPlazas;

    public Vuelo(String destino, String modelo, int nPlazas) {
        this.destino = destino;
        this.modelo = modelo;
        this.nPlazas = nPlazas;
    }

    public String getDestino() {
        return destino;
    }

    public String getModelo() {
        return modelo;
    }

    public int getnPlazas() {
        return nPlazas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vuelo vuelo = (Vuelo) o;

        if (nPlazas != vuelo.nPlazas) return false;
        if (!Objects.equals(destino, vuelo.destino)) return false;
        return Objects.equals(modelo, vuelo.modelo);
    }

    @Override
    public int hashCode() {
        int result = destino != null ? destino.hashCode() : 0;
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + nPlazas;
        return result;
    }



    @Override
    public int compare(Vuelo o1, Vuelo o2) {
        int posicion = o1.destino.compareTo(o2.getDestino());

        if (posicion == 0){
            posicion = o1.modelo.compareTo(o2.getModelo());
        }

        if (posicion == 0){
            posicion = Integer.compare(o1.nPlazas, o2.getnPlazas());
        }

        return posicion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Destino: ").append(destino).append("\n");
        sb.append("Avion: ").append(modelo).append("\n");
        sb.append("Plazas: ").append(nPlazas).append("\n");
        return sb.toString();
    }


}
