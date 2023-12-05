package Orcamento;

public class Material extends Item{
    private double precoCompra;
    private int lucro;

    Material(String descricao, double precoCompra, int qtd, int lucro){
        super(descricao, qtd);
        this.lucro = lucro;
        this.precoCompra = precoCompra;
    }

    @Override
    public double getPreco() {
        return precoCompra * (1 + (lucro/100));
    }

    @Override
    public String toString() {
        return "stringMaterial";
    }
}
