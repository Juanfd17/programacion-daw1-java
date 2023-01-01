public class Main {
    public static void main(String[] args) {
        RelojAlarma r1 = new RelojAlarma(6,58);
        System.out.print(r1.emitirTic());
        System.out.print(r1.emitirTic());
        System.out.print(r1.emitirTic());
        System.out.print(r1.emitirTic());
        System.out.println(r1.getHora());
        r1.setHora(11,59);
        System.out.println(r1.getHora());
        System.out.print(r1.emitirTic());
        System.out.println(r1.getHora());
    }
}