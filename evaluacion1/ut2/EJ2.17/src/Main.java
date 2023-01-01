import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        int repeticiones = sc.nextInt();
        int numero = 0;
        int pares = 0;
        int acaba2 = 1;
        int imperes = 0;
        for (int i = 0; i < repeticiones; i++) {
            numero = (int) (Math.random() * (20 - 5)) + 5;
            System.out.println(numero);
            if (numero % 2 == 0) {
                pares++;
                if (numero % 10 == 2) {
                    acaba2 = acaba2 * numero;
                }
            }else {
                imperes += numero;
            }
        }
        System.out.println("Han salido " + pares + " numeros pares");
        System.out.println("La suma de todos los impares es " + imperes);
        if (acaba2 == 1){
            acaba2 =0;
        }
        System.out.println("La multiplicacion de los numeros que acaban en 2 es " + acaba2);
    }
}