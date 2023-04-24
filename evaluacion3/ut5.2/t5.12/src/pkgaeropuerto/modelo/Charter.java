package pkgaeropuerto.modelo;

public class Charter extends Vuelo {
    String nif;

    public Charter(String destino, String modelo, int nPlazas, String nif) {
        super(destino, modelo, nPlazas);
        this.nif = nif;
    }
}
