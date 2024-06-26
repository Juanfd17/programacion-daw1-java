public class Cine {
    private final int PRECIOJOVEN = 20;
    private final int PRECIOJUBILADO = 20;
    private final int PRECIOVIP = 30;
    private String localidad;
    private String nombre;
    private Cliente[] clientes = new Cliente[0];
    private int clientesJoven;
    private int clientesJubilado;
    private int clientesVip;
    private Pelicula[] peliculas = new Pelicula[5];
    private int contadorPeliculas;

    public Cine(String localidad, String nombre) {
        this.localidad = localidad;
        this.nombre = nombre;
    }

    public boolean crearCliente(String nombre, String apellidos, int anioNacimento, int mesNacimiento, int diaNacimiento, String dni, int tipoCuenta) {
        Cliente cliente = new Cliente(nombre, apellidos, anioNacimento, mesNacimiento, diaNacimiento, dni, tipoCuenta);
        return aniadirCliene(cliente);
    }

    public boolean aniadirCliene(Cliente cliente) {
        boolean nuevoCliente = true;
        for (Cliente c : clientes) {
            if (c.getDni().equals(cliente.getDni())) {
                nuevoCliente = false;
            }
        }
        if (nuevoCliente) {
            int nclientes = clientesJoven + clientesJubilado + clientesVip;
            Cliente[] TEMPClientes = new Cliente[nclientes + 1];
            for (int i = 0; i < nclientes; i++) {
                TEMPClientes[i] = this.clientes[i];
            }

            if (cliente.getTipoCuenta() == 1) {
                clientesJoven++;
            } else if (cliente.getTipoCuenta() == 2) {
                clientesJubilado++;
            } else {
                clientesVip++;
            }

            TEMPClientes[nclientes] = cliente;
            this.clientes = TEMPClientes;
            return true;
        }
        return false;
    }

    public String monstrarClientes() {
        int nclientes = clientesJoven + clientesJubilado + clientesVip;
        if (nclientes == 0) {
            return "No hay clientes\n";
        }

        final StringBuilder sb = new StringBuilder();
        for (Cliente p : clientes) {
            sb.append(p);
            sb.append("-------------------------\n");
        }
        return sb.toString();
    }

    public void crearPelicula(String nombre, int anioEstreno, int mesEstreno, int diaEstreno, int entradasVendidas, double hora1, double hora2, double hora3, double hora4, boolean infantil, String productora) {
        Pelicula pelicula = new Pelicula(nombre, anioEstreno, mesEstreno, diaEstreno, entradasVendidas, hora1, hora2, hora3, hora4, infantil, productora);
        aniadirPelicula(pelicula);
    }

    public void aniadirPelicula(Pelicula pelicula) {
        if (contadorPeliculas < peliculas.length) {
            peliculas[contadorPeliculas] = pelicula;
            contadorPeliculas++;
        }
    }

    public boolean borrarPelicula(String nombre, int anioEstreno) {

        int nPelicula = encontrarPelicula(anioEstreno, nombre);

        if (nPelicula < 0) {
            return false;
        }

        peliculas[nPelicula] = null;

        for (int j = nPelicula; j < contadorPeliculas - 1; j++) {
            peliculas[j] = peliculas[j + 1];
        }

        contadorPeliculas--;

        for (int j = contadorPeliculas; j <= peliculas.length - 1; j++) {
            peliculas[j] = null;
        }
        return true;
    }

    public String monstrarPeliculas() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < contadorPeliculas; i++) {
            sb.append(peliculas[i]);
            sb.append("-------------------------\n");
        }

        if (contadorPeliculas == 0) {
            sb.append("No hay peliculas");
        }

        return sb.toString();
    }

    public void cambiarDatos(String localidad, String nombre) {
        this.localidad = localidad;
        this.nombre = nombre;
    }

    public void cambiarDatos(String localidad) {
        this.nombre = localidad;
        this.localidad = localidad;
    }

    private int encontrarCliente(String dniCliente) {
        int nclientes = clientesJoven + clientesJubilado + clientesVip;
        for (int i = 0; i < nclientes; i++) {
            if (clientes[i].getDni().equals(dniCliente)) {
                return i;
            }
        }
        return -1;
    }

    private int encontrarPelicula(int anioEstreno, String nombre) {
        for (int i = 0; i < contadorPeliculas; i++) {
            if (peliculas[i].getAnioEstreno() == anioEstreno && peliculas[i].getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public String comprarEntrda(int anioEstreno, String nombrePelicula, String dniCliente) {
        int nClinete = encontrarCliente(dniCliente);
        if (nClinete < 0) {
            return "Cliente no existente";
        }

        int nPelicula = encontrarPelicula(anioEstreno, nombrePelicula);
        if (nPelicula < 0) {
            return "Pelicula no existente";
        }

        peliculas[nPelicula].entradaComprada();
        final StringBuilder sb = new StringBuilder("El cliente ").append(clientes[nClinete].getNombre()).append(" ").append(clientes[nClinete].getApellidos()).append(" de tipo ");
        sb.append(clientes[nClinete].tipoCuenta());
        sb.append(" ha comprado una entrada.");

        if (clientes[nClinete].getTipoCuenta() == 3) {
            if (!peliculas[nPelicula].isInfantil()) {
                clientes[nClinete].entradaComprada();
            }
            sb.append(" El cliente a acumulado ").append(clientes[nClinete].getEntradasCompradas()).append(" entradas compradas,");

            if (clientes[nClinete].getEntradasCompradas() != 5) {
                sb.append(" cuando llege a 5 se le regalara una entrada.");
            } else {
                sb.append(" esta le sale gratis.");
            }
        }

        sb.append(" El precio es de ");
        if (clientes[nClinete].getTipoCuenta() == 1) {
            sb.append(PRECIOJOVEN);
        } else if (clientes[nClinete].getTipoCuenta() == 2) {
            sb.append(PRECIOJUBILADO);
        } else if (clientes[nClinete].getTipoCuenta() == 3 && clientes[nClinete].getEntradasCompradas() == 5) {
            clientes[nClinete].setEntradasCompradas(0);
            sb.append(0);
        } else {
            sb.append(PRECIOVIP);
        }

        sb.append("�");
        return sb.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Precios:\n");
        sb.append("\tJoven: ").append(PRECIOJOVEN).append(", Jubilado: ").append(PRECIOJUBILADO).append(", VIP: ").append(PRECIOVIP).append("\n");
        sb.append("Localidad: ").append(localidad).append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Clientes:\n");
        sb.append(monstrarClientes());
        sb.append("Numero de clientes Jovenes: ").append(clientesJoven).append("\n");
        sb.append("Numero de clientes Jubilados: ").append(clientesJubilado).append("\n");
        sb.append("Numero de clientes VIP: ").append(clientesVip).append("\n");
        sb.append("Peliculas:\n");
        sb.append(monstrarPeliculas());
        return sb.toString();
    }
}