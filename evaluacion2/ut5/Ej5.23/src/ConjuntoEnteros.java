import java.util.HashSet;
import java.util.Iterator;

public class ConjuntoEnteros {
    private HashSet<Integer> has;

    public ConjuntoEnteros(int tamano) {
        this.has = new HashSet<>(tamano);
        for (int i = 1; i <= tamano; i++) {
            has.add(i);
        }
    }

    public HashSet<Integer> getPares(){
        HashSet<Integer> pares = new HashSet<>();
        Iterator<Integer> it = has.iterator();
        while (it.hasNext()){
            int numero = it.next().intValue();
            if (par(numero)){
                pares.add(numero);
            }
        }

        return pares;
    }

    public void addNumero(int n){
        has.add(n);
    }

    public void printConjunto(){
        for (Integer i: has) {
            System.out.println(i.intValue() +", ");
        }
    }

    public void borrarPares(){
        Iterator<Integer> it = has.iterator();
        while (it.hasNext()){
            if (par(it.next().intValue())){
                it.remove();
            }
        }
    }

    private boolean par(int n){
        return n % 2 == 0;
    }
}