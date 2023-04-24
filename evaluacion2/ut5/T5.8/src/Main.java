import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Aplicacion a = new Aplicacion();
        HashMap<String, Integer> productos = new HashMap<String, Integer>();
        for (int i = 1; i < 10; i++) {
            Producto p = new Producto("c" + i, "Nombre" + i, "Categoria" + ((i+1) / 2), 100 + i, 10 +i);
            a.anadirProducto(p);
            productos.put(p.getCodigo(), 1);
        }

        a.generarVenta("1", productos);

    }
}