public class Lista {
    Nodos nodo;
    public Lista(Nodos nodo) {
        this.nodo = nodo;
    }

    public void anadir(Nodos nodo){
        Nodos nodo1 = this.nodo;
        while (nodo1.getNodo() != null){
            nodo1 = nodo1.getNodo();
        }
        nodo1.setNodo(nodo);
    }

    public void borrar(int busqueda){
        Nodos nodo1 = this.nodo;
        int contador = 0;
        while (nodo1.getValor() != busqueda){
            nodo1 = nodo1.getNodo();
            contador++;
        }

        nodo1 = this.nodo;
        contador--;
        for (int i = 0; i < contador; i++) {
            nodo1 = nodo1.getNodo();
        }
        System.out.println(nodo1.getValor());
        nodo1.setNodo(nodo1.getNodo().getNodo());
    }

    public void imprimir(){
        System.out.println(nodo);
    }
}