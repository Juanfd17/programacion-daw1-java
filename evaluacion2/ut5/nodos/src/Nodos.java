public class Nodos {
    private Nodos nodo;
    private int valor;

    public Nodos(int valor) {
        this.valor = valor;
    }

    public Nodos getNodo() {
        return nodo;
    }

    public void setNodo(Nodos nodo){
        this.nodo = nodo;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("valor: ").append(valor).append("\n");
        sb.append(nodo);
        return sb.toString();
    }
}
