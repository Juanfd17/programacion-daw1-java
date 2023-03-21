public class Main {
    public static void main(String[] args) {
        Nodos nodo1 = new Nodos(5);
        Lista lista = new Lista(nodo1);
        for (int i = 0; i < 500; i++) {
            lista.anadir(new Nodos(i+1));
        }

        lista.imprimir();

        lista.borrar(5);
        lista.imprimir();
    }
}