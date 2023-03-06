public class Vaca extends Animal{
    public Vaca(String nombre, int nPatas, Persona dueno, String definicion) {
        super(nombre, nPatas, dueno, definicion);
    }

    public void comer(){
        System.out.println("hierba");
    }

    public void sonido(){
        System.out.println("mugido");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vaca\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
