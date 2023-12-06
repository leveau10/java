package Orcamento;

public class Material extends Item{
    private double precoCompra;
    private double lucro;

    Material(String descricao, int qtd, int lucro, double precoCompra){
        super(descricao, qtd);
        this.lucro = lucro;
        this.precoCompra = precoCompra;
    }

    @Override
    public double getPreco() { 
        return  this.qtd * precoCompra * (1 + (lucro/100));
    }

    @Override
    public String toString() {
        return "stringMaterial";
    }
}
