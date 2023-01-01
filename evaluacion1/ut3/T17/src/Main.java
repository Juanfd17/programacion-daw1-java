public class Main {
    public static void main(String[] args) {
        Hora hora = new Hora(22,12,07);
        System.out.println(hora.enFormatoAmPm());

        Hora hora1 = new Hora(06,06,13);
        System.out.println(hora1.enFormatoAmPm());

        Hora hora2 = new Hora(12,12,07);
        System.out.println(hora2.enFormatoAmPm());

        Hora hora3 = new Hora(00,12,07);
        System.out.println(hora3.enFormatoAmPm());

        System.out.println(hora);
        System.out.println(hora1);
        System.out.println(hora2);
        System.out.println(hora3);
    }

}