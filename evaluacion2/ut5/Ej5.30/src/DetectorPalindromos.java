import java.util.Stack;

public class DetectorPalindromos {
    private String cadena;
    private Stack<Character> letra;

    public DetectorPalindromos(String cadena) {
        this.cadena = cadena;
        this.letra = new Stack<>();
    }

    public void comprueba(){
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
