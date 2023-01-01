import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aleatorios = sc.nextInt();
        int numero = 0;
        int sumatorio = 0;

        for (int i = 0; i < aleatorios; i++) {
            sumatorio = 0;
            numero = (int) (Math.random() * (100 - 1)) + 1;
            for (int j = numero; j != 0; j--) {
                sumatorio += j;
            }
            System.out.println("Sumatorio de " + numero + " = " + sumatorio);
        }
    }
}