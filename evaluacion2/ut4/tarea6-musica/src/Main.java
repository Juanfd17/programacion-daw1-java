public class Main {
    public static void main(String[] args) {
        MusicStorageSystem m1 = new MusicStorageSystemA(5);
        m1.addMusic("c");
        m1.addMusic("a");
        m1.addMusic("b");
        m1.addMusic("f");
        m1.addMusic("f");
        m1.addMusic("f");
        imprimirArray(m1.getAllMusic());
        m1.deleteMusic("c");
        imprimirArray(m1.getAllMusic());
        m1.addMusic("x");
        imprimirArray(m1.getAllMusic());
    }

    public static void imprimirArray(String[] array){
        System.out.println("--------------------");
        for (String a:array) {
            System.out.println(a);
        }
    }
}