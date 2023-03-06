public class Perro extends Animal{
    String favorito;

    public Perro(String nombre, int nPatas, Persona dueno, String definicion, String favorito) {
        super(nombre, nPatas, dueno, definicion);
        this.favorito = favorito;
    }

    public void comer(){
        System.out.println("comer huesos");
    }

    public void sonido(){
        System.out.println("ladrar");
    }

    public void favorito(){
        System.out.println(favorito);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Perro\n");
        sb.append(super.toString());
        sb.append("Favorito: ").append(favorito).append("\n");
        return sb.toString();
    }
}
