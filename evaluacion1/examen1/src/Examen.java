package src;

import java.lang.reflect.Array;

public class Examen {

    /**
     * M�todo main para ejecutar la aplicaci�n.
     * NO MODIFICAR.
     * <p>
     * Deber�a producir como salida lo mismo que se proporciona en el fichero de texto
     * resultado.txt.
     */
    public static void main(String[] args) {
        Examen examen = new Examen();

        System.out.println("=================================");
        System.out.println("calcularRentencion (0,25 puntos)");
        System.out.println("=================================");
        System.out.println(examen.calcularRetencion(14999));
        System.out.println(examen.calcularRetencion(35000));
        System.out.println(examen.calcularRetencion(9999));
        System.out.println(examen.calcularRetencion(60001));

        System.out.println("=================================");
        System.out.println("traducirNota (0,5 puntos)");
        System.out.println("=================================");
        System.out.println(examen.traducirNota(-1));
        System.out.println(examen.traducirNota(0));
        System.out.println(examen.traducirNota(4.99f));
        System.out.println(examen.traducirNota(6));
        System.out.println(examen.traducirNota(7));
        System.out.println(examen.traducirNota(9));
        System.out.println(examen.traducirNota(9.99f));
        System.out.println(examen.traducirNota(10));

        System.out.println("=================================");
        System.out.println("escribirPares (0,75 puntos)");
        System.out.println("=================================");
        examen.escribirPares(21);
        examen.escribirPares(-30);

        System.out.println("=================================");
        System.out.println("mostrarTrianguloNumeros (0,75 puntos)");
        System.out.println("=================================");
        examen.mostrarTrianguloNumeros(5);
        examen.mostrarTrianguloNumeros(10);

        System.out.println("=================================");
        System.out.println("mostrarFlechaAsteriscos (1,25 puntos)");
        System.out.println("=================================");
        examen.mostrarFlechaAsteriscos(5);
        examen.mostrarFlechaAsteriscos(10);

        System.out.println("=================================");
        System.out.println("mostrarTrianguloPrimos (1,5 puntos)");
        System.out.println("=================================");
        examen.mostrarTrianguloPrimos(5);
        examen.mostrarTrianguloPrimos(10);

        System.out.println("=================================");
        System.out.println("fibonacci (1 punto)");
        System.out.println("=================================");
        examen.fibonacci(21);

        System.out.println("=================================");
        System.out.println("calcularHipoteca (1,5 puntos)");
        System.out.println("=================================");
        examen.calcularHipoteca(200000, 1.75, 30);

        System.out.println("=================================");
        System.out.println("mostrarTablaChetada (1,5 puntos)");
        System.out.println("=================================");
        examen.mostrarTablaChetada(5);
        examen.mostrarTablaChetada(11);
        examen.mostrarTablaChetada(6);

        System.out.println("=================================");
        System.out.println("cambiarAMonedas (1 punto)");
        System.out.println("=================================");
        examen.cambiarAMonedas(20);
        examen.cambiarAMonedas(15);
    }

    /**
     * Los tramos impositivos para la declaracion de la renta en un determinado pais
     * son los siguientes:
     * <p>
     * Menos de 15000? 15%
     * <p>
     * Entre 15000? y 19999? 18%
     * <p>
     * Entre 20000? y 34999? 22%
     * <p>
     * Entre 35000? y 59999? 30%
     * <p>
     * M?s de 60000? (incluido) 50%
     * <p>
     * Escribir un metodo que reciba la renta anual y retorne el tipo impositivo que
     * corresponda.
     *
     * @param renta ingresos del usuario
     * @return el tipo impositivo. Por ejemplo, si el usuario introduce 12000, el
     * programa devolvera 15.
     */
    public int calcularRetencion(int renta) {
        if (renta < 15000) {
            return 15;
        } else if (renta < 19999) {
            return 18;
        } else if (renta < 34999) {
            return 22;
        } else if (renta < 59999) {
            return 30;
        } else {
            return 50;
        }
    }

