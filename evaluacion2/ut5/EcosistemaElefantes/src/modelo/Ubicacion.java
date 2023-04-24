package modelo;

import java.util.List;

public class Ubicacion {
	private int fila;
	private int columna;

	public Ubicacion(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public List<Ubicacion> adyacentes(int maxFilas, int maxColumnas) {
		// TODO
		return null;
	}

}
