public interface OperacionMatematica {
    int calcular(int a, int b);

    default int sumar(int a, int b){
        return a + b;
    }
}
