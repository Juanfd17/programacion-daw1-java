import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un número entero: ");

            try {
                int num = scanner.nextInt();
                System.out.println("El número ingresado es: " + num);
            } catch (InputMismatchException e) {
                System.out.println("e petao");
            }
        }
    }
}