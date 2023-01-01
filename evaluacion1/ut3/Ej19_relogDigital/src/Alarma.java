public class Alarma {
    private int hora;
    private int minuto;

    public Alarma(){
        hora = 7;
        minuto = 0;
    }

    public void setAlarma(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
    }

    private String apm(int hora){
        if (hora >= 12){
            return " PM";
        } else {
            return " AM";
        }
    }

    private int  h12(int hora){
        if (hora > 12){
            return hora - 12;
        } else {
            return hora;
        }
    }

    private String poner0(int numero){
        if (numero < 10){
            return "0" + numero;
        } else {
            return "" + numero;
        }
    }

    public String getHoraAlarma(){
        return poner0(h12(this.hora)) + ":" + poner0(this.minuto) + apm(this.hora);
    }
}
