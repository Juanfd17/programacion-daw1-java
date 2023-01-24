import java.util.Arrays;

public class Stack {
    private String array[];
    private int contador;

    public Stack(int capacidadArray) {
        this.array = new String[capacidadArray];
        this.contador = 0;
    }

    public boolean push(String valor){
        if (!full()){
                 array[contador] = valor;
                 contador++;
                 return true;
        }
        return false;
    }

    public String pop(){
        if (empty()){
            return null;
        }
        contador--;
        String valor = array[contador];
        array[contador] = null;
        return valor;
    }

    public String show(){
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < contador; i++) {
            sb.append(i+1).append(": ").append(array[i]).append("\n");
        }
        return sb.toString();
    }

    public String[] getAll(){
        String[] copia = new String[contador];

        for (int i = 0; i < contador; i++) {
            copia[i] = array[i];
        }

        return copia;
    }

    public boolean search(String valor){
        for (String buscado: array) {
            if (!(buscado == null)) {
                if (buscado.equals(valor)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean empty(){
        if (contador == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean full(){
        if (contador == array.length){
            return true;
        } else {
            return false;
        }
    }
}
