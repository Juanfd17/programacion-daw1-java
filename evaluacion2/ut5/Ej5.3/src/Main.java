public class Main {
    public static void main(String[] args) {
        imprimir(generarMatrizIdentidad(9));
    }

    public static int [] [] generarMatrizIdentidad(int dimension){
        int [] [] matriz = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (j == i || j + i == matriz.length -1){ //tabla cheata  || j + i == matriz.length -1
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] = 0;
                }
            }
        }

        return matriz;
    }

    public static void imprimir(int [] [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i] [j] + " ");
            }
            System.out.println();
        }
    }
}