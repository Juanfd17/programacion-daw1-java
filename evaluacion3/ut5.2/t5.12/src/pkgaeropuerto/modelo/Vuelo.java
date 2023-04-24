package pkgaeropuerto.modelo;

import java.util.Comparator;
import java.util.Objects;

public abstract class Vuelo {
    String destino;
    String modelo;
    int nPlazas;

    public Vuelo(String destino, String modelo, int nPlazas) {
        this.destino = destino;
        this.modelo = modelo;
        this.nPlazas = nPlazas;
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


}
