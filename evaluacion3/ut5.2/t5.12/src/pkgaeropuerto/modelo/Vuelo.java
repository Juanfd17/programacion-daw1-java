package pkgaeropuerto.modelo;

public class Vuelo {
    String destino;
    String modelo;
    int nPlazas;

    public Vuelo(String destino, String modelo, int nPlazas) {
        this.destino = destino;
        this.modelo = modelo;
        this.nPlazas = nPlazas;
    }
}
