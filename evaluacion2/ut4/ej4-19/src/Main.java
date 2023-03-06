public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa(200);
        Casa casa2 = casa1.clone();

        casa2.setSuperficie(150);
        System.out.println(casa1.getSuperficie());
        System.out.println(casa2.getSuperficie());

        ComparadorCasa comparadorCasa = new ComparadorCasa();

        System.out.println(comparadorCasa.compare(casa1,casa2));
    }
}