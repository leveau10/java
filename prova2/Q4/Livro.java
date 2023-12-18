package prova2.Q4;

import java.util.ArrayList;
import java.util.List;

public class Livro extends ItemBiblioteca implements Emprestavel{
    private List<String> autores;
    boolean disponivel;

    public Livro(int id, String titulo, String autor){
        super(id, titulo);
        this.disponivel = true;
        this.autores = new ArrayList<>();
        autores.add(autor);
    }
    
    public void addAutor(String autor){
        autores.add(autor);
    }
    
    public String exibirAutores(){
        String listaAutores = "";
        listaAutores = "Autores de " + this.getTitulo() + ":\n";
        for (String autor : autores) {
            listaAutores += autor + "\n";
        }
        return listaAutores;
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
