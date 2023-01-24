public class TareaArrays {
    public static void main(String[] args) {
        int[] valores1 = {9, 2, 5, 8, 6,-2, 7, 4,4};
        int[] valores2 = {4, 5, 6};
        System.out.println("fusiona");
        System.out.println("    Primer array");
        imprimir(valores1);
        System.out.println("    Segundo array");
        imprimir(valores2);
        System.out.println("Valores fusionados");
        imprimir(fusiona(valores1, valores2));
        System.out.println("genera");
        imprimir(genera(8598));
        System.out.println("ordena");
        System.out.println("valor desordenado");
        imprimir(valores1);
        System.out.println("valor ordenado");
        ordena(valores1);
        imprimir(valores1);
        System.out.println("insertar");
        System.out.println("valor sin insertar");
        float[] valoresFloat = {5.3F, 7.5F, 8.3F, 5.6F, 7.9F};
        imprimir(valoresFloat);
        float valor = 18.36F;
        int posicion = 5;
        System.out.println("valor: " + valor + " insetado en la posicion: " + posicion);
        imprimir(inserta(valoresFloat,valor,posicion));
    }

    public static void imprimir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length){
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
    }

    public static void imprimir(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length){
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
    }

    public static int[] fusiona(int[] array1, int[] arrai2) {
        int[] fusion = new int[array1.length + arrai2.length];
        int contador = 0;

        for (int i = 0; i < array1.length; i++) {
            fusion[i] = array1[i];
        }

        for (int i = array1.length; i < array1.length + arrai2.length; i++) {
            fusion[i] = arrai2[contador];
            contador++;
        }

        return fusion;
    }

    public static int[] genera(int n){
        int contador = 0;
        int longitud = 10;

        while (longitud / n < 10){
            longitud *= 10;
            contador++;
        }

        int[] numeros = new int[contador];

        for (int i = numeros.length-1; i > -1; i--) {
            numeros[i] = n % 10;
            n /= 10;
        }

        return numeros;
    }

    public static void ordena(int[] numeros){
        int min = numeros[0];
        int aux = 0;
        int nvaolr = 0;

        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = i; j < numeros.length; j++) {
                if (min > numeros[j]){
                    min = numeros[j];
                    nvaolr = j;
                }
            }

            aux = numeros[i];
            numeros[nvaolr] = aux;
            numeros[i] = min;
            if (i != numeros.length-1){
                min = numeros[i+1];
                nvaolr = i+1;
            } else {
                min = numeros[i];
                nvaolr = i;
            }
        }
    }

    public static float[] inserta(float[] numeros, float valor, int posicion) {
        if (posicion > 0 && posicion <= numeros.length+1) {
            float[] aniadido = new float[numeros.length + 1];
            posicion--;

            for (int i = 0; i < aniadido.length; i++) {
                if (i < posicion) {
                    aniadido[i] = numeros[i];
                } else if (i == posicion) {
                    aniadido[i] = valor;
                } else {
                    aniadido[i] = numeros[i - 1];
                }
            }

            return aniadido;
        }
        return numeros;
    }
}