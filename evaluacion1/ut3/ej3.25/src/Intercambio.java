public class Intercambio {
    private int a;
    private int b;

    public Intercambio(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void intercabio(){
        int aux = a;
        a = b;
        b = aux;
    }

    public void escribir(){
        System.out.println("Atributo a = " + a);
        System.out.println("Atributo b = " + b);
    }

    public void prompAntes(){
        System.out.println("Antes del intercambio");
        intercabio();
        escribir();
        intercabio();
    }

    public void prompDespues(){
        System.out.println("Despues del intercambio");
        escribir();
    }
}
