import java.awt.*;

public abstract class Figura {
    Point centro;
    Color color;

    public Figura(int x, int y, int r, int g, int b) {
        this.centro = new Point(x, y);
        this.color = new Color(r,g,b);
    }

    abstract double perimetro();
    abstract double area();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("centro: ").append(centro);
        sb.append("color: ").append(color);
        return sb.toString();
    }

    public int getColor(){
        return color.getRGB();
    }

    public boolean equals(Figura figura){
        return this.centro.equals(figura.centro) && this.color.equals(figura.color);
    }
}
