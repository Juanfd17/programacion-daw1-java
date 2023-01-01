public class Punto {
    private int x;
    private int y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder().append(" x = ").append(x).append(", y = ").append(y);
        return sb.toString();
    }
}
