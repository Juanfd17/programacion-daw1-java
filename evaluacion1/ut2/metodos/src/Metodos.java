import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        final int NUMEROS_ALEATORIOS = 30;
        final int NOTA_MAXIMA = 10;
        final int NOTA_MINIMA = 1;
        int nota = 0;
        int minima = NOTA_MAXIMA;
        int maxima = 0;
        double media = 0;
        for (int i = 0; i < NUMEROS_ALEATORIOS; i++) {
            nota = (int) (Math.random() * NOTA_MAXIMA + NOTA_MINIMA);
            System.out.print(nota + "  ");

            comprovarMaximo(maxima, nota);

            if (minima > nota) {
                minima = nota;
            }

            media += nota;
        }

        media /= (float) NUMEROS_ALEATORIOS;

        System.out.println("\nLa nota mas alta a sido " + maxima);
        System.out.println("La nota mas baja a sido " + minima);
        System.out.println("La nota media a sido de " + media);
    }

    public static boolean comprovarMaximo(int maxima, int nota){
        if (maxima < nota) {
           return true;
        }else {
            return false;
        }
    }
}