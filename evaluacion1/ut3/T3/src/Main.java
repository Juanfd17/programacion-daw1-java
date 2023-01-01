public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();

        contador.printContador();
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        contador.printContador();
        contador.decrementar();
        contador.printContador();
        contador.reset();
        contador.printContador();
    }
}