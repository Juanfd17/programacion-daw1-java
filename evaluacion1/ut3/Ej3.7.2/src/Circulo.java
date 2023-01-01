import java.awt.*;
import java.awt.geom.*;

/**
 * Clase Circulo.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Circulo
{
    private int diametro;
    private int xPosicion;
    private int yPosicion;
    private String color;
    private boolean esVisible;
    
    /**
     * Create a new Circulo at default position with default color.
     */
    public Circulo(int diametro, int xPosicion, int yPosicion, String color, boolean esVisible)
    {
        this.diametro = diametro;
        this.xPosicion = xPosicion;
        this.yPosicion = yPosicion;
        this.color = color;
        this.esVisible = esVisible;
    }

    /**
     * Make this Circulo visible. If it was already visible, do nothing.
     */
    public void hacerVisible()
    {
        esVisible = true;
        draw();
    }
    
    /**
     * Make this Circulo invisible. If it was already invisible, do nothing.
     */
    public void hacerInvisible()
    {
        erase();
        esVisible = false;
    }
    
    /**
     * Move the Circulo a few pixels to the right.
     */
    public void moverDerecha()
    {
        moverHorizontal(20);
    }

    /**
     * Move the Circulo a few pixels to the left.
     */
    public void moverIzquierda()
    {
        moverHorizontal(-20);
    }

    /**
     * Move the Circulo a few pixels up.
     */
    public void moverArriba()
    {
        moverVertical(-20);
    }

    /**
     * Move the Circulo a few pixels down.
     */
    public void moverAbajo()
    {
        moverVertical(20);
    }

    /**
     * Move the Circulo horizontally by 'distancia' pixels.
     */
    public void moverHorizontal(int distancia)
    {
        erase();
        xPosicion += distancia;
        draw();
    }

    /**
     * Move the Circulo vertically by 'distancia' pixels.
     */
    public void moverVertical(int distancia)
    {
        erase();
        yPosicion += distancia;
        draw();
    }

    /**
     * Slowly move the Circulo horizontally by 'distancia' pixels.
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
            xPosicion += delta;
            draw();
        }
    }

    /**
     * Slowly move the Circulo vertically by 'distancia' pixels.
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
            yPosicion += delta;
            draw();
        }
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void cambiarTamano(int newdiametro)
    {
        erase();
        diametro = newdiametro;
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
     * Draw the Circulo with current specifications on screen.
     */
    private void draw()
    {
        if(esVisible) {
            Dibujo canvas = Dibujo.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(xPosicion, yPosicion, 
                                                          diametro, diametro));
            canvas.wait(10);
        }
    }

    /**
     * Erase the Circulo on screen.
     */
    private void erase()
    {
        if(esVisible) {
            Dibujo canvas = Dibujo.getCanvas();
            canvas.erase(this);
        }
    }
}
