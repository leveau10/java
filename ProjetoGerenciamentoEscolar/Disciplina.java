package ProjetoGerenciamentoEscolar;

import java.util.HashMap;
import java.util.Map;

public class Disciplina {
    private String name;
    private Map<Aluno, Notas> map;

    public Disciplina(String name){
        this.name = name;
        this.map = new HashMap<>();
    }
   
    public void setName(String name){
        this.name = name;
    }

    public void inserirAluno(Aluno aluno, Notas nota){
        this.map.put(aluno,nota);
    }
    
    public String getName(){
        return this.name;
    }  

}


 
    // private int getMedia(){
    //     int media = (notas.getAvaliacaoUm() *2 + notas.getAvaliacaoDois() * 3) / 5;
    //     return media;
    // }

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