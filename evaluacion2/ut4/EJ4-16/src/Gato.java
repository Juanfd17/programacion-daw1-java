public class Gato extends Animal{
    String favorito;

    public Gato(String nombre, int nPatas, Persona dueno, String definicion, String favorito) {
        super(nombre, nPatas, dueno, definicion);
        this.favorito = favorito;
    }

    public void comer(){
        System.out.println("pescado");
    }

    public void sonido(){
        System.out.println("maullar");
    }

    public void favorito(){
        System.out.println(favorito);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gato\n");
        sb.append(super.toString());
        sb.append("Favorito:").append(favorito).append("\n");
        return sb.toString();
    }
}
