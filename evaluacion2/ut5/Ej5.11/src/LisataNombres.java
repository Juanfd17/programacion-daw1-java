import java.util.Arrays;

public class LisataNombres {
    String[] lista;
    int pos;

    public LisataNombres() {
        this.lista = new String[10];
        this.pos = 0;
    }

    public boolean listaVacia(){
        return pos == 0;
    }

    public boolean listaLlena(){
        return pos == lista.length;
    }

    public boolean insertarNombre(String nombre){
        if (!estaNombre(nombre) && !listaLlena()){
            int sitio = buscarSitio(nombre);
            hacerSitio(sitio);
            lista[sitio] = nombre;
            pos++;
            return true;
        } else {
            return false;
        }
    }

    private boolean estaNombre(String nombre){
        int medioN = pos/2;
        String medio = lista[medioN];

        if (medio != null && compararNombres(nombre,medio)){
            for (int i = medioN; i < pos; i++) {
                if (lista[i].equals(nombre)){
                    return true;
                }
            }
        } else {
            for (int i = medioN; i > 0; i--) {
                if (lista[i].equals(nombre)){
                    return true;
                }
            }
        }

        return false;
    }

    private void hacerSitio(int posicion){
        for (int i = pos; i > posicion; i--) {
            lista[i] = lista[i - 1];
        }
    }

    private int buscarSitio(String nombre){
        for (int i = 0; i < pos; i++) {
            if (compararNombres(nombre,lista[i])){
                return i;
            }
        }

        return pos;
    }

    private boolean compararNombres(String nom1, String nom2){
        return nom2.compareTo(nom1) >= 0;
    }

    public String nombreMasLargo(){
        int largo = -1;
        int posicion = -1;

        for (int i = 0; i < pos; i++) {
            if (lista[i].length() > largo){
                largo = lista[i].length();
                posicion = i;
            }
        }

        if (posicion == -1){
            return null;
        } else {
            return lista[posicion];
        }
    }

    public void borrarLetra(char letra){
        for (int i = 0; i < pos; i++) {
            if (lista[i].indexOf(letra) == 0){
                borrarDePosicion(0, i);
            }
        }
    }

    private void borrarDePosicion(int posicion, int palabra){
        lista[palabra] = lista[palabra].substring(posicion +1);
    }

    public int empiezaPor(String inicio){
        int contador = 0;
        for (int i = 0; i < pos; i++) {
            if (lista[i].length() >= inicio.length()){
                String inicioPalabra = lista[i].substring(0, inicio.length());
                if (inicioPalabra.equalsIgnoreCase(inicio)){
                    contador ++;
                }
            }

        }
        return contador;
    }

    public String[] empiezanPorLetra(char letra){
        String[] palabras = new String[lista.length];
        int contador = 0;
        for (int i = 0; i < pos; i++) {
            String empieza = lista[i].substring(0, 1);
            if (empieza.equalsIgnoreCase(String.valueOf(letra))){
                palabras[contador] = lista[i];
                contador ++;
            }
        }

        return palabras;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pos; i++) {
            sb.append(lista[i]).append("\n");
        }
        return sb.toString();
    }
}
