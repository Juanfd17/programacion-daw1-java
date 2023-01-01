public class RelojAlarma {
    private VisorReloj reloj;
    private Alarma alarma;

    public RelojAlarma(){
        reloj = new VisorReloj();
        alarma = new Alarma();
    }

    public RelojAlarma(int hora, int minuto){
        reloj = new VisorReloj(hora,minuto);
        alarma = new Alarma();
    }

    public String emitirTic(){
        reloj.emitirTic();
        if (esHoraAlarma()){
            return "RRRRIIIIINNNNNGGGGG\n";
        }
        return "";
    }

    private boolean esHoraAlarma(){
        if (this.alarma.getHoraAlarma().equals(this.reloj.getHora())){
            return true;
        }
        return false;
    }

    public void setAlarma(int hora, int minuto){
        this.alarma.setAlarma(hora, minuto);
    }

    public String getHora(){
        return this.reloj.getHora();
    }

    public String getAlarma(){
        return this.alarma.getHoraAlarma();
    }

    public void setHora(int hora, int minuto){
        this.reloj.ponerEnHora(hora, minuto);
    }
}
