public class Main {
    public static void main(String[] args) {
        Linea l1 = new Linea();
        l1.setPunto1(13,14);
        l1.setPunto2(20,30);
        System.out.println(l1.printLinea());
        l1.moverArriba(10);
        l1.moverDerecha(5);
        l1.moverAbajo(2);
        l1.moverIzquierda(1);
        System.out.println(l1.printLinea());
    }
}