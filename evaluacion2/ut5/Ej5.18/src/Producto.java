public class Producto {
    private int id;
    private String nombre;
    private int stock;

    public Producto(int id, String nombre, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
    }

    public void incrementarcantidad(int cantidad){
        stock += cantidad;
    }

    public void vender(){
        stock--;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("--------");
        sb.append("Id: ").append(id).append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Stock: ").append(stock).append("\n");
        return sb.toString();
    }
}
