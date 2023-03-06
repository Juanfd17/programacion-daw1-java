public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public boolean buscarLineal(int[ ] numeros, int valorBuscado)
    {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscado){
                return true;
            }
        }

        return false;
    }
}