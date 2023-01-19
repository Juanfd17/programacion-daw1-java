public class EstadisticaLuzSolar {
    String[] nombreMeses = {"Enerero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Nobiembre","Diciembre"};
    int[] horas;

    public EstadisticaLuzSolar() {
        this.horas = new int[] {100, 90, 120, 150, 210, 250, 300, 310, 280, 230, 160, 120};
    }

    public double getMediaSol(){
        double horasSol = 0;

        for (int i = 0; i < horas.length; i++) {
            horasSol += horas[i];
        }

        return horasSol/horas.length;
    }

    public String mesMasSoleado(){
        String mesSoleado = nombreMeses[1];
        int horasSol = this.horas[0];

        for (int i = 0; i < horas.length; i++) {
            if (horasSol < horas[i]){
                mesSoleado = nombreMeses[i];
                horasSol = horas[i];
            }
        }

        return mesSoleado;
    }

    public String mesMenosSoleado(){
        String mesNoSoleado = nombreMeses[1];
        int horasSol = this.horas[0];

        for (int i = 0; i < horas.length; i++) {
            if (horasSol > horas[i]){
                mesNoSoleado = nombreMeses[i];
                horasSol = horas[i];
            }
        }

        return mesNoSoleado;
    }
}
