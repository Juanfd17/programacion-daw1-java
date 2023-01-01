import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 1;
        int i = 1;

        while (i == 1) {
            System.out.println("Introduzca el primer numero");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                numero1 = sc.nextInt();

                while (numero2 <= 10) {
                    System.out.println(numero1 + " * " + numero2 + " = " + numero1 * numero2);
                    numero2++;
                    i++;
                }

            }else{
                System.out.println("No has introducido un numero");
            }
        }
    }
}