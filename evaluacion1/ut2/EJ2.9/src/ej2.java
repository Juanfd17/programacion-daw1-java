import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        while (!sc.hasNextInt()) {
            System.out.println("Error. Mete un numero");
            sc.nextLine();

        }
        int numero = sc.nextInt();

        System.out.println("for");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + numero + " = " + i * numero);
        }

        System.out.println("while");
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " X " + numero + " = " + i * numero);
            i++;
        }

        System.out.println("for al rebes");
        for (i = 10; i >= 1; i--) {
            System.out.println(i + " X " + numero + " = " + i * numero);
        }

        System.out.println("while al rebes");
        i = 10;
        while (i >= 1) {
            System.out.println(i + " X " + numero + " = " + i * numero);
            i--;
        }

        System.out.println("numeros pares while");
        i = 0;
        while (i <= numero) {
            System.out.println(i);
            i += 2;
        }

        System.out.println("numeros pares for");
        for (i = 0; i<=numero;i+=2){
            System.out.println(i);
        }
    }
}