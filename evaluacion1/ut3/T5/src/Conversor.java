public class Conversor {
    private double grados;

    public Conversor() {
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public double getGrados() {
        return grados;
    }

    public void aCentigrados() {
        grados = (grados - 32) * 5 / 9;
    }

    public void aFarenheit() {
        grados = (grados * 9 / 5) + 32;
    }

}
