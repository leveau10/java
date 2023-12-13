package ProjetoGerenciamentoEscolar;

import java.util.HashMap;
import java.util.Map;

public class Disciplina {
    private String name;
    private Professor professor;
    private Map<Aluno, Notas> map;

    public Disciplina(String name, Professor professor){
        this.name = name;
        this.professor = professor;
        this.map = new HashMap<>();
    }
   
    public Disciplina(String name){
        this.name = name;
        this.professor = null;
        this.map = new HashMap<>();
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }  

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

     public Professor getProfessor(){
        return this.professor;
    }

    public boolean isPresent(Aluno aluno){
        if (this.map.containsKey(aluno)) {
            return true;
        }
        return false;
    }
    public void inserirAluno(Aluno aluno, Notas nota){
        this.map.put(aluno,nota);
    }

    public void removerAluno(Aluno aluno){
        this.map.remove(aluno);
    }
    

    public Notas getNotas(Aluno aluno){
        return map.get(aluno);
    }
    
    public Integer getMedia(Aluno aluno){
        Notas notas = map.get(aluno);
        Integer media = (notas.getAvaliacaoUm() * 2 + notas.getAvaliacaoDois() *3) /5;
        return media;
    }

    public void inserirNotaFinal(Aluno aluno, Integer notaFinal){
        Notas notas = map.get(aluno);
        notas.setAvaliacaoFinal(notaFinal);
    }

    public Integer getMediaFinal(Aluno aluno){
        Notas notas = map.get(aluno);
        Integer mediaFinal = (this.getMedia(aluno) + notas.getAvaliacaoFinal()) / 2;
        return mediaFinal;
    }

}   
    // private int getMediaFinal(){
    //     int mediaFinal = (this.getMedia() + this.notas.getAvaliacaoFinal()) / 2 ;
    //     return mediaFinal;
    // }

    // public boolean aprovado(){
    //     if(this.getMedia() >= 60){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }

    // public boolean aprovadoFinal(){
    //     if (this.getMediaFinal() >= 60) {
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }