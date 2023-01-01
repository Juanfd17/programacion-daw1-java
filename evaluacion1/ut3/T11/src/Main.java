public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.introducirNumero(5);
        calculadora.introducirNumero(3);
        calculadora.introducirNumero(8);
        calculadora.introducirNumero(10);

        System.out.println(calculadora.getMinimo());
        System.out.println(calculadora.getMaximo());
        System.out.println(calculadora.getMedia());

    }
}