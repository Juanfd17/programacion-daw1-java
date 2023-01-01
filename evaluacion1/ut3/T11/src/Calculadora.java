public class Calculadora {
    private int cantidad;
    private int suma;
    private int maximo;
    private int minimo;

    public Calculadora() {
        this.cantidad = 0;
        this.suma = 0;
        this.maximo = 0;
        this.minimo = 0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getMaximo() {
        return maximo;
    }

    public int getMinimo() {
        return minimo;
    }

    public void introducirNumero(int numero) {

        if (getMaximo() < numero) {
            this.maximo = numero;
        }

        if (getMinimo() > numero  || getCantidad() == 0) {
            this.minimo = numero;
        }
        suma += numero;

        cantidad++;
    }

    public double getMedia(){
        return (double) this.suma/getCantidad();
    }
}
