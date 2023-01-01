public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int aSegundos() {
        int segundos = 0;
        for (int i = 0; i < getHora(); i++) {
            segundos += 3600;
        }

        for (int i = 0; i <= getMinutos(); i++) {
            segundos += 60;
        }

        segundos += getSegundos();

        return segundos;
    }

    public void avanzarSegundo() {
        if (getSegundos() == 59) {
            setSegundos(0);
            if (getMinutos() == 59) {
                setMinutos(0);
                if (getHora() == 23) {
                    setHora(0);
                } else {
                    setHora(getHora() + 1);
                }
            } else {
                setMinutos(getMinutos() + 1);
            }
        } else {
            setSegundos(getSegundos() + 1);
        }
    }

    public void atrasarSegundo() {
        if (getSegundos() == 0) {
            setSegundos(59);
            if (getMinutos() == 0) {
                setMinutos(59);
                if (getHora() == 0) {
                    setHora(23);
                } else {
                    setHora(getHora() - 1);
                }
            } else {
                setMinutos(getMinutos() - 1);
            }
        } else {
            setSegundos(getSegundos() - 1);
        }
    }

    public String enFormatoAmPm(){
        int hora = getHora();
        if (hora > 12){
            hora -= 12;
        } else if (hora == 0) {
            hora = 12;
        }
        final StringBuffer sb = new StringBuffer();
        if (hora < 10){
            sb.append("0");
        }
        sb.append(hora).append(hora());

        if (getHora() >= 12) {
            sb.append(" PM");
        } else {
            sb.append(" AM");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        if (getHora() < 10){
            sb.append("0");
        }
        sb.append(getHora()).append(hora());
        return sb.toString();
    }

    public String hora(){
        final StringBuffer sb = new StringBuffer().append(":");
        if (getMinutos() < 10){
            sb.append("0");
        }
        sb.append(getMinutos()).append(":");
        if (getSegundos() < 10){
            sb.append("0");
        }
        sb.append(getSegundos());
        return sb.toString();
    }
}