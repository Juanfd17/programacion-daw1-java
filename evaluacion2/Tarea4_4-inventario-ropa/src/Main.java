public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Prenda bota1 = new Bota("a1","bota1",20,41,true);
        Prenda bota2 = new Bota("a1","bota1",20,41,false);
        Bota bota3 = new Bota("a1","bota",20,41,true);
        Zapatilla zapatilla1 = new Zapatilla("a3","zapatilla1",31,41);
        inventario.agregarPrendas(bota1);
        inventario.agregarPrendas(bota2);
        inventario.agregarPrendas(bota3);
        System.out.printf(inventario.monstrarPrendas());
        System.out.println(inventario.comparador(bota1,bota2));
        System.out.println(inventario.comparador(bota1,bota3));
        System.out.println(inventario.comparador(bota1,zapatilla1));

        Pantalon pantalon1 = new Pantalon("a1","pantalon1",40,"m","1");
        Pantalon pantalon2 = new Pantalon("a1","pantalon1",41,"m","1");

        inventario.agregarPrendas(pantalon1);
        inventario.agregarPrendas(pantalon2);

        System.out.println(inventario.monstrarPrendas());

        System.out.println(inventario.comparador(pantalon1,pantalon2));
    }
}