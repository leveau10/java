package ProjetoGerenciamentoEscolar;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    
    SistemaEscolar sistema = new SistemaEscolar();

    System.out.println("Sistema de gerenciamento de notas escolar");
    System.out.println("_______________________________________");
    System.out.println("Regras:");
    System.out.println("-Apenas professores podem cadastrar Disciplinas.");
    System.out.println("-Só é possível cadastrar um professor por Disciplina.");
    System.out.println("-Cada disciplina adimite duas notas e caso o aluno não obtenha 60 ou mais, uma nova nota poderá ser cadastada.");
    System.out.println("_______________________________________");

    int controle = 0;
    Scanner input = new Scanner(System.in);
    while (controle != 10 ) {
      System.out.println("Ações possíveis:");

      System.out.println("1 - Cadastrar Professor");
      System.out.println("2 - Cadastrar Disciplina");
      System.out.println("3 - Cadastrar Aluno");
      System.out.println("4 - Inserir Aluno em Disciplina");
      System.out.println("5 - Remover Aluno em Disciplina");
      System.out.println("9 - Mostrar boletim de aluno");
      System.out.println("10 - Sair do sistema");
      System.out.println("_______________________________________");
      controle = input.nextInt();
      if (controle == 1) {
         System.out.println("Informe o nome do professor:");input.nextLine();
         String nomeProfessor;
         nomeProfessor = input.nextLine();
         Professor professor = new Professor(nomeProfessor);

         sistema.inserirProfessor(professor);

         System.out.println("Professor " + nomeProfessor + " cadastrado com sucesso!");
         
      }else if(controle == 2){
         System.out.println("Informe o nome da Disciplina:");input.nextLine();
         String nomeDisciplina = input.nextLine();
         Disciplina disciplina = new Disciplina(nomeDisciplina);
         System.out.println("Disciplina " + nomeDisciplina + " cadastrada com sucesso!");
         sistema.inserirDisciplina(disciplina);
        

      }else if(controle == 3){
         System.out.println("Informe o nome do Aluno:");input.nextLine();
         String nomeAluno = input.nextLine();
         System.out.println("Informe o número da Matrícula:");
         String matriculaAluno = input.nextLine();
         Aluno aluno = new Aluno(nomeAluno, matriculaAluno);
         sistema.inserirAluno(aluno);
         System.out.println("Aluno " + nomeAluno + " cadastrado com sucesso!");

      }else if(controle == 4){
         System.out.println(sistema.listarAlunos());
         System.out.println("--------------------------");
         System.out.println("Informe a matrícula do aluno:");input.nextLine();
         String matriculaAluno = input.nextLine();

         System.out.println(sistema.listarDisciplinas());
         System.out.println("--------------------------");
         System.out.println("Informe a Disciplina:");
         String nomeDisciplina = input.nextLine();
         System.out.println(nomeDisciplina);


         Notas notas = new Notas(0, 0);
         sistema.getDisciplina(nomeDisciplina).inserirAluno(sistema.getAluno(matriculaAluno), notas);


      }else if(controle == 9){
         System.out.println(sistema.listarAlunos());
         System.out.println("--------------------------");
         System.out.println("Informe a matrícula do aluno:");input.nextLine();
         String matriculaAluno = input.nextLine();

         sistema.getBoletim(sistema.getAluno(matriculaAluno));
      }else{
         System.out.println("Opção inválida! Tente novamente");
      }
   //  }
   //  System.out.println("Ações possíveis:");
   //  System.out.println("1 - Cadastrar Professor");
   //  System.out.println("2 - Cadastrar Disciplina");
   //  System.out.println("3 - Cadastrar Aluno");
   //  System.out.println("4 - Sair do sistema");
   //  System.out.println("_______________________________________");
   //  Professor professor1 = new Professor("Leonardo Reis Lucena");
   //  sistema.inserirProfessor(professor1);
   //  Disciplina disciplina1 = new Disciplina("Programação Orientada a Objetos", professor1);
   //  sistema.inserirDisciplina(disciplina1);
   //  Disciplina disciplina2 = new Disciplina("Matemática Discreta", professor1);
   //  sistema.inserirDisciplina(disciplina2);
    
   //  Aluno aluno1 = new Aluno("Leonardo Viana", "20231014040010");
   //  Notas notasAluno1 = new Notas(59,60);
   
   //  disciplina1.inserirAluno(aluno1, notasAluno1);
   //  disciplina2.inserirAluno(aluno1, notasAluno1);
   //  disciplina1.inserirNotaFinal(aluno1, 100);
   //  disciplina1.removerAluno(aluno1);

   //  System.out.println( sistema.getBoletim(aluno1));
      }
   }
}
