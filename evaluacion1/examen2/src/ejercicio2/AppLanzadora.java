package src.ejercicio2;

import java.util.Scanner;

/**
 *   @author - 
 *   Todo el código se escribirá dentro del main()
 */
public class AppLanzadora
{

    /**
     *  
     *  Incluye código para probar 
     *  los métodos de las clases Lanzadora,  Punto y Direccion
     *    
     */
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Teclee x: ");
        int x = teclado.nextInt();
        System.out.print("Teclee y: ");
        int y = teclado.nextInt();
        System.out.print("Teclee direccion (1 - ESTE / 2 - OESTE): ");
        int direccion = teclado.nextInt();

        while (direccion != 1 && direccion != 2){
            System.out.println("Incirrecto, ");
            System.out.print("Teclee direccion (1 - ESTE / 2 - OESTE): ");
            direccion = teclado.nextInt();
        }

        Direccion direccion1 = new Direccion(direccion);
       Lanzadora l1 = new Lanzadora(x,y,direccion1);
        System.out.println(l1);
        l1.mover();
        l1.mover();
        System.out.println(l1);
        l1.cambiarDireccion();
        l1.mover();
        l1.mover();
        System.out.println(l1);
    }
}
