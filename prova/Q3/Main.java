package Q3;

public class Main {
    public static void main(String[] args) {
        Biblioteca CamaraCascudo = new Biblioteca("Camara Cascudo", "Av. Hermes da Fonseca");
        CamaraCascudo.adicionarLivro("Potigol","Leonardo Reis", 2011);
        CamaraCascudo.adicionarLivro("Assembly","Eduardo Bráulio", 2011);
        CamaraCascudo.adicionarLivro("cMaisMais","Jorgiano Vidal", 2016);
        
        
        String[] autores = CamaraCascudo.autores();
        int tamanhoBiblioteca = CamaraCascudo.quantidadeLivros();
        System.out.println("Autores:");
        for (int i = 0; i < tamanhoBiblioteca; i++) {
            System.out.println(autores[i]);
        }
        
        System.out.println();
        System.out.println("Livros em 2011: " + CamaraCascudo.quantidadeLivros(2011));
        System.out.println();

        System.out.println("Livros do Acervo:");
        Livro [] livros = CamaraCascudo.listarLivros();
        for (int i = 0; i < tamanhoBiblioteca; i++) {
            System.out.println(livros[i].toString());
        }
    }
}
