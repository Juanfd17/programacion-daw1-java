public class Revista extends Catalogo{
    int numero;

    public Revista(String nombre, int id, int numero) {
        super(nombre, id);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if (super.equals(o) && this.numero == ((Revista) o).getNumero()){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("\n").append("numero: ").append(numero).append("\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
