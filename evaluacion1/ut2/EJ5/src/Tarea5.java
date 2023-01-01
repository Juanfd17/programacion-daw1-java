
public class Tarea5 {
    private final char ESPACIO = ' ';

    public static void main(String[] args) {
        Tarea5 tarea5 = new Tarea5();
        tarea5.impares();
        tarea5.multiplos(1000);
        tarea5.producto(4, 8);
        tarea5.dividirRestando(15, 2);
        tarea5.mediaAleatorios();
        tarea5.esPerfecto(496);
        tarea5.esPerfecto(871);
        tarea5.esPrimo(33);
        tarea5.esPrimo(89);
        tarea5.imprimirPrimos(100);
        tarea5.generarSerie();
        tarea5.generarSerieCuadrados();
        tarea5.mostrarTrianguloNumeros(28);
        tarea5.escribirEspacios(7);
        tarea5.extra(18);
        tarea5.extra2(101);
        tarea5.extra2cesar(7);
        tarea5.extra3(6, 4);
        tarea5.piramide1(4);
        tarea5.piramide2(4);
        tarea5.cosa1(5);
        tarea5.cosa2(5);
    }

    /**
     * Escribe los impares entre 1 y 100 (con un for).
     * <p>
     * Escribe en cada linea 8
     * numeros con una separacion de una tabulacion entre ellos
     */
    public void impares() {
        int contador = 0;

        System.out.println("impares");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                contador++;
                System.out.print(i + "\t");
            }

