public class Main {
    public static void main(String[] args) {
        int temperaturaMax = 26;
        int temperaturaMin = 11; // nuemeros enteros
        double temperaturaMedia = (temperaturaMax + temperaturaMin)/2.0; //numeros no exactos
        int humedad = 60;
        int velocidadViento = 27;
        char direccionViento = 'N'; // un unico caracter
        long temperaturaMercuruio = 222222222; //numeros mas largos
        boolean haceSol = true; //solo true o false
        int resto = 5%2; //con el % te da el resto de la division

        System.out.print("Hoy la temperatura maxima es de " + temperaturaMax + " y la minima es de " + temperaturaMin + "\n"); //salto de linea con \n
        System.out.println("La temperatura media ha sido de " + temperaturaMedia); // salto de linea con ln
        System.out.println("La humdad es de " + humedad);
        System.out.println("El resto de dividir 5 entre 2 es: " + resto);
        System.out.println("la temperatura maxima a subido un grado. La nueba temperatura maxima es " + (temperaturaMax+=10)); //++ para sumar 1 a la variable para sumar otro numero +=5 TIENE QUE IR ENTRE PARENTESIS y lo mismo para restar

        int a = 5;
        int b = 2;
        double c = 3;
        System.out.println(a*a+b*b/c);
        System.out.println(Math.pow(a, 2) + Math.pow(b, 2)/c);


 //Comentario de una linea

        /*
        comentario
        de
        varias
        lineas
         */

        final int ALGO = 5; //este valor no puede cambiar por el resto del programa se suele poner en MAYUSCULAS
    }
}