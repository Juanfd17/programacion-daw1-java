public enum PiezaAjedrez {
    CABALLO(10, 'c'), TORRE(15, 't'), ALFIL(15, 'a'), REY(50, 'R'), REINA(50, 'r'), PEON(5, 'p');

    private PiezaAjedrez(int puntuacion, char simbolo){
        this.puntuacion = puntuacion;
        this.simbolo = simbolo;
    }
    private int puntuacion;
    private char simbolo;

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion){
        this.puntuacion = puntuacion;
    }
}
