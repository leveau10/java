package Q3;

public class Biblioteca {
    private Livro[] estante;
    private int capacidade, livros;

    private String nome, endereco;

    public Biblioteca(String nome, String endereco){
        this.capacidade = 10;
        this.estante = new Livro[this.capacidade];
        this.livros = 0;
        this.nome = nome;
        this.endereco = endereco;
    }
    public void aumentarEstante(){
        this.capacidade += 100;
        Livro[] estanteTemp = new Livro[this.capacidade];
        for (int i = 0; i < livros; i++) {
            estanteTemp[i] = estante[i];
        }
        estante = estanteTemp;
        estanteTemp = null;
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro newLivro = new Livro(titulo, autor, anoPublicacao);
        if (this.livros == this.capacidade) {
            this.aumentarEstante();
        }
        estante[livros] = newLivro;
        this.livros++;
    }

    public void removerLivro(Livro livro){
        for (int i = 0; i < livros; i++) {
            if (livro == estante[i]) {
                estante[livros] = estante[i];
                estante[livros] = null;
                this.livros--;
            }       
        }
    }

    public Livro[] listarLivros(){
        return estante;
    }

    public int quantidadeLivros(){
        return this.livros;
    }

    public int quantidadeLivros(int ano){
        int qtd = 0;
        for (int i = 0; i < livros; i++) {
            if (estante[i].getAno() == ano) {
                qtd++;
            }
        }
        return qtd;
    }

    public String[] autores(){
        String[] autoresArray = new String[livros];
        for (int i = 0; i < livros; i++) {
            autoresArray[i] = estante[i].getAutor();
        }
        return autoresArray;
    }
    
}
