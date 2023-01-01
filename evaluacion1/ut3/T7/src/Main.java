public class Main {
    public static void main(String[] args) {
        Ordenador ordenador1 = new Ordenador(1024);
        ordenador1.instalar256Mb();
        System.out.println(ordenador1);
        ordenador1.instalarMemoria(256);
        System.out.println(ordenador1);
        ordenador1.vaciarMemoria();
        System.out.println(ordenador1);
    }
}