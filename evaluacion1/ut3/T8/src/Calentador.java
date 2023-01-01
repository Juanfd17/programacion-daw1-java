public class Calentador {
    private int temperatura;
    private int min;
    private int max;
    private int incremento;

    public Calentador(int min, int max) {
        this.temperatura = 15;
        this.incremento = 5;
        this.min = min;
        this.max = max;
    }

    public void calentar(){
        if (max >= temperatura + incremento){
            this.temperatura += incremento;
        }
    }

    public void enfriar(){
        if (min <= temperatura - incremento){
            this.temperatura -= incremento;
        }
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setIncremento(int incremento) {
        if (incremento > 0) {
            this.incremento = incremento;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("La temperatura esta establecida en ").append(this.temperatura).append("\n");
        sb.append("El minimo esta establecido en ").append(this.min).append("\n");
        sb.append("El maximo esta establecido en ").append(this.max).append("\n");
        sb.append("La temperatura se modificara de ").append(this.incremento);
        return sb.toString();
    }
}
