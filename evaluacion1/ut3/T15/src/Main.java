public class Main {
    public static void main(String[] args) {
        TresNumeros tresNumeros = new TresNumeros(9,8,8);
        System.out.println(tresNumeros.getMaximo() + " Maximo");
        System.out.println(tresNumeros.getMinimo() + " Minimo");
        System.out.println(tresNumeros.cuantosAcabanEn7() + " Acaba 7");
        System.out.println(tresNumeros.cuantosPares() + " pares");
        System.out.println(tresNumeros.sonIguales() + " Iguales");
        tresNumeros.ordenar();
        System.out.println(tresNumeros);
    }
}