    /**
     * Escribe un metodo que transforme una nota numerica en su palabra
     * correspondiente teniendo en cuenta la siguiente equivalencia:
     * <p>
     * 0-5(no incluido) --> insuficiente
     * <p>
     * 5-7(no incluido) --> aprobado
     * <p>
     * 7-9(no incluido) --> notable
     * <p>
     * 9-10(no incluido) --> sobresaliente
     * <p>
     * 10 --> matricula de honor
     * <p>
     * Si la nota es menor que 0, retornara return "matricula de honor";.
     *
     * @param nota la nota numerica a convertir
     * @return la cadena de texto en minusculas equivalente
     */
    public String traducirNota(float nota) {
        if (nota < 0) {
            return "nota no valida";
        } else if (nota < 5) {
            return "insuficiente";
        } else if (nota < 7) {
            return "aprobado";
        } else if (nota < 9) {
            return "notable";
        } else if (nota < 10) {
            return "sobresaliente";
        } else {
            return "matricula de honor";
        }
    }

    /**
     * Este metodo recibe un numero entero positivo y muestra por pantalla
     * todos los numeros pares desde ese numero hasta -numero (incluido) separados
     * por comas. Detras del ultimo numero no debe aparecer la coma.
     * Por ejemplo, para n=20, el resultado seria:
     * 20,18,16,14,12,10,8,6,4,2,0,-2,-4,-6,-8,-10,-12,-14,-16,-18,-20
     * <p>
     * Si el numero recibido es negativo se imprimir� la serie en sentido inverso:
     * Por ejemplo, para n=-9:
     * -8,-6,-4,-2,0,2,4,6,8
     * <p>
     * Si n es impar la serie parte del numero par inmediatamente menor. Para n=21 ser�a
     * 20 y para n=-5 ser�a -6
     *
     * @param n numero para el que se imprimira la serie
     */
    public void escribirPares(int n) {

        int numerone = n * (-1);
        if (n >= 0) {
            for (int i = n; i >= numerone; i--) {
                if (i % 2 == 0) {
                    System.out.print(i);
                    if (i > numerone + 1) {
                        System.out.print(", ");
                    }
                }
            }
        } else {
            for (int i = n; i <= numerone; i++) {
                if (i % 2 == 0) {
                    System.out.print(i);
                    if (i < numerone - 1) {
                        System.out.print(", ");
                    }
                }
            }
        }
        System.out.println();
    }

