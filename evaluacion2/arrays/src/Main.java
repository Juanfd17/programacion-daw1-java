public class Main {
    public static void main(String[] args) {
        float[] notasAlumnos;  //declarar array
        boolean[] plazasParkin;
        final int MAX = 3;
        String[] nombreAlumnos = new String[MAX];
        float[] cantidadLluvia =  new float[30];

        notasAlumnos = new float[10];
        int n = 3;
        plazasParkin = new boolean[n];

        for (int i = 0; i < notasAlumnos.length; i++) {
            notasAlumnos[i] = 2 * i;
        }

        int[] a = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println(encontrarNombreDia(5));
        double notas[] = {5.2,8.6,2.3};
        System.out.println(calcularMedida(notas));
        int[] valores = {1,5,8,9,5,7,8,62,115,68};
        System.out.println(maximo(valores));
        System.out.println("pares");
        int[] valoresPares = pares(valores);
        imprimirArray(valoresPares);
        System.out.println("rotar");
        int[] valoresRotado = rotarArray(valores);
        imprimirArray(valoresRotado);
    }

    public static String encontrarNombreDia(int diaSemana){
        String[] nombres = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};

        if (diaSemana > 0 && diaSemana < 8){
            return nombres[diaSemana - 1];
        }

        return "Eso no es un dia de la semana";
    }

    public static double calcularMedida(double[] notas){
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma/notas.length;
    }

    public static int maximo(int[] valores){
        int max = valores[0];

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > max){
                max = valores[i];
            }
        }

        return max;
    }

    public static int[] pares(int[] valores) {
        int[] devolver = new int [valores.length];
        int contador = 0;

        for (int i = 0; i < valores.length; i++) {
            if (pares(valores[i])){
                devolver[contador] = valores[i];
                contador++;
            }
        }

        return devolver;
    }

    public static boolean pares(int numero){
        if (numero == 0){
            return true;
        }

        if (numero % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void imprimirArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] rotarArray(int[] array){
        int[] rotado = new int[array.length];

        for (int i = 0; i < array.length-1; i++) {
            rotado[i+1] = array[i];
        }
        rotado[0] = array[array.length-1];

        return rotado;
    }
}