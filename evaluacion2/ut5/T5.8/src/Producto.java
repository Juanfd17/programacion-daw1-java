import java.util.Objects;

public class Producto {
    private String codigo;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, String categoria, double precio, int stock) throws RuntimeException {
        if (codigo.length() >= 3){
            throw new RuntimeException("El codigo no puede tener mas de 3 letras");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        return Objects.equals(codigo, ((Producto) o).codigo);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("------").append(codigo).append("-----\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Categoria: ").append(categoria).append("\n");
        sb.append("Unidades: ").append(stock).append("\n");
        sb.append("Precio: ").append(precio).append("€");
        return sb.toString();
    }
}
