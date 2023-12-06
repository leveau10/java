package Orcamento;

public abstract class Item {
    protected String descricao;
    protected int qtd;

    Item(String descricao, int qtd){
        this.descricao = descricao;
        this.qtd = qtd;
    }

    public abstract double getPreco();

    public abstract String toString();
}
