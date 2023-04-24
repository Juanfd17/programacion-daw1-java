import java.util.HashMap;
import java.util.Set;

public class Venta {
    private String dni;
    private HashMap<String ,Integer> productos;

    public Venta(String dni) {
        this.dni = dni;
        productos = new HashMap<>();
    }

    public double getImporteTotal(){
        Set<String> lista = productos.keySet();
        double total = 0;
        for (String p: lista) {
            double precio = Aplicacion.getCosteProducto(p);
            if (precio != -1){
                total += precio * productos.get(p);
            }
        }

        return total;
    }

    public HashMap<String, Integer> getProductos() {
        return productos;
    }

    public void anadirProducto(String p, int numero){
        productos.put(p, numero);
    }
}
