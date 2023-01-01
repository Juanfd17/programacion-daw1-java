public class Main {
    public static void main(String[] args) {
        int numero = 0;
        int contador = 0;
        int contador12 = 0;
        while (numero != 99 && contador < 30){
            numero = (int) (Math.random() * 100) + 1;
            System.out.println(numero);
            contador++;
            if(numero == 12){
                contador12++;
            }
        }
        System.out.println("Han salido " + contador12 +" 12s");
    }
}