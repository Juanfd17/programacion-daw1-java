package modelo;

import java.util.Comparator;



public class ComparadorPorApellido implements Comparator<Persona> {
    public int compare(Persona persona, Persona persona2) {
        return CharSequence.compare(persona.getApellidos(), persona2.getApellidos());
    }
}