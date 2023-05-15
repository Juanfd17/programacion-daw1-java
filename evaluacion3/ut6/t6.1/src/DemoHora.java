public class DemoHora {
    public static void main(String[] args) {
        demo();
    }

    public static void demo(){
        try {
            new Hora(-1,2,0);
        } catch (HoraExcepcion e) {
            System.out.println(e);
        }
    }
}