import java.util.ArrayList;
import java.util.List;

public class GeneradorPersonas {

    private static final String[] NOMBRES = { "Hugo", "Emma", "Carmen", "Daniel", "Sofía", "Alejandro", "Leo", "Julia", "Aitana", "Jorge" };
    private static final String[] APELLIDOS = { "Álvarez", "Gallego", "Muñoz", "Tudela", "Sánchez", "Busquets", "Rojas", "Castillo", "Martín", "Alba", "Roberto", "Arrizabalaga", "Cruz", "Barroso", "Gil", "Blanco", "Romero", "Moro" };
    private static final int MIN_EDAD = 18;
    private static final int MAX_EDAD = 110;

    /**
     * Genera un listado aleatorio de personas, sin repetir nombres pero sin ninguna
     * limitación respecto a los apellidos. Se les asigna una edad aleatoria entre
     * los dos valores límite. Si se solicita un número de personas superior al
     * número de nombres disponibles, sí que se podrán repetir nombres .
     *
     * @param nPersonas
     * @return
     */
    public static final List<Persona> genera(int nPersonas) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        ArrayList<String> nombres = new ArrayList<String>();

        for (int i = 0; i < nPersonas; i++) {

            if (nombres.isEmpty()){
                for (int j = 0; j < NOMBRES.length; j++) {
                    nombres.add(NOMBRES[j]);
                }
            }

            String nombre = nombres.get((int) (Math.random() * nombres.size()));
            nombres.remove(nombre);



            String apllidos = APELLIDOS[(int) (Math.random() * APELLIDOS.length)];
            apllidos += " " + APELLIDOS[(int) (Math.random() * APELLIDOS.length)];
            int edad = (int) (Math.random() * MAX_EDAD) + MIN_EDAD;
            personas.add(new Persona(nombre, apllidos, edad));
        }
        return personas;
    }

}

