import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Aplicacion {
    static Set<Producto> productos;

    public Aplicacion() {
        this.productos = new HashSet<>();
    }

    public boolean anadirProducto(Producto producto){
        return productos.add(producto);
    }

    public boolean modificarExistencias(String codigo, int valor){
       Producto p = encontrarProcuto(codigo);
       if (p != null) {
           if (p.getStock() + valor >= 0) {
               p.setStock(p.getStock() + valor);
               if (borrarProducto(p.getCodigo())) {
                   return anadirProducto(p);
               }
           }
       }

        return false;
    }

    public boolean borrarProducto(String codigo){
        Producto p = encontrarProcuto(codigo);
        if (p != null){
            return productos.remove(p);
        }

        return false;
    }

    public boolean borrarProductosCategoria(String categoria){
        boolean productoEncotrado = false;
        for (Producto p : productos) {
            if (p.getCategoria().equalsIgnoreCase(categoria)){
                borrarProducto(p.getCodigo());
                productoEncotrado = true;
            }
        }

        return productoEncotrado;
    }

    public HashMap<String, Integer> existenciasProductos(){
        HashMap<String, Integer> lista = new HashMap<>();
        for (Producto p: productos) {
            lista.put(p.getCodigo(), p.getStock());
        }

        return lista;
    }

    public HashMap<String, Set<Producto>> productosPorCategoria(){
        HashMap<String, Set<Producto>> lista = new HashMap<>();
        for (Producto p: productos) {
            Set<Producto> productos1 = lista.get(p.getCategoria());
            if (productos1 == null){
                productos1 = new HashSet<>();
            }
            productos1.add(p);
            lista.put(p.getCategoria(), productos1);
        }

        return lista;
    }

    public Venta generarVenta(String dni, HashMap<String, Integer> productosVenta){
        boolean stockSuficiente = true;
        Set<String> codigos = productosVenta.keySet();
        for (String c: codigos) {
            Producto p = encontrarProcuto(c);
            if (p.getStock() - productosVenta.get(c) < 0){
                stockSuficiente = false;
            }
        }

        if (stockSuficiente){
           Venta venta = new Venta(dni);
            for (String c: codigos) {
                venta.anadirProducto(c, encontrarProcuto(c).getStock());
                modificarExistencias(c,productosVenta.get(c) * -1);
            }
            monstrarVenta(venta);
            return venta;
        }

        return null;
    }

    public void monstrarProductos(){
        HashMap<String, Set<Producto>> productos = productosPorCategoria();
        Set<String> categorias = productos.keySet();
        for (String c: categorias) {
            for (Producto p: productos.get(c)) {
                System.out.println(p);
            }
        }
    }

    public void monstrarVenta(Venta venta){
        HashMap<String, Integer> productos = venta.getProductos();
        Set<String> codigos = productos.keySet();
        for (String c: codigos) {
            System.out.println(encontrarProcuto(c));
            System.out.println("Cantidad: " + productos.get(c));
        }
        System.out.println(venta.getImporteTotal());
    }

    public static double getCosteProducto(String codigo){
        Producto p = encontrarProcuto(codigo);
        if (p != null){
            return p.getPrecio();
        }
        return -1;
    }

    private static Producto encontrarProcuto(String codigo){
        for (Producto p: productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)){
                return p;
            }
        }
        return null;
    }
}
