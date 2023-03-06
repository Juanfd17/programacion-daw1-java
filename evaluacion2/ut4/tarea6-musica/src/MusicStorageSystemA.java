import java.lang.reflect.Array;
import java.util.Arrays;

public class MusicStorageSystemA extends MusicStorageSystem{
    public MusicStorageSystemA(int nCanciones) {
        super(nCanciones);
    }

    @Override
    public boolean addMusic(String music) {
        ComparadorMusica comparadorMusica = new ComparadorMusica();
        if (contador < musica.length){
            musica[contador] = music;
            Arrays.sort(musica, comparadorMusica);
            contador++;
            return true;
        }
        return false;
    }
}
