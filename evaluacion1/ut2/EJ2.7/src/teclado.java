import java.util.Scanner;

public class teclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes = 0;
        int diaMes = 0;
        int anio = 0;

        System.out.println("Introduce el mes");
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
                        System.out.println("Estas en el mes "+ mes + " que tiene " + diaMes);


                    } else {
                        System.out.println("Creo que el año tenia que ser entre el 2000 y el 2021 cero");
                    }
                } else {
                    System.out.println("Eso no es un año");
                }
            }
        } else {
            System.out.println("Eso no es un numero");
        }
    }
}
