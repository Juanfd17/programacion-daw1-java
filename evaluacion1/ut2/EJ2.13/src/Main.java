import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        float numero = sc.nextFloat();
        float resultado = 0.0F;
        int contador = 0;

        while (contador < numero) {
            contador++;
            resultado = resultado + 1f / contador;
        }
        System.out.println(resultado);
    }
}