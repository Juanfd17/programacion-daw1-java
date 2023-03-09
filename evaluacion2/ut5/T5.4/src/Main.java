import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String frase = tecladoString();
        System.out.println(frase);
        System.out.println(fraseInvertida(frase));
        System.out.println(palabrasIvertidas(frase));
        System.out.println(mayusculas(frase));
        letras(frase);
        System.out.println(eliminar(frase,','));
    }

    public static String fraseInvertida(String frase){
        final StringBuilder sb = new StringBuilder();
        sb.append(frase);
        char l1;
        char l2;

        for (int i = 0; i < sb.length() / 2; i++) {
            l1 = sb.charAt(i);
            l2 = sb.charAt(sb.length() - i -1);
            sb.setCharAt(i, l2);
            sb.setCharAt(sb.length() - i - 1, l1);
        }
        return sb.toString();
    }

    public static String palabrasIvertidas(String frase){
        StringTokenizer st = new StringTokenizer(frase, " ");
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= st.countTokens(); i++) {
            sb.append(fraseInvertida(st.nextToken().toString()));
            sb.append(" ");
        }

        return sb.toString();
    }

    public static String mayusculas(String frase){
        return frase.toUpperCase();
    }

    public static void letras(String frase){
        StringTokenizer st = new StringTokenizer(frase, " ");

        for (int i = 0; i <= st.countTokens(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(st.nextToken());

            if (!par(sb.length())){
                System.out.println(sb.substring(sb.length()-1));
            } else {
                System.out.println(sb.substring(0,1));
            }
        }
    }

    private static boolean par(int n){
        return n % 2 == 0;
    }

    private static String eliminar(String frase, char eliminar){
        StringBuilder sb = new StringBuilder();
        sb.append(frase);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == eliminar){
                StringBuilder sb2 = new StringBuilder();
                int posicion = i;
                sb2.append(sb.substring(0,posicion));
                sb2.append(sb.substring(posicion + 1,sb.length()));
                sb = sb2;
            }
        }

        return sb.toString();
    }

    public static String tecladoString() {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        return palabra;
    }
}