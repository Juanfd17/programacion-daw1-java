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
        int[] valoresRotado = valores;
        rotarArray(valoresRotado);
        imprimirArray(valoresRotado);
        System.out.println("expandir");
        int[] valoresExtendidos = expandir(valores);
        imprimirArray(valoresExtendidos);
        System.out.println("numeros aleatorios");
        int[] frecuencia = frecuencia();
        imprimirArray(frecuencia);
        System.out.println("contador dias");
        ContadorDias contadorDias = new ContadorDias();
        System.out.println(contadorDias.contarDias(1,2,2002));
        System.out.println("Luz solar");
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

    public static void rotarArray(int[] array){
        int[] rotado = new int[array.length];

        for (int i = 0; i < array.length-1; i++) {
            rotado[i+1] = array[i];
        }
        rotado[0] = array[array.length-1];

        System.arraycopy(rotado,0,array,0,array.length);
    }

    public static int[] expandir(int[] array){
        int[] expandido = new int[array.length*2];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            expandido[contador] = array[i];
            contador++;
            expandido[contador] = array[i];
            contador++;
        }

        return expandido;
    }

    public static int[] frecuencia(){

        int f1 = 0;
        int f2 = 0;
        int f3 = 0;
        int f4 = 0;
        int f5 = 0;
        int f6 = 0;
        int f7 = 0;
        int f8 = 0;
        int f9 = 0;
        int numero = 0;

        for (int i = 0; i < 100; i++) {
            numero = (int) (Math.random()*9+1);
            if (numero == 1){
                f1++;
            } else if (numero == 2){
                f2++;
            } else if (numero == 3){
                f3++;
            } else if (numero == 4){
                f4++;
            } else if (numero == 5){
                f5++;
            } else if (numero == 6){
                f6++;
            } else if (numero == 7){
                f7++;
            } else if (numero == 8){
                f8++;
            } else {
                f9++;
            }
        }

        int[] freciencia = {f1,f2,f3,f4,f5,f6,f7,f8,f9};
        return freciencia;
    }
}