import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //----------a------------
        int a = 4;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e){
            System.out.println("no se puede dividir entre 0");
        }

        //----------b-----------
        int[] array = new int[5];
        try {
            array[5] = 1;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("esa posicion no tiene valor");
        }

        //----------c-----------
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        try {
            int n = scn.nextInt();
            System.out.println("Número introducido " + n);
        } catch (InputMismatchException e){
            System.out.println("eso no es un numero entero");
        }

    }
}