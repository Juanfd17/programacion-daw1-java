package modelo;

public class Main {

	public static void main(String[] args) {
		Ecosistema ecosistema = new Ecosistema();
		ecosistema.mostrarEscenario();
		for (int i = 0; i < 15; i++) {
			ecosistema.avanzarAnio();
			ecosistema.mostrarEscenario();
		}

		ecosistema.elefantesPorEdad();
	}
}
