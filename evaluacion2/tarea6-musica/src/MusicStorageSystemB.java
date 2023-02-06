public class MusicStorageSystemB extends MusicStorageSystem{
    public MusicStorageSystemB(int nCanciones) {
        super(nCanciones);
    }

    @Override
    public boolean addMusic(String music) {
        if (contador < musica.length){
            musica[contador] = music;
            contador++;
            return true;
        } else {
            return false;
        }
    }
}
