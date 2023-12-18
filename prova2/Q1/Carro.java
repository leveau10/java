package prova2.Q1;

public class Carro extends Veiculo{
    private String ano;

    public Carro(String marca, String modelo, String ano){
        super(marca, modelo);
        this.ano = ano;
    }

    public void setAno(String ano){
        this.ano = ano;
    }

    public String getAno(){
        return this.ano;
    }

    public String exibirInformacoes(){
        String informacoes = "";
        informacoes += "Informacoes do carro: \n" + "Modelo: " + this.getModelo() + ".\n" + "Marca: " + this.getMarca() + ".\n" + "Ano: " + this.getAno() + ".\n";

        return informacoes;
    }
}
