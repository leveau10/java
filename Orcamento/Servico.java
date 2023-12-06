package Orcamento;

public class Servico extends Item{
    private int tempo;
    private int valorHora = 10;
    Servico(String descricao, int qtd, int tempo){
        super(descricao, qtd);
        this.tempo = tempo;
    }

    @Override
    public double getPreco() {
        return this.qtd *  (this.valorHora/(60.0/this.tempo)); //ajeitar fórmula
    }

    @Override
    public String toString() {
        
        return "stringServico";
    }
}
