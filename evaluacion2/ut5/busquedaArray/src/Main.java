public class Main {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7};
        System.out.println(buscarLinea1(numeros, 5));
        System.out.println(buscarLinea2(numeros, 5));
    }

    public static int buscarLinea1 (int[] numeros, int valorBuscado) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscado){
                return i;
            }
        }

        return -1;
    }

    public static int buscarLinea2 (int[] numeros, int valorbuscado){
        int medio = numeros.length / 2;

        if (numeros[medio] == valorbuscado){
            return medio;
        }

        if (valorbuscado >= numeros[medio]){
            for (int i = medio; i < numeros.length; i++) {
                if (numeros[i] == valorbuscado){
                    return i;
                }
            }
        } else {
            for (int i = medio; i > 0; i--) {
                if (numeros[i] == valorbuscado){
                    return i;
                }
            }
        }

        return -1;
    }
}