public class Suma implements OperacionMatematica {
    @Override
    public int calcular(int a, int b) {
        return sumar(a,b);
    }

    Suma suma = new Suma();
    Multiplicacion multiplicacion = new Multiplicacion();


}
