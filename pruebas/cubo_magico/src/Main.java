public class Main {
    public static void main(String[] args) {
        int numero = 6;

        for (int i = 0; i < numero; i++) {
            for (int j = numero; j > 0; j--) {
                System.out.print(j-i +"\t");
            }
            System.out.println();
        }
    }
}