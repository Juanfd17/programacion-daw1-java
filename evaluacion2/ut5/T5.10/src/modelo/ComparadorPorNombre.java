package modelo;

import java.util.Comparator;



public class ComparadorPorNombre implements Comparator<Persona> {
    public int compare(Persona persona, Persona persona2) {
        return CharSequence.compare(persona.getNombre(), persona2.getNombre());
    }
}
