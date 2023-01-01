public class Compra {
    private double valorCompra;
    private double totalCompra;
    public Compra(double valorCompra){
        this.valorCompra = valorCompra;
        this.totalCompra = valorCompra + valorCompra*0.16;
    }

    public void imprimirTiket(){
        System.out.println("Valor de la compra: " + this.valorCompra);
        System.out.println("Valor total de la compra: " + this.totalCompra);
    }
}
