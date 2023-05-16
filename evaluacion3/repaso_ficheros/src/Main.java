import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static String DELIMITADOR = ",";
    public static void main(String[] args) {
        Map<String, Set<Premio>> actrices = leerFichero(0);
        imprimir(actrices);
        html(actrices);
    }

    public static Map<String, Set<Premio>> leerFichero(int edadMinima){
        Scanner sc = new Scanner(Main.class.getResourceAsStream("oscar_age_female.csv"));
        String linea = sc.nextLine();

        Map<String, Set<Premio>> actrices = new TreeMap<>();

        while (sc.hasNextLine()) {
            linea = sc.nextLine();
            String[] datos = linea.split(DELIMITADOR);

            String nombre = datos[3].trim().substring(1, datos[3].length() -2);
            Set<Premio> premios;

            if (actrices.containsKey(nombre)){
                premios = actrices.get(nombre);
            } else {
                premios = new TreeSet<>();
            }

            Premio premio = new Premio(
                    Integer.parseInt(datos[1].trim()),
                    datos[4].trim().substring(1, datos[4].length() -2),
                    Integer.parseInt(datos[2].trim())
            );
            if (premio.getEdad() >= edadMinima){
                premios.add(premio);
            }

            if (premios.size() > 0){
                actrices.put(nombre, premios);
            }
        }
        sc.close();

        return actrices;
    }

    public static void imprimir(Map<String, Set<Premio>> map){
        Set<Actric> actrices = new TreeSet<>();

        Set<String> nombres = map.keySet();
        for (String nombre: nombres) {
            Actric actric = new Actric(nombre);
            actric.setPremios(map.get(nombre));

            actrices.add(actric);
        }

        for (Actric actric:actrices) {
            System.out.println(actric.toString(false));
        }
    }

    public static void html(Map<String, Set<Premio>> map){

        PrintWriter fichero = null;
        try{
            fichero = new PrintWriter(new BufferedWriter(new FileWriter("premios.html")));
            fichero.println("<html>");
            fichero.println("<body>");

            for (String nombre: map.keySet()) {
                fichero.println("<ul>" + nombre);
                for (Premio premio: map.get(nombre)) {
                    fichero.println("<li>" + premio.toString(true) + "</li>");
                }
                fichero.println("</ul>");
            }

            fichero.println("</body>");
            fichero.println("</html>");
            fichero.close();
        } catch (IOException e) {
            System.out.println("Error al crear el index.html");
        }
    }
}