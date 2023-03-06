package ej4a6;

import java.util.ArrayList;

public class BaseDatos {
    private ArrayList <Articulo> articulos;

    public BaseDatos(){
        articulos = new ArrayList<Articulo>();
    }

    public void addArticulo(Articulo elArticulo){
        articulos.add(elArticulo);
    }

    public void listar(){
        for (Articulo a: articulos){
            System.out.println(a);
        }
    }
}
