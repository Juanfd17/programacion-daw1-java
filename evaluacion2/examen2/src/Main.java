public class Main {
    public static void main(String[] args) {
        Inmobiliaria i = new Inmobiliaria();
        for (int j = 0; j < 5; j++) {
            Direccion d = new Direccion("Municipio" + j, "Direccion" + j);
            Finca f = new Finca("Finca"+j, 100 + j,50 + j, d,EstadoInmueble.SE_VENDE,true);
            i.anadirInmueble(f);
        }

        for (int j = 0; j < 5; j++) {
            Direccion d = new Direccion("Municipio" + j, "Direccion" + j);
            Garaje f = new Garaje("Garage"+j, 100 + j,50 + j, d,EstadoInmueble.SE_VENDE,true);
            i.anadirInmueble(f);
        }

        for (int j = 1; j < 5; j++) {
            Direccion d = new Direccion("Municipio" + j, "Direccion" + j);
            Vivienda f = new Vivienda("Vivienda"+j, 100 + j,50 + j, d,EstadoInmueble.SE_ALQUILA,j,j-1);
            i.anadirInmueble(f);
        }

        i.inmueblesSinFincas();
        i.alquilarInmbueble("Vivienda2", "39817263H");
        i.venderInmbueble("Garage1", "39817263H");
        i.venderInmbueble("Garage2", "99625423F");
        i.venderInmbueble("Finca1", "99625423F");
        i.venderInmbueble("Finca2", "99625423F");
        i.alquilarInmbueble("Vivienda3", "99625423F");

        String[] nombres = i.empleadosSegundoApellidoEmpiezaPor("Pa");
        System.out.println(nombres);
        System.out.println("precio Medio viviendas");
        System.out.println(i.precioMedioVentaViviendas());
        i.totalOperaciones();
        i.imprimirMatrizOperaciones(i.totalOperaciones());
        i.inmueblesPorPrecio();
        i.inmueblesPorCodigo();

        Direccion d = new Direccion("Municipio" + 1, "Direccion" + 2);
        Finca f = new Finca("Finca"+6, 100 + 2,50 + 1, d,EstadoInmueble.SE_ALQUILA,true);
        System.out.println(i.anadirInmueble(f));

        Direccion d2 = new Direccion("Municipio" + 2, "Direccion" + 1);
        Garaje f2 = new Garaje("Garage"+1, 100 + 1,50 + 2, d2,EstadoInmueble.SE_ALQUILA,true);
        System.out.println(i.anadirInmueble(f2));

        Direccion d3 = new Direccion("Municipio" + 2, "Direccion" + 3);
        Vivienda f3 = new Vivienda("Vivienda"+3, 100 + 3,50 + 2, d3,EstadoInmueble.VENDIDO,2,2-1);
        System.out.println(i.anadirInmueble(f3));

        System.out.println(i.compararInmuebles(f,f));

        System.out.println(i.inmueblesPorMunicipio("Municipio1"));
    }
}