public class Palabra {
    private String ingles;
    private String espaniol;

    public Palabra(String ingles, String espaniol) {
        this.ingles = ingles;
        this.espaniol = espaniol;
    }

    public String getIngles() {
        return ingles;
    }

    public String getEspaniol() {
        return espaniol;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(ingles).append(" - ").append(espaniol);
        return sb.toString();
    }
}
