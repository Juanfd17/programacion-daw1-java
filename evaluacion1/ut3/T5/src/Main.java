public class Main {
    public static void main(String[] args) {
        Conversor conversor =new Conversor();

        conversor.setGrados(12);
        conversor.aFarenheit();
        System.out.println(conversor.getGrados());
        conversor.aCentigrados();
        System.out.println(conversor.getGrados());
    }
}