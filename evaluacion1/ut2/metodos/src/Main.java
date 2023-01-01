public class Main {
    public static void main(String[] args) {
        int numero = 10;

        System.out.println(sumatorio(numero));
        System.out.println(factorial(numero));

    }

    public static int sumatorio(int numero) {
        int resultado = 0;
        for (int i = numero; i > 0; i--) {
            resultado += i;
        }
        return resultado;
    }

    public static int factorial(int numero) {
        int resultado = 1;
        for (int i = numero; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }
}