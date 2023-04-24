import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();

            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();

            int resultado = dividendo / divisor;
            System.out.println("El resultado de la division es: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar numeros enteros");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por 0");
        }
    }
}