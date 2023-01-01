public class Main {
    public static void main(String[] args) {
        int edad = 50;
        boolean esAdulto = (edad > 18);
        char teclaPulsada = 's';
        boolean teclaCorrecta = (teclaPulsada == 'S' || teclaPulsada == 's' || teclaPulsada == 'N' || teclaPulsada == 'n');
        System.out.println(esAdulto);
        System.out.println(teclaCorrecta);

        boolean teclaCorrecta2 = (teclaPulsada == ('S' & 's'));
        System.out.println(teclaCorrecta2);
    }
}