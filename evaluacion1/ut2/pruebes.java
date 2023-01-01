import java.util.Scanner;

public class pruebes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aleatorios = 1;
        int numero = sc.nextInt();
        int sumatorio = 0;

        for (int i = 0; i < aleatorios; i++) {
            sumatorio = 0;
            for (int j = numero; j != 0; j--) {
                sumatorio += j;
            }
            System.out.println("Sumatorio de " + numero + " = " + sumatorio);
        }
    }
}