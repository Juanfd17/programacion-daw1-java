package src.ejercicio3;

public class AppNumero {

    public static void main(String[] args) {
        Numero num = new Numero();
        int numero = 170;
        System.out.println("¿" + numero + " es chingón? " + num.esChingon(numero));
        numero = 200;
        System.out.println("¿" + numero + " es chingón? " + num.esChingon(numero));
        numero = 65482;
        System.out.println("¿" + numero + " es chingón? " + num.esChingon(numero));
        numero = 65481;
        System.out.println("¿" + numero + " es chingón? " + num.esChingon(numero));
        numero = 10;
        System.out.println("¿" + numero + " es chingón? " + num.esChingon(numero));

        num.pintarArbolNavidad(21);
    }
}