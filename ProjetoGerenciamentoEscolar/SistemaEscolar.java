package ProjetoGerenciamentoEscolar;

import java.util.ArrayList;
import java.util.List;

public class SistemaEscolar {
    private List<Professor> professores;
    private List<Disciplina> disciplinas;

    public SistemaEscolar(){
        this.professores = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }
    public void inserirDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public void removerDiscplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }

    public void inserirProfessor(Professor professor){
        professores.add(professor);
    }

    public void removeProfessor(Professor professor){
        professores.remove(professor);
    }

    public String getNotas(Aluno aluno){
        String notasAluno = "Notas de " + aluno.getNomeAluno() + " | ";
        for (Disciplina disciplina : disciplinas) {
            notasAluno += "Nota Av1: ";

        }

        return notasAluno;
    }

    
}

