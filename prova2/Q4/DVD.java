package prova2.Q4;

import java.util.ArrayList;
import java.util.List;

public class DVD extends ItemBiblioteca implements Emprestavel{
    private List<String> diretores;
    boolean disponivel;

    public DVD(int id, String titulo, String diretor){
        super(id, titulo);
        this.disponivel = true;
        this.diretores = new ArrayList<>();
        diretores.add(diretor);
    }
    
    public void addDiretor(String diretor){
        diretores.add(diretor);
    }
    
    public String exibirDiretores(){
        String listaDiretores = "";
        listaDiretores = "Diretores de " + this.getTitulo() + ":\n";
        for (String diretor : diretores) {
            listaDiretores += diretor + "\n";
        }
        return listaDiretores;
    } 

    @Override
    public void emprestar() {
        this.disponivel = false;
    }

    @Override
    public void devolver() {
        this.disponivel = true;
    }

    @Override
    public boolean estaEmprestado() {
        if (disponivel) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }
}
