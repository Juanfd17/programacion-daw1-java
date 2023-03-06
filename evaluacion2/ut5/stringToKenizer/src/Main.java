import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        final String SEPARADOR = ",";
        String frase = "Esto, es, un, ejemplo";
        StringTokenizer palabras = new StringTokenizer(frase, SEPARADOR);

        while (palabras.hasMoreTokens()) {
            String unaPalabra = palabras.nextToken();
            System.out.println(unaPalabra);
        }
    }
}