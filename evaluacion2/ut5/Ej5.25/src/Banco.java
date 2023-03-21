import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Banco {
    private HashMap<String, Cuenta> cuentasBancarias;

    public Banco() {
        this.cuentasBancarias = new HashMap<String, Cuenta>();
    }

    public void addCuenta(String nombre, int numCuenta, int balance){
        cuentasBancarias.put(nombre, new Cuenta(balance, numCuenta));
    }

    public Cuenta getCuenta(String nombre){
        return cuentasBancarias.get(nombre);
    }

    public void listarClientes(){
        Set<String> identificadores = cuentasBancarias.keySet();
        for (String id:identificadores) {
            System.out.println(id);
        }
    }
}
