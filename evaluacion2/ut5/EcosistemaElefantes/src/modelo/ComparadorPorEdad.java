package modelo;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Elefante> {
    public int compare(Elefante elefante1, Elefante elefante2) {
        return Integer.compare(elefante1.getEdad(), elefante2.getEdad());
    }
}

// luego, en el código que ordena el ArrayList:
