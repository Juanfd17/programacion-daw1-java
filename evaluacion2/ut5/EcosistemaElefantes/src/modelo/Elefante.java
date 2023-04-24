package modelo;

public class Elefante implements Animable  {

	private int edad;
	private int nivelHambre;
	private Sexo sexo;
	private Ubicacion ubicacion;

	public Elefante(int f, int c) {
		ubicacion = new Ubicacion(f,c);
		edad = 0;
		nivelHambre = 0;
		int numero = (int) (Math.random() * 2);
		if (numero == 1){
			sexo = Sexo.H;
		} else{
			sexo = Sexo.M;
		}
	}

	public Sexo getSexo() {
		return sexo;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public void accion() {
		//TODO avanzar edad
		int numeroMovimiento = 0;

		while (numeroMovimiento < 3){
			int[] alrededor = Ecosistema.alrededor(ubicacion.getFila(), ubicacion.getColumna());
			int buscar = 0;

			if (numeroMovimiento == 0) {
				buscar = 2;
			}
			if (numeroMovimiento == 1){
				buscar = 1;
			} else {
				buscar = 0;
			}

			int movimiento = -1;
			if (numeroMovimiento != 1) {
				for (int i = 0; i < alrededor.length; i++) {
					if (alrededor[i] == buscar) {
						movimiento = i;
					}
				}
			}

			if (numeroMovimiento == 1){
				for (int i = 0; i < alrededor.length; i++) {
					if (alrededor[i] == 1){
						int[] p = posicionRelativa(i);
						Elefante elefante = (Elefante) Ecosistema.getAnimable(p[0], p[1]);
						if (Ecosistema.sexoOpuesto(getSexo(), elefante.getSexo()) && edad > 3 && elefante.getEdad() > 3){
							movimiento = i;
						}
					}
				}
			}

			if (movimiento != -1 && numeroMovimiento != 1){
				movimiento(movimiento);
				if (numeroMovimiento == 0){
					nivelHambre = 0;
				}
			}

			if (movimiento != -1 && numeroMovimiento == 1){
				int sitioLibre = -1;
				for (int i = 0; i < alrededor.length; i++) {
					if (alrededor[i] == 0){
						sitioLibre = i;
					}
				}

				if (sitioLibre != -1){
					int[] posicion = posicionRelativa(sitioLibre);
					Ecosistema.anadeAnimales(posicion[0], posicion[1], new Elefante(posicion[0], posicion[1]));
				}
			}

			numeroMovimiento++;
		}

		edad++;
		nivelHambre++;
		if (edad >= 6 || nivelHambre >= 4){
			muere();
		}
	}

	private void muere(){
		Ecosistema.muerte(ubicacion.getFila(), ubicacion.getColumna());
	}

	private void movimiento(int movimiento){
		if (movimiento == 0) {
			Ecosistema.mover(ubicacion.getFila(), ubicacion.getColumna(), ubicacion.getFila() - 1, ubicacion.getColumna());
		} else if (movimiento == 1) {
			Ecosistema.mover(ubicacion.getFila(), ubicacion.getColumna(), ubicacion.getFila(), ubicacion.getColumna() + 1);
		} else if (movimiento == 2) {
			Ecosistema.mover(ubicacion.getFila(), ubicacion.getColumna(), ubicacion.getFila() + 1, ubicacion.getColumna());
		} else {
			Ecosistema.mover(ubicacion.getFila(), ubicacion.getColumna(), ubicacion.getFila(), ubicacion.getColumna() - 1);
		}
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