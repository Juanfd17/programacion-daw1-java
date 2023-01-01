import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        System.out.println("Introduce un numero fin");
        int numerofin = sc.nextInt();
        int div = 0;

        if (numerofin < numero) {
            for (int i = 2; i < numerofin; i++) {
                if (numerofin % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("El segundo numero deve de ser mas pequeño que el primero");
        }
    }
}