package Playlist;

public class Music {
    private String title, artist;
    private int length;

    public Music(String title, String artist, int length){
        this.title = title;
        this.artist = artist;
        this.length = length;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public void setLength(int length){
        this.length = length;
    }
    public String getTitle(){
        return this.title;
    }
    public String getArtist(){
        return this.artist;
    }
    public int getLength(){
        return this.length;
    }
    public String ToString(){
        return "Nome: "+ getTitle() + " | Artista: " + getArtist() + " | Duração: " + getLength();
    }


}
