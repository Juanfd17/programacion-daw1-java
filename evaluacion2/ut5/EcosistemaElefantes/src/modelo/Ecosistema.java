package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class Ecosistema {

	int FILAS = 10;
	int COLUMNAS = 30;

	private static Animable escenario[][];
	private int anio;

	public Ecosistema() {
		// TODO generar escenario con animales aleatorios
		generarEscenario();
	}

	private void generarEscenario(){
		escenario = new Animable[FILAS][COLUMNAS];
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				int numero = (int) (Math.random() * 11);
				if (numero <= 1){
					escenario[i][j] = new Elefante(i, j);
				} else if (numero <= 3){
					escenario[i][j] = new Planta(i, j);
				}
			}
		}
	}

	public Ecosistema(Animable escenario[][]) {
		this.escenario = escenario;
		anio = 0;
	}

	public static void anadeAnimales(int f, int c, Animable animable) {
		escenario[f][c] = animable;
	}

	public void mostrarEscenario() {
		System.out.println("AÑO: " + anio);
		for (int i = 0; i < escenario.length; i++) {
			for (int j = 0; j < escenario[i].length; j++) {
				if (escenario[i][j] instanceof Elefante){
					System.out.print("E ");
				} else if (escenario[i][j] instanceof Planta) {
					System.out.print("P ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void avanzarAnio() {
		for (int i = 0; i < escenario.length; i++) {
			for (int j = 0; j < escenario[i].length; j++) {
				if (escenario[i][j] != null){
					escenario[i][j].accion();
				}
			}
		}

		anio++;
	}

	/**
	 * Método que devuelve un mapa en el que las claves son los enteros del 0 al 6 y
	 * los valores el número de elefantes de esa edad que hay en el ecosistema
	 *
	 * @return el mapa
	 */
	public Map<Integer, Integer> elefantesPorEdad() {
		ArrayList<Elefante> elefantes = new ArrayList<Elefante>();

		for (int i = 0; i < escenario.length; i++) {
			for (int j = 0; j < escenario[i].length; j++) {
				if (escenario[i][j] instanceof Elefante){
					elefantes.add((Elefante) escenario[i][j]);
				}
			}
		}

		Collections.sort(elefantes, new ComparadorPorEdad());
		return null;
	}

	public static void muerte(int fila, int columna){
		escenario[fila][columna] = null;
	}

	public static int[] alrededor(int fila, int columna){
		int[] alrededor = new int[4];
		alrededor[0] = animalOPlanta(fila-1 ,columna);
		alrededor[1] = animalOPlanta(fila, columna +1);
		alrededor[2] = animalOPlanta(fila+1, columna);
		alrededor[3] = animalOPlanta(fila, columna-1);

		return alrededor;
	}

	public static void mover(int f1, int c1, int f2, int c2){
		escenario[f2][c2] = escenario[f1][c1];
		escenario[f1][c1] = null;
	}

	public static boolean sexoOpuesto(Sexo sexo, Sexo sexo2){
		if (!sexo.equals(sexo2)){
			return true;
		}

		return false;
	}

	public static Animable getAnimable(int f, int c){
		return escenario[f][c];
	}

	private static int animalOPlanta(int fila, int columna){
		if (fila >= 0 && columna >= 0 && fila < 10 && columna < 30) {
			if (escenario[fila][columna] instanceof Elefante) {
				return 1;
			} else if (escenario[fila][columna] instanceof Planta) {
				return 2;
			} else {
				return 0;
			}
		}
		return -1;
	}
}