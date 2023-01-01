import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int numero = 0;

        do {
            System.out.println("Introduze un numero");
            numero = sc.nextInt();
            contador += numero;
        } while (numero != 0);
        System.out.println("la suma de los numeros introducidos es " + contador);
    }
}