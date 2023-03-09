public class Carta {
    Palo palo;
    int valor;

    public Carta(Palo palo, int valor) {
        this.palo = palo;
        if (valor > 12 || valor < 1){
            valor = 12;
        } else {
            this.valor = valor;
        }
    }

    public Carta(int valor) {
        if (valor > 12 || valor < 0){
            valor = 12;
        } else {
            this.valor = valor;
        }
        this.palo = Palo.OROS;
    }
}
