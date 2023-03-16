import java.util.ArrayList;

public class Club {
    private ArrayList<Miembro> listaMiembros;

    public Club(ArrayList<Miembro> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    public void aniadir(Miembro miembro){
        listaMiembros.add(miembro);
    }

    public int incorporacionEnMes(int mes){
        if (mes > 0 && mes < 13) {
            int c = 0;
            for (Miembro m : listaMiembros) {
                if (m.getMes() == mes) {
                    c++;
                }
            }

            return c;
        } else {
            System.out.println("El mes deve estar entre 1 y 12");
            return -1;
        }
    }

    public ArrayList<Miembro> borrar (int mes, int anio){
            ArrayList<Miembro> lista2 = new ArrayList<>();
        if (mes > 0 && mes < 13) {
            for (int i = 0; i < listaMiembros.size(); i++) {
                if (listaMiembros.get(i).getMes() == mes && listaMiembros.get(i).getAnio() == anio){
                    lista2.add(listaMiembros.get(i));
                    listaMiembros.remove(i);
                    i--;
                }
            }

        } else {
            System.out.println("El mes deve estar entre 1 y 12");
        }
            return lista2;
    }

    public void listarClub(){
        for (Miembro m:listaMiembros) {
            System.out.println(m);
        }
    }
}
