public class HoraExcepcion extends Exception {
    private int valorErronio;
    private char tipo;

    public HoraExcepcion(int valorErronio, char tipo){
        this.valorErronio = valorErronio;
        this.tipo = tipo;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Se a introducido ");
        if (tipo == 'h'){
            sb.append("una hora incorrecta deve estar entre 0 y 23");
        }

        if (tipo == 'm'){
            sb.append("un minuto incorrecto deve estar entre 0 y 59");
        }

        if (tipo == 's'){
            sb.append("un segundo incorrecto deve estar entre 0 y 59");
        }

        sb.append(" y usted a introducido ").append(valorErronio);
        return sb.toString();
    }
}