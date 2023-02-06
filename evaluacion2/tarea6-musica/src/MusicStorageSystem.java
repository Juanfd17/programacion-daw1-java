public abstract class MusicStorageSystem implements MusicStorage{
    protected String[] musica;
    protected int contador;

    public MusicStorageSystem(int nCanciones) {
        this.musica = new String[nCanciones];
        this.contador = 0;
    }

    public boolean deleteMusic(String music) {
        for (int i = 0; i < contador; i++) {
            if (musica[i].equals(music)){
                musica[i] = null;
                for (int j = i; j < contador -1; j++) {
                    musica[j] = musica[j+1];
                }
                musica[contador -1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] getAllMusic() {
        return musica;
    }
}