public class Main {
    public static void main(String[] args) {
        LisataNombres l = new LisataNombres();

        System.out.println(l.nombreMasLargo());

        l.insertarNombre("ccc");
        l.insertarNombre("eeeee");
        l.insertarNombre("bb");
        l.insertarNombre("A");
        l.insertarNombre("dddd");
        l.insertarNombre("ffffff");
        l.insertarNombre("dddd");
        l.insertarNombre("aeiou");
        l.insertarNombre("abc");
        l.insertarNombre("eada");
        l.insertarNombre("eavw");
        l.insertarNombre("eavv");

        System.out.println();
        System.out.println("-mas largo-");
        System.out.println(l.nombreMasLargo());
        l.borrarLetra('e');

        System.out.println(l.empiezaPor("a"));

        System.out.println(l);
        imprimir(l.empiezanPorLetra('a'));
    }

    public static void imprimir(String[] cosa){
        for (int i = 0; i < cosa.length; i++) {
            System.out.println(cosa[i]);
        }
    }
}