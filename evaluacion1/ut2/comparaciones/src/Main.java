public class Main {
    public static void main(String[] args) {
        int radio = 6;
        double perimetro = 2* Math.PI * radio;
        double area = 2 * Math.PI * Math.pow(radio, 2);
        System.out.println(radio);
        System.out.println(perimetro);
        System.out.println(area);

        double valorCompra = 653.36;
        double totalcompra = (valorCompra*0.16)+valorCompra;
        System.out.println("la compra es " + valorCompra + " mas iva");
        System.out.println("la compra es de " + totalcompra + "IVA incluido");

         char teclaPulsada = 's';
         boolean teclaCorrecta = (teclaPulsada == 'S' || teclaPulsada == 's' || teclaPulsada == 'N' || teclaPulsada == 'n');
         System.out.println(teclaCorrecta);

         int valor =20;
         int cantidad = 10;
         cantidad +=valor;
         System.out.println(cantidad);
         int suma = 10;
         suma -= 1;
         System.out.println(suma);
         int x = 7;
         boolean prueba = 4 * 2 <= 8 || 2 * 2  < 5 && 4 > 3 + 1;
         System.out.println(prueba);

         double precio;
         precio = 3.56;
         System.out.println(precio);
         hola();
    }
    public static void hola(){
        int a = 10;
        System.out.println(a);
        boolean frio = false;
        System.out.println(!frio);
    }
}