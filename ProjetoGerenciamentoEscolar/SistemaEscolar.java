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

    public String getBoletim(Aluno aluno){
        String notasAluno = "Boletim  \n";
        notasAluno += "Aluno: " + aluno.getNomeAluno() + " \n";
        notasAluno += "Matrícula " + aluno.getMatricula() + " \n";
        notasAluno +=  "_____________________________ \n";
        
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.isPresent(aluno)) {
                notasAluno += "-Disciplina: " + disciplina.getName() + "\n"; 
                notasAluno += "   -Av1: " + disciplina.getNotas(aluno).getAvaliacaoUm()  +"\n";
                notasAluno += "   -Av2: " + disciplina.getNotas(aluno).getAvaliacaoDois()+"\n";
                notasAluno += " -Média Parcial: " + disciplina.getMedia(aluno) +"\n";
                    if (disciplina.getMedia(aluno) >=60) {
                        notasAluno += "   -AvFinal: " + "0"+" \n";
                    }else{
                        notasAluno += "   -AvFinal: " + disciplina.getNotas(aluno).getAvaliacaoFinal() +" \n";
                        if (disciplina.getMedia(aluno) > disciplina.getMediaFinal(aluno)) {
                            notasAluno += " -Média Final: " + disciplina.getMedia(aluno) +" \n";
                        }else{
                            notasAluno += " -Média Final: " + disciplina.getMediaFinal(aluno) +" \n";
                        }
                    }
                if (disciplina.getMedia(aluno) >= 60 || disciplina.getMediaFinal(aluno) >= 60) {
                    notasAluno += " Situação: APROVADO \n";
                }else{
                    notasAluno += " Situação: REPROVADO \n";
                }
                notasAluno += " -----------------------\n";
            }
        }
        return notasAluno;
    }
}

