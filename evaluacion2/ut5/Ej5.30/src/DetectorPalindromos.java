import java.util.Stack;

public class DetectorPalindromos {
    public static void comprueba(String cadena){
        Stack<Character> letra = new Stack<>();
        for (int i = 0; i < cadena.length(); i++) {
            letra.push(cadena.charAt(i));
        }

        StringBuilder alreves = new StringBuilder();
        for (int i = cadena.length(); i > 0; i--) {
            alreves.append(letra.get(i-1));
        }
        System.out.println(alreves.toString());
        System.out.println(cadena);
        System.out.println(alreves.toString().equals(cadena));
    }
}
