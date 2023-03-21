import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(18);
        Estudiante estudiante2 = new Estudiante(19);
        Estudiante estudiante3 = new Estudiante(17);
        Estudiante estudiante4 = new Estudiante(16);
        Estudiante estudiante5 = new Estudiante(20);
        Estudiante estudiante6 = new Estudiante(15);
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);
        listaEstudiantes.add(estudiante4);
        listaEstudiantes.add(estudiante5);
        listaEstudiantes.add(estudiante6);

        for (Estudiante e: listaEstudiantes) {
            System.out.println(e);
        }

        /*int c = 0;
        while (c < listaEstudiantes.size()){
            if (listaEstudiantes.get(c).getEdad() < 18){
                listaEstudiantes.remove(c);
                c--;
            }

            c++;
        }*/

        /*for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getEdad() < 18){
                listaEstudiantes.remove(i);
                i--;
            }
        }*/

        Iterator<Estudiante> iterador = listaEstudiantes.iterator();
        while (iterador.hasNext()) {
            if (iterador.next().getEdad() < 18) {
                iterador.remove();
            }
        }

        System.out.println("---------------------------------");
        for (Estudiante e: listaEstudiantes) {
            System.out.println(e);
        }
    }
}