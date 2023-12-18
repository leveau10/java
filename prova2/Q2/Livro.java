package prova2.Q2;

public class Livro implements Imprimivel {
    private String nome;
    private String autor;
    private String ano;
    private String versao;

    @Override
    public String imprimir() {
        String impressao = "";
        impressao += "Livro: \nNome: " + this.getNome() + ".\nAutor: " + this.getAutor() + ".\nAno:" + this.getAno() + ".\nVersao: " + this.getVersao() + ".";
        return impressao;
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

    public void setAno(String ano){
        this.ano = ano;
    }

    public String getAno(){
        return this.ano;
    }

    public void setVersao(String versao){
        this.versao = versao;
    }

    public String getVersao(){
        return this.versao;
    }
}
