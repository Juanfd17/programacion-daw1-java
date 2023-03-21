public class Main {
    public static void main(String[] args) {
        ListinTelefonico li = new ListinTelefonico();

        li.introducirNumero("n1","121");
        li.introducirNumero("n2","121");
        li.introducirNumero("n3","123");
        li.introducirNumero("n4","124");
        li.introducirNumero("n5","125");

        System.out.println(li.buscarNumero("n6"));
        li.escribirListin();
    }
}