public interface MusicStorage {
    boolean addMusic(String music);

    boolean deleteMusic(String music);

    String[] getAllMusic();
}
