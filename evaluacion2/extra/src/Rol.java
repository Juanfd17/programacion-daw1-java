public enum Rol {
    SECRETARIO("SECRETARIO", 1000), BECARIO("BECARUIO", 500), FIJO("FIJO", 1000);

    private String nombre;
    private int salario;

    Rol(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }
}
