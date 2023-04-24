import java.util.*;

public class Inmobiliaria{
	private final static String[] DATOS_EMPLEADOS = {
			"39817263H;Manuel;Gómez García",
			"99625423F;Nuria;Ruiz Pérez",
			"63265932L;Juan Daniel;Sastre Palomo",
			"36259536P;Laura;Vázquez Pardo"
	};

	private ArrayList<Inmueble> inmuebles;
	private ArrayList<Empleado> empleados;

	public Inmobiliaria() {
		this.inmuebles = new ArrayList<>();
		this.empleados = new ArrayList<>();
		registrarEmpleados();
	}

	public void registrarEmpleados(){
		for (int i = 0; i < DATOS_EMPLEADOS.length; i++) {
			StringTokenizer st = new StringTokenizer(DATOS_EMPLEADOS[i], ";");
			for (int j = 0; j < st.countTokens(); j++) {
				empleados.add(new Empleado(st.nextToken(), st.nextToken(), st.nextToken()));
			}
		}
	}

	public boolean compararInmuebles(Inmueble i1, Inmueble i2){
		return i1.equals(i2);
	}

	public boolean anadirInmueble(Inmueble inmueble){
		if (!inmuebleRepetido(inmueble)){
			inmuebles.add(inmueble);
			return true;
		}

		return false;
	}

	public boolean inmuebleRepetido(Inmueble inmueble){
		for (Inmueble i: inmuebles) {
			if (i.getCodigo().equals(inmueble.getCodigo())){
				return true;
			}
		}

		return false;
	}

	public ArrayList<Inmueble> inmueblesPorMunicipio(String municipio){
		ArrayList<Inmueble> inmueblesMunicipio = new ArrayList<>();
		for (Inmueble i: inmuebles) {
			if (i.getDireccion().getMunicipio().equals(municipio)){
				inmueblesMunicipio.add(i);
			}
		}

		return inmueblesMunicipio;
	}

	public boolean alquilarInmbueble(String codigoInmueble, String DNIEmpleado) {
		Empleado empleado = encontrarEmpleado(DNIEmpleado);
		Inmueble inmueble = encontrarInmueble(codigoInmueble);

		if (empleado != null && inmueble != null && inmueble.getEstadoInmueble() == EstadoInmueble.SE_ALQUILA){
			inmueble.alquilar();
			empleado.alquilar(inmueble);
			return true;
		}
		return false;
	}

	public boolean venderInmbueble(String codigoInmueble, String DNIEmpleado) {
		Empleado empleado = encontrarEmpleado(DNIEmpleado);
		Inmueble inmueble = encontrarInmueble(codigoInmueble);
		if (empleado != null && inmueble != null && inmueble.getEstadoInmueble() == EstadoInmueble.SE_VENDE){
			inmueble.vender();
			empleado.vender(inmueble);
			return true;
		}
		return false;
	}

	// Este método no se puede modificar.
	public ArrayList<Inmueble> inmueblesPorCodigo() {
		ArrayList<Inmueble> inmueblesCodigo = new ArrayList<Inmueble>(inmuebles);
		Collections.sort(inmueblesCodigo);
		return inmueblesCodigo;
	}

	public ArrayList<Inmueble> inmueblesPorPrecio(){
		ArrayList<Inmueble> inmueblesPrecio = new ArrayList<Inmueble>(inmuebles);
		Collections.sort(inmueblesPrecio, Inmueble::compareToPrecio);
		return inmueblesPrecio;
	}

	public ArrayList<Inmueble> inmueblesSinFincas(){
		ArrayList inmbueblesSinFincas = new ArrayList<>();
		for (Inmueble i: inmuebles) {
			if (i.getClass() != Finca.class){
				inmbueblesSinFincas.add(i);
			}
		}

		return inmbueblesSinFincas;
	}

	public double precioMedioVentaViviendas() {
		double precio = 0;
		int contador = 0;
		for (Inmueble i: inmuebles) {
			if (i.getClass() == Vivienda.class && i.getEstadoInmueble() != EstadoInmueble.SE_ALQUILA){
				precio += i.getPrecio();
				contador ++;
			}
		}

		return precio / contador;
	}

	public String[] empleadosSegundoApellidoEmpiezaPor(String empieza){
		String[] nombres = new String[empleados.size()];
		int contador = 0;
		for (Empleado e: empleados) {
			StringTokenizer st = new StringTokenizer(e.getApellidos(), " ");
			st.nextToken();
			String apellido = st.nextToken();
			if (apellido.substring(0, empieza.length()).equals(empieza)){
				nombres[contador] = e.getNombre();
				contador++;
			}
		}

		return nombres;
	}

