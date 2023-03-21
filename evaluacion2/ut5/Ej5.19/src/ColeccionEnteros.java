import java.util.ArrayList;
import java.util.Iterator;

public class ColeccionEnteros {
    private ArrayList<Integer> miLista;
    public ColeccionEnteros(){
        miLista = new ArrayList<>();
        inicializarColeccion();
    }

    private void inicializarColeccion(){
        int numero = (int) (Math.random() * 20) + 1;
        int contador = 1;
        while (numero != 0 && contador <= 20){
            miLista.add(numero);
            contador++;
            numero = (int) (Math.random() * 20);
        }
    }
    public int sumar(){
        int suma = 0;
        for (Integer i: miLista) {
            suma += i;
        }

        return suma;
    }

    public int sumar2(){
        int suma = 0;
        Iterator<Integer> it = miLista.iterator();
        while (it.hasNext()){
            suma+= it.next();
        }

        return suma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lista\n");
        for (int i = 0; i < miLista.size()-1; i++) {
            sb.append(miLista.get(i)).append(", ");
        }

        sb.append(miLista.get(miLista.size()-1)).append(".");
        return sb.toString();
    }
}