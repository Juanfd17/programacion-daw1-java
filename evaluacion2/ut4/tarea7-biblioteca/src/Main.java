import jdk.jshell.spi.SPIResolutionException;

public class Main {
    public static void main(String[] args) {
        Revista revista1 = new Revista("r1",1,1);
        Periodico periodico1 = new Periodico("p1",2, 1,2,2022);
        VideoJuego  videoJuego1 = new VideoJuego("v1",3,18);
        Libro libro1 = new Libro("l1",4,2018,"pepe");

        Biblioteca biblioteca1 = new Biblioteca();

        biblioteca1.registrar(revista1);
        biblioteca1.registrar(periodico1);
        biblioteca1.registrar(videoJuego1);
        biblioteca1.registrar(libro1);

        biblioteca1.monstrarCatalogo();
        System.out.println(biblioteca1.prestar(libro1));
        biblioteca1.prestar(videoJuego1);
        biblioteca1.monstrarCatalogo();
        biblioteca1.reiniciarPrestamos();
        biblioteca1.monstrarCatalogo();
    }
}