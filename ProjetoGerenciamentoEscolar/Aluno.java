package ProjetoGerenciamentoEscolar;

public class Aluno {
    private String name, matricula;

    public Aluno(String name, String matricula){
        this.name = name;
        this.matricula = matricula;
    }

    public String getNomeAluno(){
        return this.name;
    }

    public String getMatricula(){
        return this.matricula;
    }
}
