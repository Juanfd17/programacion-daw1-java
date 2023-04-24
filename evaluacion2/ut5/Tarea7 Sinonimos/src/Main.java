public class Main {
    public static void main(String[] args) {
        Aplicacion d = new Aplicacion();
        Aplicacion d2 = new Aplicacion();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                d.anadirSinonimo("palabra" + i, "sinonimo" + j);
                d2.anadirSinonimo("palabrad2" + i, "sinonimod2" + j);
            }
        }

        d.imprimirDiccionario();

        d.borrarSinonimo("palabra4", "sinonimo2");
        d.imprimirDiccionario();
        d.anadirDiccionario(d2.getDiccionario());
        d.imprimirDiccionario();
    }
}