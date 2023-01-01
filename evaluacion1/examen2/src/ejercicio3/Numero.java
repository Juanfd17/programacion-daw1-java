package src.ejercicio3;

import java.util.IllegalFormatCodePointException;

public class Numero {


    public boolean esChingon(int numero) {
        while (numero > 0){
            while (numero > 15) {
                if ((int) (numero / 16) >= 10) {
                    numero = (int) (numero % 16);
                } else {
                    return false;
                }
            }

            if (numero >= 10){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void pintarArbolNavidad(int numero) {
        System.out.println("==============================");
        System.out.println("F E L I Z  N A V I D A D");
        System.out.println("==============================");

        for (int triangulos = 2; triangulos < numero / 2 + 2; triangulos++) {
            for (int tr = 0; tr < triangulos; tr++) {

                for (int espacios = 0; espacios < numero / 2 - tr; espacios++) {
                    System.out.print(" ");
                }

                for (int i = 0; i < tr; i++) {
                    System.out.print("*");
                }

                System.out.print("*");

                for (int i = 0; i < tr; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        int anchos = numero/3;
        int espacios= (numero/2) - anchos/2;
        if (anchos/2 > 2) {
            espacios = (numero / 2) - (anchos / 2);
        }
        int altura = ((numero/2)/2);
        if (altura < 2){
            altura = 2;
        }

        if (espacios+1 + anchos+1 == numero){
            espacios--;
        }

        for (int alto = 0; alto < altura; alto++) {

            for (int espacio = 0; espacio < espacios; espacio++) {
                System.out.print(" ");
            }

            for (int i = 0; i < ((numero / 2) / 2) + 2; i++) {
                System.out.print("|");
            }
            System.out.println();
        }
    }
}