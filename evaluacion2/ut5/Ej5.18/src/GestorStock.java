import java.util.ArrayList;
import java.util.Iterator;

public class GestorStock {
    private ArrayList<Producto> productos;

    public GestorStock() {
        this.productos = new ArrayList<>();
    }

    public void aniadirProducto(Producto producto){
        productos.add(producto);
    }

    public void escribirDetallesProductos1(){
        Iterator<Producto> it = productos.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public void escribirDetallesProductos2(){
        for (Producto p: productos) {
            System.out.println(p);
        }
    }

    public void escribirDetallesProductos3(){
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }
    }
}