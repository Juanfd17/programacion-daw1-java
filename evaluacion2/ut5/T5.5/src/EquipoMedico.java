import java.util.StringTokenizer;

public class EquipoMedico {
    private Empleado[] empleado;
    private String[] plantilla;

    public EquipoMedico(String[] plantilla) {
        this.plantilla = plantilla;
        this.empleado = new Empleado[plantilla.length];
        int contador = 0;

        for (int i = 0; i < plantilla.length; i++) {
            StringTokenizer st = new StringTokenizer(plantilla[i], ",");
            Object[] objects = new Object[st.countTokens()];
            for (int j = 0; j < objects.length; j++) {
                objects[j] = st.nextToken();
            }

            if (objects[4].equals("Médico")) {
                empleado[contador] = new Medico((String) objects[0], (String) objects[1], (String) objects[2], Integer.parseInt((String) objects[3]), Integer.parseInt((String) objects[5]));
            } else if (objects[4].equals("Nutricionista")) {
                empleado[contador] = new Nutricionista((String) objects[0], (String) objects[1], (String) objects[2], Integer.parseInt((String) objects[3]), (String) objects[5]);
            } else {
                if (objects[5].equals("si")) {
                    empleado[contador] = new Fisioterapeuta((String) objects[0], (String) objects[1], (String) objects[2], Integer.parseInt((String) objects[3]), true);
                } else {
                    empleado[contador] = new Fisioterapeuta((String) objects[0], (String) objects[1], (String) objects[2], Integer.parseInt((String) objects[3]), false);
                }
            }
            contador++;
        }
    }

    public boolean trabajar(String id, Dias dia, Turnos turno){
        int nID = buscar(id);
        if (nID >= 0){
            empleado[nID].trabajar(dia, turno);
            return true;
        } else {
            return false;
        }
    }

    public int horasSemana(String id){
        int nID = buscar(id);
        if (nID == -1){
            return -1;
        }
        return empleado[nID].horasSemana();
    }

    public String horarioSemanal(){
        boolean[][] horarioTodos = new boolean[Dias.values().length][Turnos.values().length];
        for (int i = 0; i < empleado.length; i++) {
            boolean[][] horarioEmpleado = empleado[i].getHorario();
            for (int j = 0; j < horarioEmpleado.length; j++) {
                for (int k = 0; k < horarioEmpleado[j].length; k++) {
                    if (horarioEmpleado[j][k]){
                        horarioTodos[j][k] = true;
                    }
                }
            }
        }

        return imprimeMatriz(horarioTodos);
    }

    public String matrizEmpleado(String id){
        int nID = buscar(id);
        return imprimeMatriz(empleado[nID].getHorario());
    }

    public String imprimeMatriz(boolean[][] horario){
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

    private int buscar(String id){
        for (int i = 0; i < empleado.length; i++) {
            if (empleado[i].getCodigo().equals(id)){
                return i;
            }
        }

        return -1;
    }
}