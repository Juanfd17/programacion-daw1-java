package app;

import java.beans.Introspector;
import java.util.*;

import exceptions.NumeroPersonasInvalido;
import modelo.ComparadorPorApellido;
import modelo.ComparadorPorNombre;
import modelo.Persona;
import util.GeneradorPersonas;

public class Main {

	static List<Persona> personas = new ArrayList<Persona>();

	public static void main(String[] args) {
		generarPersonas(-10);
		mostrarPersonas(personas);
		personasPorNombre();
		repeticionApellidos();
		mostrarMapaSimple(repeticionApellidos());
		personasPorRangoEdad();
		mostrarMapaConLista(personasPorRangoEdad());
		borrarPorEdad(30, 90);
	}

	/**
	 * Genera un listado de personas con nombres y apellidos aleatorios y lo asigna
	 * al atributo personas
	 *
	 * @param nPersonas personas que se quieren generar
	 */
	private static void generarPersonas(int nPersonas) {
		try {
			personas = GeneradorPersonas.genera(nPersonas);
		} catch (NumeroPersonasInvalido e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Muestra por pantalla el listado de personas recibido por parámetro con el
	 * siguiente formato: Apellido1 Apellido2, Nombre
	 */
	private static void mostrarPersonas(List<Persona> personas) {
		for (Persona p: personas) {
			System.out.println(p.toString());
		}
	}

	/**
	 * Devuelve un listado de personas ordenado alfabéticamente por nombre sin
	 * modificar el listado original
	 *
	 * @return listado ordenado
	 */
	private static List<Persona> personasPorNombre() {
		List<Persona> personasOrdenadas = personas;
		personasOrdenadas.sort(new ComparadorPorNombre());
		return personasOrdenadas;
	}

	/**
	 * Devuelve un listado de personas ordenado alfabéticamente por apellidos sin
	 * modificar el listado original
	 *
	 * @return listado ordenado
	 */
	private static List<Persona> personasPorApellidos() {
		List<Persona> personasOrdenadas = personas;
		personasOrdenadas.sort(new ComparadorPorApellido());
		return personasOrdenadas;
	}

	/**
	 * Devuelve un mapa en el que cada apellido que aparece al menos una vez en el
	 * listado de personas, es clave del mapa, y el valor el número de veces que
	 * aparece (se cuentan tanto primeros como segundos apellidos)
	 * (OPCIONAL: Devolver mapa ordenador de mayor a menor por los valores)
	 * @return mapa
	 */
	private static Map<String, Integer> repeticionApellidos() {
		Map<String, Integer> apellidos = new HashMap<>();
		for (Persona p: personas) {
			StringTokenizer apellidosPersona = new StringTokenizer(p.getApellidos(), " ");
			String apellido1 = apellidosPersona.nextToken();
			String apellido2 = apellidosPersona.nextToken();

			if (apellidos.get(apellido1) == null){
				apellidos.put(apellido1, 1);
			} else {
				apellidos.put(apellido1, apellidos.get(apellido1) +1);
			}

			if (apellidos.get(apellido2) == null){
				apellidos.put(apellido2, 1);
			} else {
				apellidos.put(apellido2, apellidos.get(apellido2) +1);
			}
		}

		return apellidos;
	}

	/**
	 * Muestra por pantalla el mapa recibido como parámetro con el siguiente
	 * formato: Álvarez -> 5
	 *
	 * @param mapa
	 */
	private static void mostrarMapaSimple(Map<String, Integer> mapa) {
		Set<String> claves = mapa.keySet();

		for (String a: claves) {
			System.out.println(a + " -> " + mapa.get(a));
		}
	}

	/**
	 * Devuelve un mapa en el que las claves son rangos de edad por decenas y los
	 * valores el listado de personas que están en ese rango de eda(18-19, 20-29,
	 * 30-39...). Sólo aparecerán aquellos rangos en los que haya al menos una
	 * persona.
	 *
	 * @return
	 */
	private static Map<String, List<Persona>> personasPorRangoEdad() {
		Map<String, List<Persona>> edades = new HashMap<>();
		for (Persona p: personas) {
			Integer edadN = p.getEdad() / 10;

			String edad = edadN + "0-" + edadN + "9";

			List<Persona> lista;

			if (edades.get(edad) == null){
				lista = new ArrayList<>();
			} else {
				lista = edades.get(edad);
			}

			lista.add(p);
			edades.put(edad, lista);
		}

		return edades;
	}

	/**
	 * Muestra por pantalla el mapa recibido como parámetro con el siguiente
	 * formato: 18-19 -> [García Sánchez, Ana - Álvarez Castro, Luis] 20-29 ->
	 * [García López, Luis - Suárez Rodríguez, Sara]
	 *
	 * @param mapa
	 */
	private static void mostrarMapaConLista(Map<String, List<Persona>> mapa) {
		Set<String> edades = mapa.keySet();

		for (String e: edades) {
			StringBuilder sb = new StringBuilder(e).append(" -> [");

			List<Persona> personasLista = mapa.get(e);

			for (Persona p: personasLista) {
				sb.append(p);
			}

			sb.append("]");
			System.out.println(sb.toString());
		}
	}

	/**
	 * Borra del listado las personas en el rango de edad especificado.
	 *
	 * @param min
	 * @param max
	 * @return número de personas borradas
	 */
	private static int borrarPorEdad(int min, int max) {
		int c = 0;
		List<Persona> personasCopia = new ArrayList<>();
		for (Persona p: personas) {
			if (!(p.getEdad() > min && p.getEdad() < max)){
				personasCopia.add(p);
				c++;
			}
		}

		personas = personasCopia;
		return c;
	}
}