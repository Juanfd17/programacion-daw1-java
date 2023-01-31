import java.util.MissingFormatArgumentException;

public class Calculadora {

    public static int realizarOperacion(OperacionMatematica operacion, int a, int b){
        return operacion.calcular(a,b);
    }

    public static void main(String[] args) {
        Suma suma = new Suma();
        Multiplicacion multiplicacion = new Multiplicacion();

        System.out.println(realizarOperacion(suma,1,2));
    }
}
