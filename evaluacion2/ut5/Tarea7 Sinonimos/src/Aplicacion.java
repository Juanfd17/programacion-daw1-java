import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Aplicacion {
    private HashMap<String, HashSet<String>> diccionario;

    public Aplicacion() {
        this.diccionario = new HashMap<>();
    }

    public void anadirSinonimo(String palabra, String sinonimo){
        HashSet<String> sinonimos = diccionario.get(palabra);

        if (sinonimos == null){
            sinonimos = new HashSet<>();
        }

        sinonimos.add(sinonimo);

        diccionario.put(palabra, sinonimos);
    }

    public boolean borrarSinonimo(String palabra, String sinonimo){
        HashSet<String> sinonimos = diccionario.get(palabra);

        if (sinonimos == null){
            return false;
        }

        if (sinonimos.remove(sinonimo)){
            diccionario.put(palabra, sinonimos);
            return true;
        }
        return false;
    }

    public HashSet<String> obtenerSinonimos(String palabra){
        return diccionario.get(palabra);
    }

    public void anadirDiccionario(HashMap<String, HashSet<String>> diccionario){
        Set<String> palabras = diccionario.keySet();
        for (String p: palabras) {
            HashSet<String> sinonimos = diccionario.get(p);
            this.diccionario.put(p, sinonimos);
        }
    }

    public void imprimirDiccionario(){
        Set<String> palabras = diccionario.keySet();
        for (String p: palabras) {
            System.out.println(p);
            HashSet<String> sinonimos = obtenerSinonimos(p);
            for (String s: sinonimos) {
                System.out.println("\t" + s);
            }
        }
    }

    public HashMap<String, HashSet<String>> getDiccionario() {
        return diccionario;
    }
}