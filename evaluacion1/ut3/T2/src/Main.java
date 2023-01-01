public class Main {
    public static void main(String[] args) {
        Hucha hucha = new Hucha();
        Hucha hucha1 = new Hucha();

        hucha.masDinero(100);
        hucha.printDetalles();
        hucha.menosDinero(30.25);
        hucha.printDetalles();

        hucha1.masDinero(300.30);
        hucha1.printDetalles();
        hucha1.menosDinero(250.95);
        hucha1.printDetalles();


        System.out.println("------hucha------");
        hucha.printDetalles();
        System.out.println("------hucha1------");
        hucha1.printDetalles();
    }
}