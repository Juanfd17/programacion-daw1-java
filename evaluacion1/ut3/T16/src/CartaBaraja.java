public class CartaBaraja {
    private final int OROS = 1;
    private final int COPAS = 2;
    private final int ESPADAS = 3;
    private final int BASTOS = 4;

    private int palo;
    private int valor;

    public CartaBaraja(int valor, int palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public String getPalo(){
        switch (this.palo){
            case OROS:
                return "Oros";
            case COPAS:
                return "Copas";
            case ESPADAS:
                return "Espadas";
            case BASTOS:
                return "Bastos";
            default:
                return "error";
        }
    }

    public String getValor(){
        if (this.valor == 1){
            return "As";
        }
        if (this.valor == 2){
            return "Dos";
        }

        if (this.valor == 3){
            return "Tres";
        }

        if (this.valor == 4){
            return "Cuatro";
        }

        if (this.valor == 5){
            return "Cinco";
        }

        if (this.valor == 6){
            return "Seis";
        }

        if (this.valor == 7){
            return "Siete";
        }

        if (this.valor == 10){
            return "Sota";
        }

        if (this.valor == 11){
            return "Caballo";
        }

        if (this.valor == 12){
            return "Rey";
        }

        return "error";
    }

    @Override
    public String toString() {
        if (getPalo().equals("error") || getValor().equals("error")){
            return "Error la carta no existe";
        }

        final StringBuffer sb = new StringBuffer().append(getValor()).append(" de ").append(getPalo());
        return sb.toString();
    }
}
