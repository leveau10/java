package Q2;

public class Pais {
    private String nome;
    private double area;
    private int populacao;

    public Pais(String nome, double area, int populacao){
        this.nome = nome;
        this.area = area;
        this.populacao = populacao;
    }

    public double densidade(){
        double densidade = this.populacao/this.area;
        return densidade;
    }
    public String toString(){
        return "Nome: " + this.nome + " |  Densidade: " + this.densidade();
    }
}

