import java.util.Scanner;

public class InterfazDiccionario {
    Diccionario diccionario;
    public InterfazDiccionario() {
        System.out.println("Introduzca el numero de palabras maximas para el dicionario");
        int numeroPalabras = tecladoInt();
        this.diccionario = new Diccionario(numeroPalabras);
    }

    public String verDiccionario() {
        return diccionario.escribirDiccionario();
    }

    public void iniciarDiccionario(){
        verMenu();
        elegirApartado();
    }

    public void verMenu() {
        System.out.println("1: Traducir una palabra");
        System.out.println("2: Ver palabra");
        System.out.println("3: Ver todo el diccionario");
        System.out.println("4: Añadir una palabra al diccionario");
    }

    public void elegirApartado() {
        int numero = tecladoInt(1,4);
        if (numero == 1) {
            System.out.println("Introduce la palabra a traducir");
            String palabra = tecladoString();
            System.out.println(diccionario.traducirPalabra(palabra));
        } else if (numero == 2) {
            System.out.println("Introduce el numero de la palabra");
            int palabra = tecladoInt(1,diccionario.MAX_PALABRAS);
            System.out.println(diccionario.verPalabra(palabra-1));
        } else if (numero == 3) {
            System.out.println(verDiccionario());
        } else if (numero == 4) {
            System.out.println("Palabra en español");
            String palabra1 = tecladoString();
            System.out.println("Palabra en ingles");
            String palabra2 = tecladoString();
            diccionario.crearPalabra(palabra1, palabra2);
        }
        iniciarDiccionario();
    }

    static public String tecladoString(){
        Scanner sc = new Scanner(System.in);
        String palabra = sc.next();
        return palabra;
    }

    static public int tecladoInt() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        if (sc.hasNextInt()) {
            numero = sc.nextInt();

        } else {
            System.out.println("Meta un numero entero");
            tecladoInt();
        }

        return numero;
    }

    static public int tecladoInt(int numeroMenor,int numeroMayor) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        if (sc.hasNextInt()) {
            numero = sc.nextInt();

            if (numero < numeroMenor || numero > numeroMayor) {
                System.out.println("Eliga un numero del menu");
                tecladoInt(numeroMenor,numeroMayor);
            }
        } else {
            System.out.println("Meta un numero entero");
            tecladoInt(numeroMenor,numeroMayor);
        }

        return numero;
    }

   static public void mensage(String mensage){
        System.out.println(mensage);
    }
}
