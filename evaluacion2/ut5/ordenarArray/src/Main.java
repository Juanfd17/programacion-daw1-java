public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[] {24, 12, 36, 5, 7, 15};
        ordenarInsercionDirecta(numeros);
    }

    public static void ordenarInsercionDirecta(int[] array){
        for (int i = 1; i < array.length; i++) {
            int aux = array[i];
            int j = i -1;
            while (j >= 0 && array[j] > aux){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
    }
}