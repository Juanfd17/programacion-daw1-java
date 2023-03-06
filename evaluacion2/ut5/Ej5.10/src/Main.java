public class Main {
    public static void main(String[] args) {
        Palabra p = new Palabra("dependientenenenenenenen");
        System.out.println(p.guionizar());
        System.out.println(p.contarVocales());
        System.out.println(p.mayorQue("ABB"));
        System.out.println(p.borrarAparacionesDe("en"));
        imiprimirArray(p.toArray2D());
        imprimirArray(p.toArray());
    }

    public static void imiprimirArray(char[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirArray(char[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}