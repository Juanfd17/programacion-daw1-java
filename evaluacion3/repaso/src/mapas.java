import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapas {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>(); // oredena por has
        Map<String, Integer> mapa2 = new LinkedHashMap<>(); // mantiene el orden de insercion
        Map<String, Integer> mapa3 = new TreeMap<>(); // puede tener un orden
    }
}
