import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduzca el primer numero");
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 = 1;

        for (int i = 1; i <= numero1; i++) {
            System.out.println("------------------");
            System.out.println("tabla del " + i);
            System.out.println("------------------");
            numero2 = 1;
            while (numero2 <= 10) {
                System.out.println(i + " * " + numero2 + " = " + i * numero2);
                numero2++;
            }
        }
    }
}


