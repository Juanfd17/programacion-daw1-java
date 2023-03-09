public abstract class Empleado {
    private String codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private boolean[][] horario;

    public Empleado(String codigo, String nombre, String apellido, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.horario = new boolean[7][3];
    }

    public void trabajar(Dias dia, Turnos turno){
        if (turno.getNombre().equalsIgnoreCase("M")){
            horario[dia.getNum()-1][0] = true;
        } else if (turno.getNombre().equalsIgnoreCase("T")){
            horario[dia.getNum()-1][1] = true;
        } else {
            horario[dia.getNum()-1][2] = true;
        }
    }

    public int horasSemana(){
        int suma = 0;
        for (int i = 0; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                if (horario[i][j]){
                    if (j == 1){
                        suma += Turnos.MANANA.getnHoras();
                    } else if (j == 2){
                        suma += Turnos.TARDE.getnHoras();
                    } else {
                        suma += Turnos.NOCHE.getnHoras();
                    }
                }
            }
        }

        return suma;
    }

    public String horarioSemanal(){
        StringBuilder sb = new StringBuilder(" ");
        for (Dias d: Dias.values()) {
            sb.append(d.nom).append(" ");
        }

        sb.append("\n");
        Turnos[] turnos = Turnos.values();
        for (int i = 0; i < turnos.length; i++) {
            sb.append(turnos[i].getNombre()).append(" ");
            for (int j = 0; j < Dias.values().length; j++) {
                if (horario[j][i]){
                    sb.append("* ");
                } else {
                    sb.append("- ");
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean[][] getHorario() {
        return horario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
