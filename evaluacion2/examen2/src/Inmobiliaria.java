import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

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