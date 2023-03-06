public class MusicPlayer {
    MusicStorage musicStorage;

    public MusicPlayer(MusicStorageSystem musicStorageSystem) {
        this.musicStorage = musicStorageSystem;
    }

    public String anadir(String musica){
        if (musicStorage.addMusic(musica)){
            return "Añadida correctamente.";
        } else {
            return "No se puede añadir más música.";
        }
    }

    public String eliminar(String musica){
        if (musicStorage.deleteMusic(musica)){
            return "Borrada correctamente.";
        } else {
            return "No se ha podido borrar.";
        }
    }

    public String mostrar(){
        final StringBuilder sb = new StringBuilder();
        int contador = 1;
        for (String a:musicStorage.getAllMusic()) {
            if (a != null) {
                sb.append(contador).append(". ").append(a).append("\n");
                contador++;
            }
        }
        return sb.toString();
    }
}
