public class ContadorDias {
    private int diasMes[];

    public ContadorDias() {
        this.diasMes = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    }

    public int contarDias(int dia, int mes, int anio){
        int dias = 0;

        for (int i = 0; i < mes-1; i++) {
            dias += diasMes[i];
        }

        dias += dia;

        if (esBisiesto(anio)){
            if (mes > 2){
                dias++;
            }
        }

        return dias;
    }

    private boolean esBisiesto(int anio){
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
            return true;
        }

        return false;
    }
}