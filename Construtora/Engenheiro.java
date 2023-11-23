package Construtora;

public class Engenheiro extends Funcionario{
    private String crea;
    
    public Engenheiro(String nome, String email, String fone, String crea){
        super(nome, email, fone);
        this.crea = crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public String getCrea() {
        return this.crea;
    }

    public String toString(){
        return "Nome: " + super.getNome()+ "|  E-mail: " + super.getEmail() + "|  Fone:" + super.getFone() + "|  CREA: " + this.crea;
    }
}
