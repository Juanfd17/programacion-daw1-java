public class Main {
    public static void main(String[] args) {
        ConjuntoEnteros c = new ConjuntoEnteros(10);
        c.printConjunto();
        c.borrarPares();
        System.out.println("--------------------------------");
        c.printConjunto();
    }
}