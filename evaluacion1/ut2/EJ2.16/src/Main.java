import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        int contador = 2;
        Boolean primo = true;

        while (contador < numero && primo == true) {
            if (numero%contador==0){
                primo = false;
            }
            contador++;
        }
        System.out.println(primo);
    }
}