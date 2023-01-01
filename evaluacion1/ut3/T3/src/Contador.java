public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0; //Constructor
    }

    public void decrementar(){
        this.valor--;           //Mutador
    }


    public int getContador() {
        return valor;           //Accesor
    }

    public void incrementar(){
        this.valor++;           //Mutador
    }

    public void printContador(){
        System.out.println(getContador()); //Accesor
    }

    public void reset(){
        this.valor = 0; //Mutador
    }
}