	public double[][] totalOperaciones(){
		double[][] matriz = new double[2][3];
		for (Empleado e: empleados) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[i][j] += e.getOperaciones()[i][j];
				}
			}
		}

		return matriz;
	}

	public void imprimirMatrizOperaciones(double[][] matriz){
		System.out.print(" ");
		System.out.print("\t\tV ");
		System.out.print("\t\tG ");
		System.out.println("\t\tF ");
		System.out.print("Alq.\t");
		for (int i = 0; i <= matriz.length; i++) {
			System.out.print(matriz[0][i] + "\t\t");
		}
		System.out.println();
		System.out.print("Ven.\t");
		for (int i = 0; i <= matriz.length; i++) {
			System.out.print(matriz[1][i] + "\t\t");
		}
		System.out.println();
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public ArrayList<Inmueble> getInmuebles() {
		return inmuebles;
	}

	public HashMap<String, Set<Vivienda>> viviendasPorMunicipo2(){
		HashMap<String, Set<Vivienda>> lista = new HashMap<>();

		for (Inmueble i:inmuebles) {
			if (i instanceof Vivienda) {
				String municipio = i.getDireccion().getMunicipio();
				Set<Vivienda> viviendas = lista.get(municipio);

				if (viviendas == null){
					viviendas = new HashSet<>();
				}

				viviendas.add((Vivienda) i);
				lista.put(municipio, viviendas);
			}
		}

		return lista;
	}

	public HashMap<EstadoInmueble, Integer> estadoInmueble(){
		HashMap<EstadoInmueble, Integer> lista = new HashMap<>();
		for (EstadoInmueble e: EstadoInmueble.values()) {
			lista.put(e, 0);
		}

		for (Inmueble i: inmuebles) {
			Integer contador = lista.get(i.getEstadoInmueble());

			contador++;
			lista.put(i.getEstadoInmueble(), contador);
		}

		return lista;
	}

	public HashMap<String, HashMap<String, Integer>> operacionesPorDNI(){
		HashMap<String, HashMap<String, Integer>> listaE = new HashMap<>();
		for (int i = 0; i < empleados.size(); i++) {
			String dni = empleados.get(i).getDni();
			HashMap<String, Integer> listaO = listaE.get(dni);
			if (listaO == null){
				listaO = new HashMap<>();
			}

			double[][] operaciones = empleados.get(i).getOperaciones();
			for (int j = 0; j < operaciones.length; j++) {
				int valor = 0;
				String vOA = "Alquiler";
				if (j == 1){
					vOA = "Vender";
				}
				for (int k = 0; k < operaciones[j].length; k++) {
					valor+= operaciones[j][k];
				}
				listaO.put(vOA,valor);
			}

			listaE.put(dni,listaO);
		}

		return listaE;
	}

	public void imprimirOperacionesPorDNI(){
		HashMap<String, HashMap<String, Integer>> listaE = operacionesPorDNI();
		for (int i = 0; i < empleados.size(); i++) {
			String dni = empleados.get(i).getDni();
			System.out.println("---" + dni);
			System.out.println("\talquileres: " + listaE.get(dni).get("Alquiler"));
			System.out.println("\tventas: " + listaE.get(dni).get("Vender"));
		}
	}

	public HashMap<Max, Integer> estadicasViviendas(){
		HashMap<Max, Integer> lista = new HashMap<>();

		for (Max m: Max.values()) {
			lista.put(m, 0);
		}

		for (Inmueble i: inmuebles) {
			if (i instanceof  Vivienda){
				if (i.getSuperficie() > lista.get(Max.MAX_SUPERFICIE)){
					lista.put(Max.MAX_SUPERFICIE, i.getSuperficie());
				}

				if (((Vivienda) i).getNumeroAseos() > lista.get(Max.MAX_ASEOS)){
					lista.put(Max.MAX_ASEOS, ((Vivienda) i).getNumeroAseos());
				}

				if (((Vivienda) i).getNumeroHabitaciones() > lista.get(Max.MAX_HABITACIONES)){
					lista.put(Max.MAX_HABITACIONES, ((Vivienda) i).getNumeroHabitaciones());
				}
			}
		}

		return lista;
	}

	private Inmueble encontrarInmueble(String codigo){
		for (Inmueble i: inmuebles) {
			if (i.getCodigo().equals(codigo)){
				return i;
			}
		}

		return null;
	}

	private Empleado encontrarEmpleado(String dni){
		for (Empleado e: empleados) {
			if (e.getDni().equals(dni)){
				return e;
			}
		}

		return null;
	}
}