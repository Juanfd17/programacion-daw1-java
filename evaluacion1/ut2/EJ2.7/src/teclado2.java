import java.util.Scanner;

public class teclado2 {
    public static void main(String[] args) {
        int mes = 0;
        int diaMes = 0;
        int anio = 0;
        int i = 1;

        while (i == 1) {
            System.out.println("Introduce el mes");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                mes = sc.nextInt();
                if (mes < 1 || mes > 12) {
                    System.out.println("El mes debe estar entre el 1 y el 12");
                } else {
                    System.out.println("Introduce el año");
                    if (sc.hasNextInt()) {
                        anio = sc.nextInt();
                        if (anio > 2000 && anio < 2021) {
                            switch (mes) {
                                case 1:
                                case 3:
                                case 5:
                                case 7:
                                case 8:
                                case 10:
                                case 12:
                                    diaMes = 31;
                                    break;
                                case 4:
                                case 6:
                                case 9:
                                case 11:
                                    diaMes = 30;
                                    break;
                                case 2:
                                    if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                                        diaMes = 29;
                                    }
                                    break;
                            }
                            System.out.println("Estas en el mes " + mes + " que tiene " + diaMes);
                            i = 2;


                        } else {
                            System.out.println("Creo que el año tenia que ser entre el 2000 y el 2021 creo");
                        }
                    } else {
                        System.out.println("Eso no es un numero");
                    }
                }
            } else {
                System.out.println("Eso no es un numero");
            }
        }
    }
}

