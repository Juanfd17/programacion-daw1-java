public class Persona {
    private String nombre;
    private int edad;

    public void caminar(){
        System.out.println("Estoy caminando");
    }

    public void caminar(int pasos){
        System.out.println("Estoy caminado " + pasos + " pasos");
    }

    public void caminar(String direccion){
        System.out.println("Estoy caminando hacia la direccion " + direccion);
    }

    public void caminar(int pasos, String direccion){
        System.out.println("Estoy caminando " + pasos + " pasos hacia la direccion " + direccion);
    }

    public int caminarR(int pasos){
        System.out.println("Estoy caminando " + pasos + " pasos");
        return pasos;
    }
}
