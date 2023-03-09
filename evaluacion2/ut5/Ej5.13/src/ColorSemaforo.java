public enum ColorSemaforo {
    ROJO(90), AMBAR(10), VERDE(50);
    private int segundos;

    ColorSemaforo(int segundos) {
        this.segundos = segundos;
    }

    public int getSegundos() {
        return segundos;
    }
}