            if (contador == 8) {
                System.out.println("");
                contador = 0;
            }
        }
    }


    /**
     * Escribe los 10 primeros multiplos de n (con for).
     */
    public void multiplos(int n) {
        System.out.println("\n10 multiplos de " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }

    /**
     * Calcula y devuelve el producto de a y b mediante sumas.
     * <p>
     * Con while
     */
    public int producto(int a, int b) {
        System.out.println("producto con sumas de " + a + " y " + b);
        int contador = b;
        int resultado = 0;
        while (contador != 0) {
            contador--;
            resultado += a;
        }
        return resultado;
    }

    /**
     * calcula y visualiza en pantalla el cociente entero y el resto de dividir a
     * entre b. Se asume que a y b son ambos > 0 y a > b. Si a = 15 y b = 2 entonces
     * cociente = 7 y resto = 1, se calcula mediante restas sucesivas
     */
    public void dividirRestando(int a, int b) {
        System.out.println("dividir Restando " + a + " " + b);
        int cociente = 0;
        int resto = a;
        while (resto >= b) {
            resto -= b;
            cociente++;
        }
        System.out.println("resto = " + resto);
        System.out.println("cociente = " + cociente);

    }

    /**
     * Genera aleatorios (con Math.random()) entre 10 y 50 (inclusive). Calcula y
     * escribe la media de todos ellos formateada a 2 decimales El proceso termina
     * cuando sale el 50
     * <p>
     * Con while
     */
    public void mediaAleatorios() {
        System.out.println("media aleatorios");
        int numero = 0;
        int suma = 0;
        int contador = 0;
        double media = 0;
        while (numero != 50) {
            numero = (int) (Math.random() * (51 - 10)) + 10;
            contador++;
            suma += numero;
        }

        media = (double) suma / contador;
        System.out.println("la media de " + suma + " con " + contador + " es " + media);

    }

    /**
     * Detecta si un numero es o no perfecto Un numero es perfecto si la suma de sus
     * divisores excepto el mismo es igual al propio numero.
     * <p>
     * Con for
     * <p>
     * Ejemplo - el 6 es perfecto (1 + 2 + 3)
     * <p>
     * 496 es perfecto ( 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248)
     */
    public boolean esPerfecto(int n) {
        System.out.println("numeros perfecto de " + n);
        int contador = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                contador += i;
            }
        }
        if (contador == n) {
            return true;
        }
        return false;
    }

    /**
     * Detecta si n es un numero primo.
     * <p>
     * Hazlo con un for.
     * <p>
     * En cuanto detectes que el numero no es primo sal del bucle con un return
     * El 1 no es un numero primo.
     */
    public boolean esPrimo(int n) {
        if (n == 1 || n == 0) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }


    }

    /**
     * Escribe los n primeros numeros primos a partir de 2.
     * <p>
     * Usa el metodo anterior esPrimo()
     * <p>
     * Si n = 7 entonces 2 3 5 7 11 13 17
     * <p>
     * Con while
     */
    public void imprimirPrimos(int n) {
        System.out.println("imprimir Primos " + n);
        int contador = 0;
        int numero = 2;
        while (contador < n) {
            if (esPrimo(numero)) {
                System.out.print(numero + "\t");
                contador++;
            }
            numero++;
        }

    }

    /**
     * Genera y escribe en pantalla los 15 primeros terminos de la serie:
     * <p>
     * 1 2 4 7 11 16 22 29 .......
     */
    public void generarSerie() {
        System.out.println("\nserie rara");
        int n = 1;

        for (int i = 0; i < 15; i++) {
            n += i;
            System.out.print(n + "\t");
        }

    }

    /**
     * genera y escribe los 20 primeros terminos de la serie indicada.
     * Cada termino es el cuadrado de la posicion que ocupa.
     * <p>
     * Por ejemplo, el termino quinto es 25 (5*5),
     * el termino septimo es 49 (7 * 7).
     * <p>
     * 1 4 9 16 25 36 49 64 81 100 121....
     * <p>
     * En cada fila escribe 8 terminos.
     */
    public void generarSerieCuadrados() {
        System.out.println("\n serie cuadrados");
        int contador = 1;
        int cont8 = 0;

        while (contador < 21) {
            System.out.print((int) Math.pow(contador, 2) + "\t");
            contador++;
            cont8++;
            if (cont8 == 7) {
                System.out.println("");
                cont8 = 0;
            }
        }
        System.out.println();


    }

    /**
     * Escribe la siguiente figura para el numero de filas indicado
     * como parametro. Deja dos espacios en blanco entre cada numero.
     * <p>
     * Para n = 8 la figura es:
     * <p>
     * 1
     * 3  3  3
     * 5  5  5  5  5
     * 7  7  7  7  7  7  7
     * 9  9  9  9  9  9  9  9  9
     * 11 11 11 11 11 11 11 11 11 11 11
     * 13 13 13 13 13 13 13 13 13 13 13 13 13
     * 15 15 15 15 15 15 15 15 15 15 15 15 15 15 15
     * <p>
     * Haz uso del método escribirEspacios()
     */
    public void mostrarTrianguloNumeros(int n) {
        System.out.println("piramide " + n);
        for (int i = 1; i < n; i++) {
            if (esPrimo(i)) {
                for (int j = 0; j < i; j++) {
                    if (esPrimo(j)) {
                        System.out.print(j);
                        escribirEspacios(2);
                    }
                }
                System.out.println();
            }
        }
    }

    /**
     * escribe n espacios en la misma linea (con for).
     */
    public void escribirEspacios(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    public void extra(int n) {
        System.out.println("tobogan");
        for (int i = 0; i < n; i++) {
            escribirEspacios(i + i);
            System.out.println("*");
        }
    }

    public void extra2(int n) {
        if (n != 0) {
            for (int i = 0; i < (n / 2) + 1; i++) {

                if (i < n / 2) {
                    escribirEspacios(i);
                    System.out.print("€");
                    escribirEspacios((n - i * 2) - 2);
                    System.out.println("€");
                }

                if (i == n / 2) {
                    escribirEspacios(i);
                    System.out.println("€");
                }
            }

            for (int i = (n / 2) - 1; i > -1; i--) {
                escribirEspacios(i);
                System.out.print("€");
                escribirEspacios((n - i * 2) - 2);
                System.out.println("€");
            }
        } else {
            System.out.println("ERROR necesito un numero impar");
        }
    }

    public void extra2cesar(int n) {
        System.out.println("cesar");
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == j || j == (n - i + 1)) {
                    System.out.print("€");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void extra3(int anchura, int altura) {
        System.out.println();

        for (int i = 1; i <= anchura; i++) {
            System.out.print("*");
        }

        for (int i = 2; i < altura; i++) {
            System.out.print("\n*");
            for (int espacios = 2; espacios < anchura; espacios++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= anchura; i++) {
            System.out.print("*");
        }

    }

    public void piramide1(int alturaIntroducida) {
        System.out.println("");
        int altura = 1;
        int i = 0;
        int espacios = alturaIntroducida - 1;
        while (altura <= alturaIntroducida) {

            for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            for (i = 1; i < altura; i++) {
                System.out.print(i);
            }
            for (i = altura; i > 0; i--) {
                System.out.print(i);
            }
            System.out.println();
            altura++;
            espacios--;
        }
    }

    public void piramide2(int alturaIntroducida) {
        System.out.println("");
        int altura = 1;
        int i = 0;
        int espacios = alturaIntroducida - 1;

        while (altura <= alturaIntroducida) {

            for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            for (i = 1; i < altura; i++) {
                System.out.print(altura);
            }
            for (i = altura; i > 0; i--) {
                System.out.print(altura);
            }
            System.out.println();
            altura++;
            espacios--;
        }
    }

    public void cosa1(int n) {
        System.out.println("cosa");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void cosa2(int n) {
        System.out.println("cosa2");

    }

}




