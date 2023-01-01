import java.awt.*;

/**
 * A Cuadrado that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Cuadrado
{
    private int size;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    /**
     * Create a new Cuadrado at default position with default color.
     */
    public Cuadrado(int size, int xPosition, int yPosition, String color, boolean isVisible)
    {
        this.size = size;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color = color;
        this.isVisible = isVisible;
    }

    /**
     * Make this Cuadrado visible. If it was already visible, do nothing.
     */
    public void hacerVisible()
    {
        isVisible = true;
        draw();
    }
    
    /**
     * Make this Cuadrado invisible. If it was already invisible, do nothing.
     */
    public void hacerInvisible()
    {
        erase();
        isVisible = false;
    }
    
    /**
     * Move the Cuadrado a few pixels to the right.
     */
    public void moverDerecha()
    {
        moverHorizontal(20);
    }

    /**
     * Move the Cuadrado a few pixels to the left.
     */
    public void moverIzquierda()
    {
        moverHorizontal(-20);
    }

    /**
     * Move the Cuadrado a few pixels up.
     */
    public void moverArriba()
    {
        moverVertical(-20);
    }

    /**
     * Move the Cuadrado a few pixels down.
     */
    public void moverAbajo()
    {
        moverVertical(20);
    }

    /**
     * Move the Cuadrado horizontally by 'distancia' pixels.
     */
    public void moverHorizontal(int distancia)
    {
        erase();
        xPosition += distancia;
        draw();
    }

    /**
     * Move the Cuadrado vertically by 'distancia' pixels.
     */
    public void moverVertical(int distancia)
    {
        erase();
        yPosition += distancia;
        draw();
    }

    /**
     * Slowly move the Cuadrado horizontally by 'distancia' pixels.
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
     * Slowly move the Cuadrado vertically by 'distancia' pixels.
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
    public void cambiarTamano(int newSize)
    {
        erase();
        size = newSize;
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
     * Draw the Cuadrado with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Dibujo canvas = Dibujo.getCanvas();
            canvas.draw(this, color,
                        new Rectangle(xPosition, yPosition, size, size));
            canvas.wait(10);
        }
    }

    /**
     * Erase the Cuadrado on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Dibujo canvas = Dibujo.getCanvas();
            canvas.erase(this);
        }
    }
}
