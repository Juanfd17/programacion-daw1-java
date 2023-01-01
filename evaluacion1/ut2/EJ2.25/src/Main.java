public class Main {
    public static void main(String[] args) {
        final int NUMEROS_ALEATORIOS = 20;
        int pares = 0;
        int impares = 0;
        int numero = 0;
        boolean esPar = false;

        for (int i = 0; i < NUMEROS_ALEATORIOS; i++) {
            numero = (int) (Math.random() * (50 - 1)) + 1;
            esPar = (numero % 2 == 0);
            if (esPar) {
                pares++;
            } else {
                impares++;
            }
            System.out.print(numero + "  ");
        }

        System.out.println("\nHan salido " + pares + " numeros pares");
        System.out.println("Han salido " + impares + " numeros impares");
    }
}