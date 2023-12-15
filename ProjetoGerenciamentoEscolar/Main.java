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
         System.out.println("6 - Atribuir Professor em Disciplina");
         System.out.println("7 - Remover Professor em Disciplina");
         System.out.println("8 - Adicionar notas em Disciplina");
         System.out.println("9 - Alterar notas em Disciplina");
         System.out.println("10 - Mostrar boletim de aluno");
         System.out.println("11 - Sair do sistema");
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


            Notas notas = new Notas(0, 0);
            sistema.getDisciplina(nomeDisciplina).inserirAluno(sistema.getAluno(matriculaAluno), notas);

            System.out.println("Aluno inserido com sucesso!");

         }else if(controle == 5){
            System.out.println(sistema.listarAlunos());
            System.out.println("--------------------------");
            System.out.println("Informe a matrícula do aluno:");input.nextLine();
            String matriculaAluno = input.nextLine();

            System.out.println(sistema.listarDisciplinas());
            System.out.println("--------------------------");
            System.out.println("Informe a Disciplina:");
            String nomeDisciplina = input.nextLine();

            sistema.getDisciplina(nomeDisciplina).removerAluno(sistema.getAluno(matriculaAluno));

            System.out.println("Aluno removido com sucesso!");
         }else if(controle == 6){
            System.out.println(sistema.listarProfessores());
            System.out.println("--------------------------");
            System.out.println("Informe o nome do Professor:");input.nextLine();
            String nomeProfessor = input.nextLine();

            System.out.println(sistema.listarDisciplinas());
            System.out.println("--------------------------");
            System.out.println("Informe a Disciplina:");
            String nomeDisciplina = input.nextLine();

            sistema.getDisciplina(nomeDisciplina).setProfessor(sistema.getProfessor(nomeProfessor));

            System.out.println("Professor atribuído à disciplina com sucesso!");
         }else if(controle == 7){
            System.out.println(sistema.listarProfessores());
            System.out.println("--------------------------");
            System.out.println("Informe o nome do Professor:");input.nextLine();
            String nomeProfessor = input.nextLine();

            System.out.println(sistema.listarDisciplinas());
            System.out.println("--------------------------");
            System.out.println("Informe a Disciplina:");
            String nomeDisciplina = input.nextLine();

            sistema.getDisciplina(nomeDisciplina).removeProfessor(sistema.getProfessor(nomeProfessor));

            System.out.println("Professor removido da disciplina com sucesso!");
         }else if(controle == 8 || controle == 9){
            System.out.println(sistema.listarAlunos());
            System.out.println("--------------------------");
            System.out.println("Informe a matrícula do aluno:");input.nextLine();
            String matriculaAluno = input.nextLine();

            System.out.println(sistema.listarDisciplinas());
            System.out.println("--------------------------");
            System.out.println("Informe a Disciplina:");
            String nomeDisciplina = input.nextLine();

            System.out.println("Informe a primeira nota entre 0 e 100:");
            Integer nota1 = input.nextInt();
            System.out.println("Informe a segunda nota entre 0 100:");
            Integer nota2 = input.nextInt();

            sistema.getDisciplina(nomeDisciplina).getNotas(sistema.getAluno(matriculaAluno)).setAvaliacaoUm(nota1);
            sistema.getDisciplina(nomeDisciplina).getNotas(sistema.getAluno(matriculaAluno)).setAvaliacaoDois(nota2);

            if (sistema.getDisciplina(nomeDisciplina).getMedia(sistema.getAluno(matriculaAluno)) < 60) {
               System.out.println("O aluno não atingiu nota 60. Informe a nota da avaliação final:");
               Integer notaFinal = input.nextInt();
               sistema.getDisciplina(nomeDisciplina).getNotas(sistema.getAluno(matriculaAluno)).setAvaliacaoFinal(notaFinal);
               if (sistema.getDisciplina(nomeDisciplina).getMediaFinal(sistema.getAluno(matriculaAluno)) < 60) {
                  System.out.println("O aluno não atingiu nota 60 e foi reprovado.");
               }else{
                  System.out.println("Notas cadastradas com sucesso! O aluno foi aprovado.");
               }
            }else{
               System.out.println("Notas cadastradas com sucesso! O aluno foi aprovado.");
            }

         }
         else if(controle == 10){
            
            System.out.println(sistema.listarAlunos());
            System.out.println("--------------------------");
            System.out.println("Informe a matrícula do aluno:");input.nextLine();
            String matriculaAluno = input.nextLine();

            System.out.println(sistema.getBoletim(sistema.getAluno(matriculaAluno)));
         }else{
            System.out.println("Opção inválida! Tente novamente");
         }
      }
   }
}
