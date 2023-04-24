package pkgaeropuerto.modelo;

public class Regular extends Vuelo {
    int plazasLibres;

    public Regular(String destino, String modelo, int nPlazas, int plazasLibres) {
        super(destino, modelo, nPlazas);
        this.plazasLibres = plazasLibres;
    }
}
