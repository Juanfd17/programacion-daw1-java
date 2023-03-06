import java.util.Date;

public class Cliente {
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private String dni;
    private int entradasCompradas;
    private int tipoCuenta;

    public Cliente(String nombre, String apellidos,int anioNacimento, int mesNacimiento, int diaNacimiento, String dni, int tipoCuenta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = new Date(anioNacimento,mesNacimiento,diaNacimiento);
        this.dni = dni;
        this.tipoCuenta = tipoCuenta;
        this.entradasCompradas = 0;
    }

    public String tipoCuenta(){
        if (tipoCuenta == 1) {
            return ("joven");
        } else if (tipoCuenta == 2) {
            return ("juvilado");
        } else {
            return ("VIP");
        }
    }

    public void setEntradasCompradas(int entradasCompradas){
        this.entradasCompradas = entradasCompradas;
    }

    public int getEntradasCompradas(){
        return entradasCompradas;
    }
    public void entradaComprada(){
        this.entradasCompradas++;
    }

    public int getTipoCuenta() {
        return tipoCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni(){
        return dni;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Apellidos: ").append(apellidos).append("\n");
        sb.append("FechaNacimiento: ").append(fechaNacimiento.getYear()).append(":").append(fechaNacimiento.getMonth()).append(":").append(fechaNacimiento.getDay()).append("\n");
        sb.append("Dni: ").append(dni).append("\n");
        sb.append("EntradasCompradas: ").append(entradasCompradas).append("\n");
        sb.append("TipoCuenta: ").append(tipoCuenta()).append("\n");
        return sb.toString();
    }
}