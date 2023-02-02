public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.caminar();
        persona.caminar(5);
        persona.caminar("casa");
        persona.caminar(5,"curro");
        System.out.println(persona.caminarR(5));
    }
}