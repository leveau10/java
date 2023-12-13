package ProjetoGerenciamentoEscolar;

import java.util.List;

public class Aluno {
    private String name, matricula;

    public Aluno(String name, String matricula){
        this.name = name;
        this.matricula = matricula;
    }

    public String getNomeAluno(){
        return this.name;
    }
}
