public class Teoricos extends Tipo{
    boolean oficial;

    public Teoricos(String nombre, double precio, double horas, boolean oficial) {
        super(nombre, precio, horas);
        this.oficial = oficial;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Oficial: [");
        if (oficial){
            sb.append("Si");
        } else {
            sb.append("No");
        }
        sb.append("]\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        if (super.equals(o)){
            return true;
        }

        return false;
    }
}
