import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mete un numero");
        int numero = sc.nextInt();
        int contador = 0;
        int imprime = 1;

        for (contador = 0; contador < numero; contador++) {
            for (int i = 0; i < numero; i++) {
            System.out.print(imprime);
            }
            System.out.println();
            imprime++;
        }
    }
}