import java.lang.reflect.Array;

public class MusicStorageSystemA extends MusicStorageSystem{
    public MusicStorageSystemA(int nCanciones) {
        super(nCanciones);
    }

    @Override
    public boolean addMusic(String music) {
        if (contador < musica.length){
            for (int i = 0; i < contador +1; i++) {
                if (musica[i] == null){
                    musica[i] = music;
                    contador++;
                    return true;
                } else {
                    if (music.compareTo(musica[i]) <= 0){
                        for (int j = contador -1; j >= i; j--) {
                            musica[j +1] = musica[j];
                        }
                        musica[i] = music;
                        contador++;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
