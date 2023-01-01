import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero 1");
        while (!sc.hasNextInt()) {
            System.out.println("Error. Mete un numero");
            sc.nextLine();
        }
        int numero1 = sc.nextInt();

        System.out.println("Introduzca el numero 2");
        while (!sc.hasNextInt()) {
            System.out.println("Error. Mete un numero");
            sc.nextLine();
        }
        int numero2 = sc.nextInt();

        if (numero1 > numero2){
            System.out.println("El segundo numero no puede ser mayor que el primero");
        }else {
            int i = 0;
            while (numero1 <= numero2){
                if (i < 3){
                    System.out.print(numero1++ + " ");
                    i++;
                }else{
                    System.out.println(numero1++ + " ");
                    i = 1;
                }
            }
        }
    }
}