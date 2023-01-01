public class Dibujo {

    private String nombre;
    private String autor;
    private Triangulo triangulo;
    private Cuadrado cuadrado;

    public Dibujo(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public Triangulo getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    public Cuadrado getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
    }
}
