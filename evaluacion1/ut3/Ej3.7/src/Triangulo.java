import java.awt.*;

/**
 * A Triangulo that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Triangulo
{
    private int altura;
    private int ancho;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    /**
     * Create a new Triangulo at default position with default color.
     */
    public Triangulo()
    {
        altura = 60;
        ancho = 70;
        xPosition = 210;
        yPosition = 140;
        color = "green";
        isVisible = false;
    }

    /**
     * Make this Triangulo visible. If it was already visible, do nothing.
     */
    public void hacerVisible()
    {
        isVisible = true;
        draw();
    }
    
    /**
     * Make this Triangulo invisible. If it was already invisible, do nothing.
     */
    public void hacerInvisible()
    {
        erase();
        isVisible = false;
    }
    
    /**
     * Move the Triangulo a few pixels to the right.
     */
    public void moverDerecha()
    {
        moverHorizontal(20);
    }

    /**
     * Move the Triangulo a few pixels to the left.
     */
    public void moverIzquierda()
    {
        moverHorizontal(-20);
    }

    /**
     * Move the Triangulo a few pixels up.
     */
    public void moverArriba()
    {
        moverVertical(-20);
    }

    /**
     * Move the Triangulo a few pixels down.
     */
    public void moverAbajo()
    {
        moverVertical(20);
    }

    /**
     * Move the Triangulo horizontally by 'distancia' pixels.
     */
    public void moverHorizontal(int distancia)
    {
        erase();
        xPosition += distancia;
        draw();
    }

    /**
     * Move the Triangulo vertically by 'distancia' pixels.
     */
    public void moverVertical(int distancia)
    {
        erase();
        yPosition += distancia;
        draw();
    }

    /**
     * Slowly move the Triangulo horizontally by 'distancia' pixels.
     */
    public void moverDespacioHorizontal(int distancia)
    {
        int delta;

        if(distancia < 0) 
        {
            delta = -1;
            distancia = -distancia;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distancia; i++)
        {
            xPosition += delta;
            draw();
        }
    }

    /**
     * Slowly move the Triangulo vertically by 'distancia' pixels.
     */
    public void moverDespacioVertical(int distancia)
    {
        int delta;

        if(distancia < 0) 
        {
            delta = -1;
            distancia = -distancia;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distancia; i++)
        {
            yPosition += delta;
            draw();
        }
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void cambiarTamano(int newaltura, int newancho)
    {
        erase();
        altura = newaltura;
        ancho = newancho;
        draw();
    }

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void cambiarColor(String newColor)
    {
        color = newColor;
        draw();
    }

    /**
     * Draw the Triangulo with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Dibujo canvas = Dibujo.getCanvas();
            int[] xpoints = { xPosition, xPosition + (ancho/2), xPosition - (ancho/2) };
            int[] ypoints = { yPosition, yPosition + altura, yPosition + altura };
            canvas.draw(this, color, new Polygon(xpoints, ypoints, 3));
            canvas.wait(10);
        }
    }

    /**
     * Erase the Triangulo on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Dibujo canvas = Dibujo.getCanvas();
            canvas.erase(this);
        }
    }
}
