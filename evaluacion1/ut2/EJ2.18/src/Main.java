import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        int impares = 0;
        long pares = 1;
        long paresr = 0;
        int multiplo3 = 0;
        int multiplo6 = 0;
        int numero7 = 0;

        while (numero != 0) {
            numero = (int) (Math.random() * (100));
            System.out.println(numero);
            if (numero % 2 == 0 && numero != 0) {
                pares = pares * numero;
                if (pares!= 0){
                    paresr = pares;
                }
            } else {
                impares += numero;
            }

            if (numero % 3 == 0) {
                multiplo3++;
            }
            if (numero % 6 == 0) {
                multiplo6++;
            }

            if (numero % 10 == 7) {
                numero7++;
            }
        }

        System.out.println("la suma de todos los impares es " + impares);
        System.out.println("El resultado de multiplicar todos los pares es " + pares);
        System.out.println("Al multiplicar numeros tan grandes es posible que el resultado de arribasea 0. este es el ultimo valor que no fue 0" + paresr);
        System.out.println("Han salido " + multiplo3 + " que son multiplos de 3");
        System.out.println("Han salido " + multiplo6 + " que son multiplos de 6");
        System.out.println("Han salido " + numero7 + " que acaban en 7");
    }
}