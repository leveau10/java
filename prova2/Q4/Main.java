package prova2.Q4;

public class Main {
    public static void main(String[] args) {
        Livro livroUm =  new Livro(1, "Morro dos Ventos Uivantes", "Emilly Bronte");
        livroUm.emprestar();
        System.out.println("LivroUm após emprestar: " + livroUm.estaEmprestado());
        livroUm.devolver();
        System.out.println("LivroUm após devolver: " + livroUm.estaEmprestado());
        livroUm.addAutor("Lucena");
        System.out.println(livroUm.exibirAutores());
        
        DVD dvdUm = new DVD(2, "Independece day", "Roland Emmerich");
        dvdUm.emprestar();
        System.out.println("DvdUm após emprestar: " + dvdUm.estaEmprestado());
        dvdUm.devolver();
        System.out.println("DvdUm após devolver: " + dvdUm.estaEmprestado());
        dvdUm.addDiretor("Jorgiano");
        System.out.println(dvdUm.exibirDiretores());
    }
} 
