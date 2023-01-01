public class Main {
    public static void main(String[] args) {

        //coche

        Coche coche = new Coche("S Plaid", "Tesla", "Blanco", 1000, 19);
        coche.imprimeCaracteristicas();


        //otro coche1

        Coche coche1 = new Coche("S Plaid", "Tesla", "Blanco", 1000, 19);
        coche1.imprimeCaracteristicas();

        // forma por defecto
        Coche coche2 = new Coche();
        coche2.inicializarAtributos("A6", "Audi", "negro", 400, 22);
        coche2.imprimeCaracteristicas();

        //contruztor a medida con menos cosas
        Coche coche3 = new Coche("Opel", "Corsa");
        coche3.imprimeCaracteristicas();

        System.out.println(coche1.esIgual(coche.modelo, coche.marca, coche.color, coche.potencia, coche.tamanioRuedas));

        System.out.println(coche1.esIgual1(coche2));
    }
}