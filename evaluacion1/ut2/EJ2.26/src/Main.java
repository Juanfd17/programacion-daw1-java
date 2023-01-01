import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        final int repeticiones = sc.nextInt();
        int numero = 0;
        int maximo = 0;
        for (int i = 0; i < repeticiones; i++) {
            numero = (int) (Math.random() * (101 - 1)) + 1;
            System.out.println(numero);

            if (maximo < numero) {
                maximo = numero;
            }
        }
        System.out.println("El numero mas grande a sido " + maximo);
    }
}