public class Main {
    public static void main(String[] args) {
        String nombre = "Juan";
        int edad = 30;
        double altura = 1.75;

        String mensaje = String.format("Hola, mi nombre es %s, tengo %d años y mido %.2f metros de altura.", nombre, edad, altura);
        System.out.println(mensaje);

    }
}