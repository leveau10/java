package Playlist;

public class Playlist {
    private Music[] playlist;
    private int capacidade, musicas;
    public Playlist(){
        this.capacidade = 10;
        this.musicas = 0;
        playlist = new Music[this.capacidade];
    }
    public void aumentarPlaylist(){
        this.capacidade += 100;
        Music[] playTemp = new Music[this.capacidade];
        for (int i = 0; i < musicas; i++) {
            playTemp[i] = playlist[i];
        }
        playlist = playTemp;
        playTemp = null;
    }
    public void inserir(Music m){
        playlist[this.musicas] = m;

    }
    public void inserir(String title, String artist, int length){
        if(this.musicas == this.capacidade){
            this.aumentarPlaylist();
        }
        Music m = new Music(title, artist, length);
        this.inserir(m);
        this.musicas++;
    }
    public void remover(Music m){
        for (int i = 0; i < musicas; i++) {
            if (m == playlist[i]) {
                playlist[i] = playlist[musicas];
                this.musicas--;
                playlist[musicas] = null;
            }
        }
    }
    public void listar(){
        System.out.println("Playlist:");
        for (int i = 0; i < this.musicas; i++) {
            System.out.println(playlist[i].ToString());
        }
    }
    public int tempoTotal(){
        int tempo = 0;
        for (int i = 0; i < this.musicas; i++) {
            tempo += playlist[i].getLength();
        }
        return tempo;
    }
}
