import java.util.Scanner;

public class MainCine {
    private static Cine cine;

    public static void main(String[] args) {
        crearCine();
    }

    public static void crearCine() {
        System.out.println("Creacion del cine");
        System.out.println("Introduce los datos del cine");
        System.out.print("Localidad: ");
        String localidad = tecladoString();
        System.out.print("Nombre: ");
        String nombre = tecladoString();

        cine = new Cine(localidad, nombre);
        System.out.println();
        menu();
    }

    public static void menu() {
        System.out.println("-----------Opciones------");
        System.out.println("1: Añadir cliente");
        System.out.println("2: Añadir pelicula");
        System.out.println("3: Ver peliculas");
        System.out.println("4: Ver clientes");
        System.out.println("5: Comprar entrada");
        System.out.println("6: Borrar pelicula");
        System.out.println("7: Cambiar datos");
        System.out.println("8: Ver todos los datos del cine");
        System.out.print("Elige una opcion: ");
        int opcion = tecladoInt(1, 8);
        System.out.println("-------------------------");
        switch (opcion) {
            case 1:
                aniadirCliente();
                break;
            case 2:
                aniadirPeliculas();
                break;
            case 3:
                verPeliculas();
                break;
            case 4:
                verClientes();
                break;
            case 5:
                comprarEntrada();
                break;
            case 6:
                borrarPelicula();
                break;
            case 7:
                cambiarDatos();
                break;
            case 8:
                System.out.println(cine);
                break;
        }
        menu();
    }

    public static void aniadirCliente() {
        System.out.println("Escriba los datos del cliente");
        System.out.print("Nombre: ");
        String nombre = tecladoString();
        System.out.print("Apellidos: ");
        String apellidos = tecladoString();
        System.out.print("Año nacimiento: ");
        int anioNacimiento = tecladoInt();
        System.out.print("Mes nacimiento: ");
        int mesNacimiento = tecladoInt(1, 12);
        System.out.print("Dia nacimiento: ");
        int diaNacimiento = tecladoInt(1, 31);
        System.out.print("DNI: ");
        String dni = tecladoString();
        System.out.print("Tipo de cueta (Joven, Jubilado, VIP): ");
        String sTipoCuenta = tecladoString();
        boolean acept = false;
        do {
            if (sTipoCuenta.equals("Joven") || sTipoCuenta.equals("joven")) {
                cine.crearClienteJoven(nombre, apellidos, anioNacimiento, mesNacimiento, diaNacimiento, dni);
                acept = true;
            } else if (sTipoCuenta.equals("Jubilado") || sTipoCuenta.equals("jubilado")) {
                cine.crearClienteJubilado(nombre, apellidos, anioNacimiento, mesNacimiento, diaNacimiento, dni);
                acept = true;
            } else if (sTipoCuenta.equals("VIP") || sTipoCuenta.equals("vip")) {
                cine.crearClienteVip(nombre, apellidos, anioNacimiento, mesNacimiento, diaNacimiento, dni);
                acept = true;
            }

            if (!acept) {
                System.out.println("Deve elejir Joven, Jubilado o VIP");
                sTipoCuenta = tecladoString();
            }
        } while (!acept);
    }

    public static void aniadirPeliculas() {
        System.out.println("Escriba los datos de la pelicula");
        System.out.print("Nombre: ");
        String nombre = tecladoString();
        System.out.println("Lanzamiento:");
        System.out.print("Año: ");
        int anioLanzamiento = tecladoInt();
        System.out.print("Mes: ");
        int mesLanzamiento = tecladoInt(1, 12);
        System.out.print("Dia: ");
        int diaLanzamiento = tecladoInt(1, 31);
        System.out.print("Numero de entradas vendidas: ");
        int entradasVendidas = tecladoInt();
        System.out.println("Horas si no necesita todas introduzca -1");
        System.out.print("1º Hora: ");
        double hora1 = tecladoDouble();
        System.out.print("2º Hora: ");
        double hora2 = tecladoDouble();
        System.out.print("3º Hora: ");
        double hora3 = tecladoDouble();
        System.out.print("4º Hora: ");
        double hora4 = tecladoDouble();
        System.out.print("Es una pelicula infantil: ");
        String infantil = tecladoString();
        boolean bInfantil;
        while (!(infantil.equals("Si") || infantil.equals("si") || infantil.equals("No") || infantil.equals("no"))) {
            System.out.println("Escriba si o no");
            infantil = tecladoString();
        }
        if (infantil.equals("Si") || infantil.equals("si")) {
            bInfantil = true;
        } else {
            bInfantil = false;
        }

        System.out.print("Poductora: ");
        String productora = tecladoString();

        cine.crearPelicula(nombre, anioLanzamiento, mesLanzamiento, diaLanzamiento, entradasVendidas, hora1, hora2, hora3, hora4, bInfantil, productora);
    }

    public static void verPeliculas() {
        System.out.println("---------------------------");
        System.out.println(cine.monstrarPeliculas());
    }

    public static void verClientes() {
        System.out.println("----------------------------");
        System.out.println(cine.monstrarClientes());
    }

    public static void comprarEntrada() {
        System.out.print("Año de estreno: ");
        int anioEstreno = tecladoInt();
        System.out.print("Nombre de la pelicula: ");
        String nombre = tecladoString();
        System.out.print("DNI del cliente: ");
        String dni = tecladoString();
        System.out.println(cine.comprarEntrda(anioEstreno, nombre, dni));
    }

    public static void borrarPelicula() {
        System.out.println("Introduce los datos de la pelicula");
        System.out.print("Año de estreno: ");
        int anio = tecladoInt();
        System.out.print("Nombre: ");
        String nombre = tecladoString();
        if (cine.borrarPelicula(nombre, anio)) {
            System.out.println("Pelicula borrada");
        } else {
            System.out.println("Error pelicula no encontrada");
        }
    }

    public static void cambiarDatos() {
        System.out.println("1: Localidad y nombre = localidad");
        System.out.println("2: Localdid = localidad, nombre = nombre");
        System.out.print("Introduce una opcion: ");
        int opcion = tecladoInt(1, 2);

        if (opcion == 1) {
            cambiarDatos1();
        } else {
            cambiarDatos2();
        }
    }

    public static void cambiarDatos1() {
        System.out.print("Introduce localidad: ");
        String localidad = tecladoString();
        cine.cambiarDatos(localidad);
    }

    public static void cambiarDatos2() {
        System.out.println("Introduce los datos");
        System.out.print("Localdad: ");
        String localidad = tecladoString();
        System.out.print("Nombre: ");
        String nombre = tecladoString();

        cine.cambiarDatos(localidad, nombre);
    }

    static public String tecladoString() {
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

    static public double tecladoDouble() {
        Scanner sc = new Scanner(System.in);
        double numero = 0;

        if (sc.hasNextDouble()) {
            numero = sc.nextDouble();

        } else {
            System.out.println("Meta un numero");
            tecladoDouble();
        }

        return numero;
    }

    static public int tecladoInt(int numeroMenor, int numeroMayor) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        if (sc.hasNextInt()) {
            numero = sc.nextInt();

            if (numero < numeroMenor || numero > numeroMayor) {
                System.out.println("Eliga un numero entre " + numeroMenor + " y " + numeroMayor);
                tecladoInt(numeroMenor, numeroMayor);
            }
        } else {
            System.out.println("Meta un numero entero");
            tecladoInt(numeroMenor, numeroMayor);
        }

        return numero;
    }
}