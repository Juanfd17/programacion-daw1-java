import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ListinTelefonico {
    HashMap<String, String> listin;

    public ListinTelefonico() {
        this.listin = new HashMap<String, String>();
    }

    public void introducirNumero(String nombre, String numero){
        listin.put(nombre, numero);
    }

    public String buscarNumero(String nombre){
        return listin.get(nombre);
    }

    public void escribirListin(){
        Set<String> identificadores = listin.keySet();
        for (String id:identificadores) {
            System.out.println(id + " " + buscarNumero(id));
        }
    }
}
