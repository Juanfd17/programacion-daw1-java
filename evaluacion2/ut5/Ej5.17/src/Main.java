import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Miembro> miembros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            miembros.add(new Miembro("Miembro" + i, i,2020 + i));
        }
        Club c = new Club(miembros);
        c.listarClub();
        c.borrar(1,2021);
        System.out.println("Borrado");
        c.listarClub();
    }
}