public class Main {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(20,1,2100);
        System.out.println(fecha.printCorta());
        System.out.println(fecha.printLarga());
        System.out.println(fecha.diaMes());
        System.out.println(fecha.esBisiesto() + " Bisiesto");
        System.out.println(fecha.esCorrecta());
        System.out.println(fecha.printCorta());
        System.out.println(fecha.precedeA(20,1,2005) + " precede");
        fecha.avanzarDia();
    }
}