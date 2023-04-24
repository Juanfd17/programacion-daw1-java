package modelo;

public class Planta implements Animable {

	private int edad;
	private Ubicacion ubicacion;

	public Planta(int f, int c) {
		ubicacion = new Ubicacion(f,c);
		edad = 0;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public void accion() {
		//TODO avanzar edad
		int[] alrededor = Ecosistema.alrededor(ubicacion.getFila(), ubicacion.getColumna());

		int planta = -1;
		for (int i = 0; i < alrededor.length; i++) {
			if (alrededor[i] == 2){
				int[] pr = posicionRelativa(i);
				Planta planta1 = (Planta) Ecosistema.getAnimable(pr[0], pr[1]);
				if (planta1.getEdad() > 2 && edad > 2) {
					planta = i;
				}
			}
		}

		if (planta != -1){
			int libre = -1;
			for (int i = 0; i < alrededor.length; i++) {
				if (alrededor[i] == 0){
					libre = i;
				}
			}

			if (libre != -1){
				int[] p = posicionRelativa(libre);
				Ecosistema.anadeAnimales(p[0], p[1], new Planta(p[0], p[1]));
			}
		}

		edad++;
		if (edad >= 7){
			muere();
		}
	}

	private void muere(){
		Ecosistema.muerte(ubicacion.getFila(), ubicacion.getColumna());
	}

	private int[] posicionRelativa(int posicion){
		int[] p;
		if (posicion == 0){
			p = new int[]{ubicacion.getFila() - 1, ubicacion.getColumna()};
		} else if (posicion == 1){
			p = new int[]{ubicacion.getFila(), ubicacion.getColumna() + 1};
		} else if (posicion == 2){
			p = new int[]{ubicacion.getFila() + 1, ubicacion.getColumna()};
		} else {
			p = new int[]{ubicacion.getFila(), ubicacion.getColumna() - 1};
		}

		return p;
	}
}
