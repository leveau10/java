package Playlist;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.inserir("Reckoning Day", "Megadeth", 300);
        playlist.inserir("A Tout Le Monde", "Megadeth", 342);
        playlist.listar();
        System.out.println("Duração da Playlist: " + playlist.tempoTotal());
    }
}
