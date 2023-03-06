public class Biblioteca {
    private Catalogo[] catalogo = new Catalogo[100];
    private int contador;

    public void registrar(Catalogo elemento){
        this.catalogo[contador] = elemento;
        contador++;
    }

    public Catalogo buscar(int codigo){
        for (Catalogo c:catalogo) {
            if (c.getId() == codigo){
                return c;
            }
        }
        return null;
    }

    private int buscar(Catalogo elemento){
        for (int i = 0; i < contador; i++) {
            if (catalogo[i].equals(elemento)){
                return i;
            }
        }

        return -1;
    }

    public boolean prestar(Alquilable elemento){
        int numero = buscar((Catalogo)elemento);
        if (numero < 0){
            return false;
        }

        if (!((Alquilable)catalogo[numero]).isAlquilado()){
            ((Alquilable)catalogo[numero]).setAlquilado(true);
            return true;
        }

        return false;
    }

    public boolean devolver(Alquilable elemento){
        int numero = buscar((Catalogo) elemento);

        if (numero < 0){
            return false;
        }

        if (((Alquilable)catalogo[numero]).isAlquilado()){
            ((Alquilable)catalogo[numero]).setAlquilado(false);
            return true;
        }

        return false;
    }

    public void reiniciarPrestamos(){
        for (int i = 0; i < contador; i++) {
            if (catalogo[i] instanceof Alquilable){
                ((Alquilable) catalogo[i]).setAlquilado(false);
            }
        }
    }

    public void monstrarCatalogo(){
        for (int i = 0; i < contador; i++) {
            System.out.println(catalogo[i]);
        }
    }
}
