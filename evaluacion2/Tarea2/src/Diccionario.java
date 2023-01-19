import java.util.Arrays;

public class Diccionario {
    final int MAX_PALABRAS = 5;
    Palabra[] diccionario;
    int pos;

    public Diccionario(int numPalabras) {
        if (numPalabras > MAX_PALABRAS) {
            diccionario = new Palabra[MAX_PALABRAS];
        } else {
            diccionario = new Palabra[numPalabras];
        }

        pos = 0;
    }

    public void insertarPalabras(Palabra palabra) {
        if (pos == diccionario.length){
            InterfazDiccionario.mensage("Diccionario lleno");
        } else {
        diccionario[pos] = palabra;
        pos++;
        }
    }

    public void crearPalabra(String palabra1, String palabra2){
        Palabra palabra = new Palabra(palabra2, palabra1);
        insertarPalabras(palabra);
    }

    public String verPalabra(int palabra){
        if (diccionario[palabra] == null){
            return "Palabra vacia";
        }

        return diccionario[palabra].toString();
    }

    public String traducirPalabra(String palabra) {
        boolean encontrado = false;
        int contador = 0;
        if (pos == 0){
            return "Palabra no encotrada";
        }
        while (!encontrado){
            if (contador >= pos){
                return "Palabra no encotrada";
            }

            if (diccionario[contador].getEspaniol().equals(palabra)){
                encontrado = true;
            }

            if (diccionario[contador].getIngles().equals(palabra)){
                encontrado = true;
            }

            if (!encontrado){
                contador++;
            }
        }

        return verPalabra(contador);
    }

    public String toString(int palabra) {
        final StringBuilder sb = new StringBuilder();
        sb.append(diccionario[palabra]).append("\n");
        return sb.toString();
    }

    public String escribirDiccionario() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < diccionario.length; i++) {
            sb.append(i+1).append(": ");
            if (diccionario[i] == null){
                sb.append("Hueco vacio\n");
            } else {
                sb.append(toString(i));
            }
        }

        return sb.toString();
    }
}
