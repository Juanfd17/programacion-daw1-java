public class Main {
    public static void main(String[] args) {
        Calentador calentador = new Calentador(10,25);
        calentador.calentar();
        System.out.println(calentador);
        calentador.calentar();
        calentador.calentar();
        calentador.calentar();
        System.out.println(calentador);
        calentador.enfriar();
        calentador.enfriar();
        calentador.enfriar();
        calentador.enfriar();
        System.out.println(calentador);
        calentador.setIncremento(10);
        calentador.calentar();
        System.out.println(calentador);

    }
}