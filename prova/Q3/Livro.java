package Q3;

public class Livro {
    private String titulo, autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    public String toString(){
        return "Título: " + this.titulo + " | Autor: " + this.autor + " | Ano de publicação: " + anoPublicacao;
    }

    public int getAno(){
        return this.anoPublicacao;
    }

    public String getAutor(){
        return this.autor;
    }
}
