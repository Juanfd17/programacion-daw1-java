import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = 0;
        int almacena = 0;
        int resultadoInt = 0;
        boolean resultadoBoolean = false;

        do {
            if (numero == 0) {
                System.out.println("******************");
                System.out.println("Numero actual = " + almacena);
                System.out.println("******************");
                System.out.println("1.- Solicitar numero");
                System.out.println("2.- Factorial");
                System.out.println("3.- Primo");
                System.out.println("4.- Contar cifras");
                System.out.println("5.- Capicua");
                System.out.println("6.- Salir");
                System.out.println("Introduce un numero del menu");

                numero = solicitarNumero();

                while (numero < 1 || numero > 6) {
                    System.out.println("El numero debe estar entre 1 y 6");
                    numero = solicitarNumero();
                }

                switch (numero) {
                    case 1:
                        almacena = solicitarNumero();
                        numero = 0;
                        break;

                    case 2:
                        resultadoInt = factorial(almacena);
                        numero = 0;
                        break;

                    case 3:
                        resultadoBoolean = primo(almacena);
                        if (resultadoBoolean) {
                            System.out.println(almacena + " es un numero primo");
                        } else {
                            System.out.println(almacena + " no es un numero primo");
                        }

                        numero = 0;
                        break;

                    case 4:
                        resultadoInt = contarCifras(almacena);
                        System.out.println(almacena + " tiene " + resultadoInt + " cifras");
                        numero = 0;
                        break;

                    case 5:
                        resultadoBoolean = capicua(almacena);
                        if (resultadoBoolean) {
                            System.out.println(almacena + " es un numero capiculia");
                        } else {
                            System.out.println(almacena + " no es un numero capiculia");
                        }
                        numero = 0;
                        break;

                    case 6:
                        System.out.println("Adios");
                        break;
                }
            }
        } while (numero == 0);
    }

    public static int solicitarNumero() {
        int almacena = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        while (!sc.hasNextInt()) {
            System.out.println("Error. Mete un numero");
            sc.nextLine();
        }
        almacena = sc.nextInt();
        return almacena;
    }

    public static int factorial(int almacena) {
        int operacion = 1;
        for (int i = almacena; i > 0; i--) {
            operacion = operacion * i;
        }
        System.out.println("El factorial de " + almacena + " es " + operacion);
        return operacion;
    }

    public static boolean primo(int almacena) {
        boolean primo = true;
        int contador = 2;
        while (contador < almacena && primo == true) {
            if (almacena % contador == 0) {
                primo = false;
            }
            contador++;
        }

        if (!primo) {
            primo = false;
        }
        return primo;
    }

    public static int contarCifras(int almacena) {
        int contador = 0;
        while (almacena > 0) {
            almacena = almacena / 10;
            contador++;
        }

        return contador;
    }

    public static boolean capicua(int almacena) {
        /***int cifra = 0;
         int vuelta = 0;
         int copia = almacena;
         boolean esCapicua = false;

         while (copia != 0) {
         cifra = copia % 10;
         vuelta = vuelta * 10 + cifra;
         copia /= 10;
         }

         if (almacena == vuelta) {
         esCapicua = true;
         }
         return esCapicua;*/

        boolean resultado = true;
        String copia = String.valueOf(almacena);
        String inverso = "";
        int veces = copia.length() / 2;
        int contador = copia.length() - 1;

        /**for (int i = copia.length() - 1; i >= 0; i--) {
         inverso += copia.charAt(i);
         }


         if (copia.equals(inverso)) {
         resultado = true;
         }*/

        for (int i = 0; i < veces; i++) {
            if (copia.charAt(i) != copia.charAt(contador)) {
                resultado = false;
            }
            contador--;
        }


        return resultado;
    }

}