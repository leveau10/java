package prova2.Q3;

public class Livro {
    private String nome;
    private String autor;
    private int ano;
    private String versao;

    public Livro(String nome, String autor, int ano, String versao){
        this.nome = nome;
        this.autor = autor;
        this.versao = versao;
        if (ano < 100) {
            throw new AnoPublicacaoInvalidoException("Somente permitido ano 100 ou maior.");
        }else{
            this.ano = ano;
        }
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return this.ano;
    }

    public void setVersao(String versao){
        this.versao = versao;
    }

    public String getVersao(){
        return this.versao;
    }
}
