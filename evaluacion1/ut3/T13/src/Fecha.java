public class Fecha {
    int dia;
    int mes;
    int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean esBisiesto(){
        if (this.anio % 4 == 0 || (this.anio % 100 != 0 && this.anio % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }

    public int diaMes(){
        switch (this.mes){
            case 1,3,5,7,8,10,12:
                return 31;
            case 4,6,9,11:
                return 30;
            case 2:
                if (esBisiesto()){
                    return 29;
                } else {
                    return 28;
                }
        }
        return 0;
    }

    public String printCorta(){
        final StringBuffer sb = new StringBuffer().append(this.dia).append("-").append(this.mes).append("-").append(this.anio);
        return sb.toString();
    }

    public String printLarga(){
        final StringBuffer sb = new StringBuffer().append(this.dia).append(" de ").append(nombreMes()).append(" del ").append(this.anio);
        return sb.toString();
    }

    public String nombreMes(){
        switch (this.mes){
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Nobiembre";
            case 12:
                return "Diciembre";
        }
        return "No mes";
    }

    public boolean esCorrecta(){
        if (this.dia > 0 && this.dia <= diaMes()){
            if (this.mes > 0 && this.mes < 13){
                return true;
            }
        }
        return false;
    }
}