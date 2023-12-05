package Orcamento;

public abstract class Item {
    private String descricao;
    private int qtd;

    Item(String descricao, int qtd){
        this.descricao = descricao;
        this.qtd = qtd;
    }

    public abstract double getPreco();

    public abstract String toString();
}
