import java.util.Arrays;

public class Academia {
    Cursos[] cursos;
    int contador;

    public Academia(int nCursos) {
        this.cursos = new Cursos[nCursos];
        this.contador = 0;
    }

    //Dice que curso tiene mas horas
    public boolean compararCursos(Cursos cursos, Cursos cursos1) {
        return cursos.equals(cursos1);
    }

    //añade el curso al array
    public boolean anadirCurso(Cursos curso) {
        if (contador < cursos.length) {
            if (!cursoRepetido(curso)) {
                cursos[contador] = curso;
                contador++;
                return true;
            }
        }

        return false;
    }

    private boolean cursoRepetido(Cursos curso) {
        boolean repetido = false;
        for (Cursos cusos : cursos) {
            if (curso.equals(cusos)) {
                repetido = true;
            }
        }

        return repetido;
    }

    //borra el curso y quita el null del medio
    public boolean borrarCurso(Cursos curso) {
        for (int i = 0; i < contador; i++) {
            if (cursos[i].equals(curso)) {
                cursos[i] = null;
                for (int j = i; j < contador - 1; j++) {
                    cursos[j] = cursos[j + 1];
                }
                cursos[contador - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }

    //imprime por pantalla todos los cursos
    public void monstrarCursos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(cursos[i]);
        }
    }

    //devueleve un array solo con los cursos que son de tipo teorico y son oficiales
    public Teoricos[] cursosOficiales() {
        Teoricos[] teoricos = new Teoricos[cursos.length];
        int contadorT = 0;
        for (int i = 0; i < contador; i++) {
            if (cursos[i] instanceof Teoricos && ((Teoricos) cursos[i]).oficial) {
                teoricos[contadorT] = (Teoricos) cursos[i];
                contadorT++;
            }
        }

        return teoricos;
    }

    //debuelve un array con los cursos ordenados por horas sin cambiar el original
    public Cursos[] cursosPorHoras() {
        Cursos[] cursosh = new Cursos[cursos.length];
        ComparadorCursosHoras comparadorCursosHoras = new ComparadorCursosHoras();
        int contador2 = 0;
        for (int i = 0; i < contador; i++) {
            cursosh[i] = cursos[i];
        }

        Arrays.sort(cursosh, comparadorCursosHoras);
        return cursosh;
    }

    //debuelve un array de 2 posiciones con el curso mas largo y el mas corto
    public Cursos[] cursoMasLargoYMasCorto() {
        Cursos[] cursosh = cursosPorHoras();
        Cursos[] cursosLC = new Cursos[2];

        cursosLC[0] = cursosh[0];
        cursosLC[1] = cursosh[contador - 1];

        return cursosLC;
    }

    //debuelve un array con los curos que cuestan menos de la media la media mirando el precion subcencionado
    public Cursos[] cursosBaratos() {
        Cursos[] cursosB = new Cursos[cursos.length];
        int contador2 = 0;
        double media = media();
        for (Cursos c : cursos) {
            if (c != null) {
                if (c instanceof Subvencionales && ((Subvencionales) c).getPrecioSubvencionado() < media) {
                    cursosB[contador2] = c;
                    contador2++;
                } else if (c.getPrecio() <= media) {
                    cursosB[contador2] = c;
                    contador2++;
                }
            }
        }
        return cursosB;
    }

    //devuelve un array de String con los nobres de los curos que son mas baratos de la media
    public String[] cursosBaratosA() {
        String[] cursosB = new String[cursos.length];
        int contador2 = 0;
        double media = media();
        for (Cursos c : cursos) {
            if (c != null) {
                if ((c instanceof Subvencionales && ((Subvencionales) c).getPrecioSubvencionado() < media) || c.getPrecio() < media) {
                    cursosB[contador2] = c.getNombre();
                    contador2++;
                }
            }
        }
        return cursosB;
    }

    public String cursosBaratosB() {
        final StringBuilder sb = new StringBuilder();
        double media = media();
        for (Cursos c : cursos) {
            if (c != null) {
                if ((c instanceof Subvencionales && ((Subvencionales) c).getPrecioSubvencionado() < media) || c.getPrecio() < media) {
                    sb.append(c.getNombre()).append("\n");
                }
            }
        }
        return sb.toString();
    }

    //calcula la media sin tener encuenta el precio subvenciaonado
    private double media() {
        double suma = 0;

        for (Cursos c : cursos) {
            if (c != null) {
                suma += c.getPrecio();
            }
        }
        return suma / contador;
    }
}
