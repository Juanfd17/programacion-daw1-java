package ej4a7;

public class Main {
    public static void main(String[] args) {
        CuentaAhorro miCuenta = new CuentaAhorro("Pepe", 100.52,0.035);
        miCuenta.ingresar(500);
        miCuenta.retirar(250);
        miCuenta.ingresar(miCuenta.getInteres());
        System.out.println(miCuenta);
        CuentaCorrinete tuCuenta = new CuentaCorrinete("Jose", 1000.95,2,500);
        tuCuenta.retirar(700);
        tuCuenta.ingresar(150);
        tuCuenta.retirar(tuCuenta.getRecargo());
        System.out.println(tuCuenta);
    }
}
