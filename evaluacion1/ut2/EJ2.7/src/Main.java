public class Main {
    public static void main(String[] args) {
        int mes = 2;
        int diaMes = 0;
        int anio = 2004;
        switch (mes) {
            case 1:
                diaMes = 31;
                break;
            case 2:
                if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                    diaMes = 29;
                    break;
                } else {
                    diaMes = 28;
                    break;
                }
            case 3:
                diaMes = 31;
                break;
            case 4:
                diaMes = 30;
                break;
            case 5:
                diaMes = 31;
                break;
            case 6:
                diaMes = 30;
                break;
            case 7:
                diaMes = 31;
                break;
            case 8:
                diaMes = 31;
                break;
            case 9:
                diaMes = 30;
                break;
            case 10:
                diaMes = 31;
                break;
            case 11:
                diaMes = 30;
                break;
            case 12:
                diaMes = 31;
                break;
        }
        System.out.println(diaMes);
    }
}
