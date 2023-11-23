package Construtora;

public class Funcionario {
    
    private String nome;
    private String email;
    private String fone;

    public Funcionario(String nome, String email, String fone){
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getNome() {
        return this.nome;
    }
    public String getEmail() {
        return this.email;
    }
    public String getFone() {
        return this.fone;
    }

    public String toString(){
        return "Nome: " + this.nome + "|  E-mail: " + this.email + "|  Fone:" + this.nome;
    }
}


