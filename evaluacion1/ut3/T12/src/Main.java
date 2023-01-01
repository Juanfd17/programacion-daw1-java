public class Main {
    public static void main(String[] args) {
        Hora hora = new Hora(23,59,59);
        System.out.println(hora);
        hora.avanzarSegundo();
        System.out.println(hora);
        hora.atrasarSegundo();
        System.out.println(hora);
        System.out.println(hora.aSegundos());
    }
}