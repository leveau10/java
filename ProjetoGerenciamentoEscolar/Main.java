package ProjetoGerenciamentoEscolar;

public class Main {
   // map (aluno, nota),   na nota teria as três notas;

   public static void main(String[] args) {
    
    SistemaEscolar sistema = new SistemaEscolar();
    Professor professor1 = new Professor("Leonardo Reis Lucena");
    sistema.inserirProfessor(professor1);
    Disciplina disciplina1 = new Disciplina("Programação Orientada a Objetos");
    sistema.inserirDisciplina(disciplina1);
    Disciplina disciplina2 = new Disciplina("Matemática Discreta");
    sistema.inserirDisciplina(disciplina2);
    
    Aluno aluno1 = new Aluno("Leonardo Viana", "20231014040010");
    Notas notasAluno1 = new Notas(59,60);
   
    disciplina1.inserirAluno(aluno1, notasAluno1);
    disciplina2.inserirAluno(aluno1, notasAluno1);
    disciplina1.inserirNotaFinal(aluno1, 0);
    disciplina1.removerAluno(aluno1);

    
    System.out.println( sistema.getBoletim(aluno1));



    


   }
}
