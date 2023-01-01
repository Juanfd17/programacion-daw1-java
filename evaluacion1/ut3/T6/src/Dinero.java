public class Dinero {
    private int euros;
    private int resto;
    private int b10;
    private int b5;
    private int m2;
    private int m1;


    public Dinero(int euros) {
        this.euros = euros;
    }

    public int getEuros() {
        return euros;
    }

    public void setEuros(int euros) {
        this.euros = euros;
    }

    public void printDescomposicionMonedas(){
        descoponerMonedas();

        System.out.println(this.euros + "€ son");
        System.out.println("Billetes de 10 = " + b10);
        System.out.println("Billetes de 5 = " + b5);
        System.out.println("Monedas de 2 = " + m2);
        System.out.println("Monedas de 1 = " + m1);
    }

    public void descoponerMonedas(){
        this.resto = this.euros;
        this.b10 = 0;
        this.b5 = 0;
        this.m2 = 0;
        this.m1 = 0;

        while (resto > 0){
            if (10 <= resto){
                b10 ++;
                resto -= 10;
            } else if (5 <= resto) {
                b5 ++;
                resto -= 5;
            } else if (2 <= resto){
                m2 ++;
                resto -= 2;
            } else {
                m1 ++;
                resto -= 1;
            }
        }
    }
}
