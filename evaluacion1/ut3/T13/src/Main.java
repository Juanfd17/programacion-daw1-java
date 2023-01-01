public class Main {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(29,2,2004);
        System.out.println(fecha.printCorta());
        System.out.println(fecha.printLarga());
        System.out.println(fecha.diaMes());
        System.out.println(fecha.esBisiesto());
        System.out.println(fecha.esCorrecta());
    }
}