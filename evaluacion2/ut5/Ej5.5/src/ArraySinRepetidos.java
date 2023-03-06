public class ArraySinRepetidos {
    final int MAX = 10;
    int [] elemento;
    int siguiente;

    public ArraySinRepetidos() {
        this.elemento = new int[MAX];
        this.siguiente = 0;
    }

    public void insertar(int numero){
        if (!estaCompleto() && !estaElemento(numero)){
            elemento[siguiente] = numero;
            siguiente++;
        }
    }

    public boolean estaElemento(int numero){
        int medio = siguiente/2;
        int nmedio = elemento[medio];

        if (numero >= nmedio){
            for (int i = medio; i < siguiente; i++) {
                if (elemento[i] == numero){
                    return true;
                }
            }
        } else {
            for (int i = medio; i >= 0; i--) {
                if (elemento[i] == numero){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean estaCompleto(){
        return siguiente >= MAX;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < siguiente; i++) {
            sb.append(elemento[i]);
            if (i < siguiente - 1){
                sb.append(", ");
            } else {
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
