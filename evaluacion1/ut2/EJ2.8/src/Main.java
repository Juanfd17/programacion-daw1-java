import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int numero1 = 0;
        int numero2 = 0;

        if (sc.hasNextInt()) {
            numero1 = sc.nextInt();
            System.out.println("Introduzca el segundo numero");

            if (sc.hasNextInt()) {
                numero2 = sc.nextInt();
                if (numero2 < numero1) {
                    System.out.println("El segundo numero no puede ser menor que el primero");
                } else {
                    while (numero1 <= numero2) {
                        System.out.print(numero1);
                        numero1++;
                        if ((numero1) <= numero2) {
                            System.out.print(",");
                        } else {
                            System.out.print(".");
                        }
                    }
                }
            } else {
                System.out.println("No has introducido un numero");
            }
        } else {
            System.out.println("No has introducido un numero");
        }
    }
}