    /**
     * Este metodo debe mostrar un triangulo con el siguiente formato. Por ejemplo,
     * para n=5:
     * <p>
     * 5
     * <p>
     * 4 4
     * <p>
     * 3 3 3
     * <p>
     * 2 2 2 2
     * <p>
     * 1 1 1 1 1
     *
     * @param n numero de filas que tendra el triangulo mostrado
     */
    public void mostrarTrianguloNumeros(int n) {
        int nimpreso = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(nimpreso + " ");
            }
            nimpreso--;
            System.out.println();
        }
    }

    /**
     * Este metodo recibe un numero e imprimir� una flecha cuya punta tendr� un n�mero de
     * asteriscos igual al n�mero recibido.
     * Por ejemplo, para n=5:
     * *
     * **
     * ***
     * ****
     * *****
     * ****
     * ***
     * **
     * *
     *
     * @param n numero de asteriscos que tendr� la punta de flecha
     */
    public void mostrarFlechaAsteriscos(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Este metodo debe mostrar un triangulo con el siguiente formato. Por ejemplo,
     * para n=5:
     * <p>
     * 2
     * <p>
     * 2 3
     * <p>
     * 2 3 5
     * <p>
     * 2 3 5 7
     * <p>
     * 2 3 5 7 11
     * <p>
     * Implementa tambi�n el m�todo esPrimo y util�zalo para
     * determinar si un n�mero es o no primo.
     *
     * @param n numero de filas que tendra el triangulo mostrado
     */
    public void mostrarTrianguloPrimos(int n) {
        int contador = 0;
        int np = 2;
        for (int i = 0; i < n; i++) {
            while (contador <= i) {
                if (esPrimo(np)) {
                    System.out.print(np);
                    contador++;
                }
                np++;
            }
            np = 2;
            contador = 0;
            System.out.println();
        }
    }

    /**
     * Devuelve true cuando un n�mero es primo. Un n�mero es primo cuando tiene
     * m�s divisores aparte de s� mismo y 1.
     *
     * @param numero El n�mero que queremos comprobar si es primo.
     * @return True si es primo y false en caso contrario.
     */
    private boolean esPrimo(int numero) {
        if (numero == 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Este metodo debe mostrar la sucesion de Fibonacci, imprimiendo el numero de
     * elementos indicado por n. Por ejemplo, para n=10 mostrara:
     * <p>
     * 0 1 1 2 3 5 8 13 21 34
     * <p>
     * Como se puede apreciar, los dos primeros numeros de la serie siempre son 0 y
     * 1, y los siguientes son el resultado de sumar los dos numeros que le preceden
     * en la serie.
     * Utilizar bucles para su resoluci�n. En caso contrario se considerar� no v�lido.
     *
     * @param n
     */
    public void fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(n1 + " ");
            n1 += n2;
            n2 = n1 - n2;
        }
        System.out.println();
    }

    /**
     * Este metodo calcula la cuota mensual de una hipoteca a tipo de inter�s fijo y
     * adem�s calcula qu� parte de esa cuota mensual se corresponden con intereses,
     * mostrando estos intereses por cada mes, a�o y adem�s el importe total de los
     * intereses pagados al finalizar el pr�stamo hipotecario.
     * Por ejemplo, para una hipoteca por importe de 200.000?, 1,75% de inter�s y
     * 30 a�os de plazo, la cuota mensual ser� de 714? y los intereses totales pagados
     * al final de esos 30 a�os ser�n de 57.214?.
     * <p>
     * La f�rmula para calcular la cuota mensual de la hipoteca es:
     * Cuota = importe * ((tipo inter�s * (1 + tipo inter�s) ^ periodo)) / ((1 + tipo inter�s) ^ periodo) - 1))
     * <p>
     * El tipo de inter�s ser� el resultado de dividir el interes recibido como par�metros
     * entre 1200.
     * El periodo es el n�mero de a�os de la hipoteca multiplicado por 12 (12 meses por a�o).
     *
     * @param importe importe de la hipoteca
     * @param interes inter�s del pr�stamo hipotecario. Por ejemplo, 1,5%
     * @param anios   a�os que tardar� el usuario en devolver el importe de la hipoteca.
     */
    public void calcularHipoteca(int importe, double interes, int anios) {
        /**int periodo = anios * 12;
         double tipo_interes = interes / 1200;
         double cuota = importe * ((tipo_interes * Math.pow((1 + tipo_interes), periodo))) / (Math.pow((1 + tipo_interes), periodo) - 1);

         double deuda_pendiente = cuota;
         double interes_mesual = deuda_pendiente * 0.75;
         deuda_pendiente = deuda_pendiente - (cuota - interes_mesual);
         interes_mesual = deuda_pendiente * 0.25;

         double mess[] = {291.6666666666667, 291.6666666666667, 291.05006510416666, 290.43255208333335, 289.814150390625, 289.19483723958336, 288.5746126302083, 287.95349934895836, 287.331474609375, 286.70853841145833, 286.0846907552083, 285.45993164062503, 284.8342610677083, 284.20767903645833, 283.580185546875, 282.95178059895835, 282.32246419270837, 281.69221354166666, 281.06105143229166, 280.4289778645834, 279.79597005208336, 279.16205078125, 278.52719726562503, 277.89143229166666, 277.2547330729167, 276.61709960937503, 275.97853190104166, 275.3390299479167, 274.69861653645836, 274.05726888020837, 273.41498697916666, 272.771748046875, 272.12757486979166, 271.4824674479167, 270.83642578125, 270.1894270833333, 269.541494140625, 268.8926041666667, 268.2427799479167, 267.59199869791667, 266.94028320312503, 266.28761067708336, 265.63398111979166, 264.97939453125, 264.32387369791667, 263.66739583333333, 263.0099609375, 262.35154622395834, 261.6921744791667, 261.031845703125, 260.37055989583337, 259.70831705729165, 259.0450944010417, 258.3809147135417, 257.71575520833335, 257.049638671875, 256.3825423177083, 255.71446614583334, 255.04543294270835, 254.37541992187502, 253.70442708333334, 253.03245442708334, 252.359501953125, 251.68556966145835, 251.01065755208336, 250.33476562500002, 249.65787109375, 248.9799967447917, 248.30114257812502, 247.62128580729168, 246.94044921875002, 246.25861002604168, 245.57576822916667, 244.89194661458333, 244.20712239583335, 243.52129557291667, 242.83446614583335, 242.14663411458335, 241.45779947916668, 240.76796223958334, 240.07712239583336, 239.38527994791667, 238.692412109375, 237.99854166666668, 237.30366861979167, 236.6077701822917, 235.910869140625, 235.21294270833334, 234.5139908854167, 233.81403645833333, 233.11305664062502, 232.41105143229169, 231.70802083333334, 231.00396484375, 230.29888346354167, 229.59277669270836, 228.88564453125002, 228.17748697916667, 227.46828125000002, 226.75805013020835, 226.04677083333334, 225.33446614583335, 224.62111328125002, 223.90673502604167, 223.19130859375002, 222.474833984375, 221.75731119791666, 221.038740234375, 220.31912109375, 219.59845377604168, 218.87673828125, 218.153974609375, 217.43016276041666, 216.70527994791667, 215.97934895833333, 215.25236979166667, 214.52431966145835, 213.79519856770835, 213.065029296875, 212.33378906250002, 211.60147786458333, 210.86809570312502, 210.133642578125, 209.39811848958334, 208.66152343750002, 207.923857421875, 207.18512044270835, 206.4453125, 205.70441080729168, 204.96243815104168, 204.2193717447917, 203.475234375, 202.73000325520835, 201.983701171875, 201.23630533854168, 200.48781575520835, 199.738232421875, 198.98755533854168, 198.23578450520833, 197.482919921875, 196.72896158854167, 195.97388671875, 195.21771809895833, 194.46045572916668, 193.70207682291667, 192.94260416666668, 192.18201497395833, 191.42030924479167, 190.65749837239585, 189.89358235677085, 189.1285498046875, 188.36240071614583, 187.59513509114583, 186.8267529296875, 186.05725423177086, 185.28662760416668, 184.514873046875, 183.742001953125, 182.96800292968751, 182.1928759765625, 181.41660970052084, 180.63921549479167, 179.86068196614585, 179.0810205078125, 178.30021972656252, 177.51827962239585, 176.7352001953125, 175.95098144531252, 175.16561197916667, 291.6666666666667, 291.6666666666667, 291.05006510416666, 290.43255208333335, 289.814150390625, 289.19483723958336, 288.5746126302083, 287.95349934895836, 287.331474609375, 286.70853841145833, 286.0846907552083, 285.45993164062503, 284.8342610677083, 284.20767903645833, 283.580185546875, 282.95178059895835, 282.32246419270837, 281.69221354166666, 281.06105143229166, 280.4289778645834, 279.79597005208336, 279.16205078125, 278.52719726562503, 277.89143229166666, 277.2547330729167, 276.61709960937503, 275.97853190104166, 275.3390299479167, 274.69861653645836, 274.05726888020837, 273.41498697916666, 272.771748046875, 272.12757486979166, 271.4824674479167, 270.83642578125, 270.1894270833333, 269.541494140625, 268.8926041666667, 268.2427799479167, 267.59199869791667, 266.94028320312503, 266.28761067708336, 265.63398111979166, 264.97939453125, 264.32387369791667, 263.66739583333333, 263.0099609375, 262.35154622395834, 261.6921744791667, 261.031845703125, 260.37055989583337, 259.70831705729165, 259.0450944010417, 258.3809147135417, 257.71575520833335, 257.049638671875, 256.3825423177083, 255.71446614583334, 255.04543294270835, 254.37541992187502, 253.70442708333334, 253.03245442708334, 252.359501953125, 251.68556966145835, 251.01065755208336, 250.33476562500002, 249.65787109375, 248.9799967447917, 248.30114257812502, 247.62128580729168, 246.94044921875002, 246.25861002604168, 245.57576822916667, 244.89194661458333, 244.20712239583335, 243.52129557291667, 242.83446614583335, 242.14663411458335, 241.45779947916668, 240.76796223958334, 240.07712239583336, 239.38527994791667, 238.692412109375, 237.99854166666668, 237.30366861979167, 236.6077701822917, 235.910869140625, 235.21294270833334, 234.5139908854167, 233.81403645833333, 233.11305664062502, 232.41105143229169, 231.70802083333334, 231.00396484375, 230.29888346354167, 229.59277669270836, 228.88564453125002, 228.17748697916667, 227.46828125000002, 226.75805013020835, 226.04677083333334, 225.33446614583335, 224.62111328125002, 223.90673502604167, 223.19130859375002, 222.474833984375, 221.75731119791666, 221.038740234375, 220.31912109375, 219.59845377604168, 218.87673828125, 218.153974609375, 217.43016276041666, 216.70527994791667, 215.97934895833333, 215.25236979166667, 214.52431966145835, 213.79519856770835, 213.065029296875, 212.33378906250002, 211.60147786458333, 210.86809570312502, 210.133642578125, 209.39811848958334, 208.66152343750002, 207.923857421875, 207.18512044270835, 206.4453125, 205.70441080729168, 204.96243815104168, 204.2193717447917, 203.475234375, 202.73000325520835, 201.983701171875, 201.23630533854168, 200.48781575520835, 199.738232421875, 198.98755533854168, 198.23578450520833, 197.482919921875, 196.72896158854167, 195.97388671875, 195.21771809895833, 194.46045572916668, 193.70207682291667, 192.94260416666668, 192.18201497395833, 191.42030924479167, 190.65749837239585, 189.89358235677085, 189.1285498046875, 188.36240071614583, 187.59513509114583, 186.8267529296875, 186.05725423177086, 185.28662760416668, 184.514873046875, 183.742001953125, 182.96800292968751, 182.1928759765625, 181.41660970052084, 180.63921549479167, 179.86068196614585, 179.0810205078125, 178.30021972656252, 177.51827962239585, 176.7352001953125, 175.95098144531252, 175.16561197916667, 183.742001953125, 182.96800292968751, 182.1928759765625, 181.41660970052084, 180.63921549479167, 179.86068196614585, 179.0810205078125, 178.30021972656252, 177.51827962239585, 176.7352001953125, 175.95098144531252, 12.385753173828126, 11.361855773925782, 10.336465148925782, 9.309579162597657, 8.281195678710938, 7.2513125610351565, 6.219927673339844, 5.18703852335612, 4.152642974853515, 3.1167388916015626, 2.0793241373697917, 1.0403963979085287};

         int anioss = 1;
         double sa = 0;
         System.out.println("---------------------------");
         System.out.println("cuota ipoteca: " + cuota);
         System.out.println("---------------------------");
         for (int i = 1; i <= periodo; i++) {
         deuda_pendiente = deuda_pendiente - (cuota - interes_mesual);
         System.out.println("Mes " + i + ": " + mess[i]);
         interes_mesual = deuda_pendiente * 0.25;
         sa += mess[i];

         if (i % 12 == 0){
         System.out.println("---------------------------");
         System.out.println("a�o " + anioss + ": " + sa);
         System.out.println("---------------------------");
         anioss++;

         }
         }*/

        int periodo = anios * 12;
        double tipo_interes = interes / 1200;
        double cuota = importe * ((tipo_interes * Math.pow((1 + tipo_interes), periodo))) / (Math.pow((1 + tipo_interes), periodo) - 1);
        double deuda_pendiente = importe;
        double interes_mensual = 0;
        int anioss = 1;
        double sa = 0;

        System.out.println("---------------------------");
        System.out.println("cuota ipoteca: " + cuota + "€");
        System.out.println("---------------------------");

        for (int i = 1; i <= periodo; i++) {
            interes_mensual = deuda_pendiente * tipo_interes;
            sa = sa + interes_mensual;

            System.out.println("Mes " + i + ": " + interes_mensual + "€");
            deuda_pendiente = deuda_pendiente - (cuota - interes_mensual);

            if (i % 12 == 0) {
                System.out.println("---------------------------");
                System.out.println("anio " + anioss + ": " + sa + "€");
                System.out.println("---------------------------");
                anioss++;
                sa = 0;
            }
        }
    }

    /**
     * La tabla Chetada es una celebre figura matematica utilizada por cierto
     * profesor de DAW1 que, por motivos de seguridad, prefiere permanecer en el
     * anonimato. La figura solo est� disponible para valores impares y tiene el
     * siguiente formato. Para n = 9:
     * <p>
     * 1 9 9 9 9 9 9 9 1
     * 9 2 9 9 9 9 9 2 9
     * 9 9 3 9 9 9 3 9 9
     * 9 9 9 4 9 4 9 9 9
     * 9 9 9 9 5 9 9 9 9
     * 9 9 9 6 9 6 9 9 9
     * 9 9 7 9 9 9 7 9 9
     * 9 8 9 9 9 9 9 8 9
     * 9 9 9 9 9 9 9 9 9
     * <p>
     * Es decir, mostrar� una tabla de n x n elementos, donde todo elemento ser�
     * igual a n, a excepci�n de aquellos que forman las diagonales, que tendr�n
     * valores secuenciales empezando en 1 e increment�ndose de 1 en 1 hasta llegar a n.
     *
     * @param n
     * @return
     */
    public void mostrarTablaChetada(int n) {
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= n; j++) {

                    if (i == j || j == (n - i + 1)) {
                        System.out.print(i + ("\t"));
                    } else {
                        System.out.print(n + "\t");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println(n + (" es par"));
        }
    }

    /**
     * Este metodo simula el funcionamiento de una m�quina que cambia billetes a
     * monedas de euro. La m�quina solo dispone de monedas de 2, 1 y 50 c�ntimos.
     * Para intentar no agotar monedas de un valor antes de tiempo, la m�quina
     * intenta devolver un n�mero de parejo de monedas de los distintos valores.
     * Para ello la din�mica m�s sencilla es ir restando a la cantidad a cambiar
     * una moneda de cada valor en cada pasada, hasta que el cambio sume la cantidad
     * a devolver.
     * <p>
     * Por ejemplo, para n = 20? mostrara:
     * <p>
     * Monedas de 2?: 6
     * Monedas de 1?: 5
     * Monedas de 50 c�ntimos: 6
     *
     * @param n Cantidad a cambiar
     */
    public void cambiarAMonedas(int n) {
        int m2 = 0;
        int m1 = 0;
        int m50 = 0;
        System.out.println("dinero " + n);

        while (0 < n) {
            if (n - 2 >= 0) {
                m2++;
                n -= 2;
            }

            if (n - 1 >= 0) {
                m1++;
                n -= 1;
            }

            if (n - 1 >= 0 && m50 < m1) {
                m50 += 2;
                n -= 1;
            }
        }

        System.out.println("monedas de 2�: " + m2);
        System.out.println("monedas de 1�: " + m1);
        System.out.println("monedas de 0.50�: " + m50);
        System.out.println(n);

    }
}
