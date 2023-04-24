import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>(GeneradorPersonas.genera(10));
        Set<Persona> personasSinDuplicados = new TreeSet<>();
        Set<Persona> personasAbz = new TreeSet<>(new ComparadorPersonasApellidos());
        Set<Persona> orderNombre = new TreeSet<>(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });

        for (Persona p: personas) {
            personasAbz.add(p);
            orderNombre.add(p);
        }

        Persona p1 = new Persona("Nombre1", "Apellido1", 20);
        Persona p2 = new Persona("Nombre1", "Apellido1", 20);
        Persona p3 = new Persona("Nombre2", "Apellido2", 25);
        Persona p4 = new Persona("Bac", "Apellido3", 22);
        Persona p5 = new Persona("Abc", "Apellido4", 22);
        Persona p6 = new Persona("Nombre5", "Apellido5", 28);
        Persona p7 = new Persona("Nombre6", "Apellido6", 29);
        Persona p8 = new Persona("Nombre7", "Apellido7", 30);

        p1.equals(p2);

        personasSinDuplicados.add(p1);
        personasSinDuplicados.add(p2);
        personasSinDuplicados.add(p3);
        personasSinDuplicados.add(p4);
        personasSinDuplicados.add(p5);
        personasSinDuplicados.add(p6);
        personasSinDuplicados.add(p7);
        personasSinDuplicados.add(p8);

        System.out.println(personasSinDuplicados);
        System.out.println("----------------------");
        System.out.println(personasAbz);
        System.out.println("----------------------");
        System.out.println(orderNombre);





        Map<Escuderia, Set<Piloto>> escuderias = new HashMap<>();
        Set<Piloto> pilotosAston = new HashSet<>();
        pilotosAston.add(new Piloto("Fernando", "Alonso", 40));
        pilotosAston.add(new Piloto("Lawrence", "Stroll", 31));
        escuderias.put(new Escuderia("Aston Martin"), pilotosAston);

        Set<Piloto> pilotosFerrari = new HashSet<>();
        pilotosFerrari.add(new Piloto("Charles", "Lecrerc", 28));
        pilotosFerrari.add(new Piloto("Carlos", "Barrichelo jr", 29));
        escuderias.put(new Escuderia("Ferrari"), pilotosFerrari);

        imprimirMapa(escuderias);
    }

    public static void imprimirMapa(Map<Escuderia, Set<Piloto>> mapa){
        Set<Escuderia> escuderias = mapa.keySet();
        for (Escuderia e: escuderias) {
            Set<Piloto> pilotos = mapa.get(e);
            System.out.println(e + ":");
            for (Piloto p: pilotos) {
                System.out.println(p);
            }
            System.out.println("");
        }
    }
}
