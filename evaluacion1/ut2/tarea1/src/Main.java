public class Main {
    public static void main(String[] args) {
        int numero = 6;
        boolean esPar = (numero % 2 == 0);
        System.out.println(esPar);

        switch ((esPar) ? 1 : 2){
            case 1:
                System.out.println("El nº " + numero + " es par");
                break;
            case 2:
                System.out.println("El nº " + numero + " es impar");
                break;
        }
        Ejecicio2();
    }
    public  static void Ejecicio2() {
        int num = -100;
        switch ((num < 0) ? 1 : (num < 100) ? 2 : 3) {

            case 1:
                System.out.println("Es negativo");
                break;
            case 2:
                System.out.println("Es positivo y menor que 100");
                break;
            case 3:
                System.out.println("es mayor o igual que 100");
                break;
        }
    }
}