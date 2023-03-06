public abstract class Tipo extends Cursos{

    public Tipo(String nombre, double precio, double horas) {
        super(nombre, precio, horas);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        return super.equals(o);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString();
    }
}