public class Direccion {
    private String municipio;
    private String direccion;

    public Direccion(String municipio, String direccion) {
        this.municipio = municipio;
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        return ((Direccion) o).getMunicipio().equals(getMunicipio());
    }
}