package Orcamento;

public class Servico extends Item{
    private int tempo;
    private int valorHora = 10;
    Servico(String d, int t, int q){
        super(d, q);
        this.tempo = t;
    }

    @Override
    public double getPreco() {
        return valorHora * tempo;
    }

    @Override
    public String toString() {
        
        return "stringServico";
    }


}
