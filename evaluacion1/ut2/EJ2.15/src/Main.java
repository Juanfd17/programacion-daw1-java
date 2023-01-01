import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int resultado = 0;

        System.out.println("Introduce un numero entero de varios digitos");
        numero = numero = sc.nextInt();

        while(numero > 0) {
            resultado += numero % 10;
            numero = numero / 10;
        }

        System.out.println("La suma es: " + resultado);

    }
}