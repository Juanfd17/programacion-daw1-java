package ej4a6;

public class Main {
    public static void main(String[] args) {
        BaseDatos baseDatos = new BaseDatos();
        CD melendi = new CD("Volvamos a empezar",3.4,true,"Volvamos a empezar","melendi",17);
        VideoJuego videoJuego = new VideoJuego("beyond good and evil",3.0,true,"juego",1,"PC");
        baseDatos.addArticulo(melendi);
        baseDatos.addArticulo(videoJuego);
        baseDatos.listar();
    }
}
