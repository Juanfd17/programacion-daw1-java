import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entero > ");
        int numero;

        if (sc.hasNextInt()) {
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " es par");
            } else {
                System.out.println(numero + " es impar");
            }
        } else {
            System.out.println("mete un numero entero maricon");
        }
    }
}