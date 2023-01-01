public class Main {

    public static void main(String[] args) {
        Mascota sanchez = new Perro(47,"Socialista","Moreno","PerroSanchez",true);
        Mascota rex = new Perro("Pastor aleman", "Verde","Rex, un policia diferente");
        Mascota cambio;

        Gato doreamon = new Gato();
        doreamon.comer();
        rex.comer();

        cambio = sanchez;
        sanchez = rex;
        rex = cambio;

        ((Perro) rex).imprimierDetalles();
        ((Perro)sanchez).imprimierDetalles();
    }
}