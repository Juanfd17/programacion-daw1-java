import java.util.Scanner;

public class InterfazUsuario {
    ArraySinRepetidos[] array;
    Scanner teclado;
    int siguiente;

    public InterfazUsuario() {
        teclado = new Scanner(System.in);
        array = new ArraySinRepetidos[5];
        siguiente = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = new ArraySinRepetidos();
        }
    }

    public void ejecutar(){
        boolean sige = true;
        while (sige){
            System.out.print("Inserta un numero: ");
            int numero = tecladoInt();
            if (numero == 0){
                sige = false;
            } else {
                boolean repe = false;
                for (int i = 0; i <= siguiente; i++) {
                   if (array[i].estaElemento(numero)){
                       repe = true;
                   }
                }

                if (!repe) {
                    array[siguiente].insertar(numero);
                    if (array[siguiente].estaCompleto()) {
                        siguiente++;
                        System.out.println("Empieza el siguiente array");
                    }

                    if (siguiente == array.length) {
                        sige = false;
                    }
                } else {
                    System.out.println("El numero esta repetido");
                }
            }
        }
        System.out.println("Acabose");
    }

    public int tecladoInt() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        if (sc.hasNextInt()) {
            numero = sc.nextInt();

        } else {
            System.out.println("Meta un numero entero");
            tecladoInt();
        }

        return numero;
    }
}
