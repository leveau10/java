package ProjetoGerenciamentoEscolar;

public class Main {
   // map (aluno, nota),   na nota teria as três notas;

   public static void main(String[] args) {
    
    SistemaEscolar sistema = new SistemaEscolar();
    Professor professor1 = new Professor("Leonardo Reis Lucena");
    sistema.inserirProfessor(professor1);
    Disciplina disciplina1 = new Disciplina("Programação PO");
    sistema.inserirDisciplina(disciplina1);
    Disciplina disciplina2 = new Disciplina("Matemática Discreta");
    
    Aluno aluno1 = new Aluno("Leonardo Viana", "20231014040010");
    Notas notasAluno1 = new Notas();

    notasAluno1.setAvaliacaoUm(100);
    notasAluno1.setAvaliacaoDois(60);

    disciplina1.inserirAluno(aluno1, notasAluno1);
    disciplina2.inserirAluno(aluno1, notasAluno1);

    
    System.out.println( sistema.getNotas(aluno1));



    


   }
}
