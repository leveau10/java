package Frete;

public class FreteAereo extends Frete{
    private double seguro;

    FreteAereo(double distancia, double peso, double seguro){
        super(distancia, peso);
        this.seguro = seguro;
    }

    public double getSeguro(){
        return this.seguro;
    }
    
    public double getFrete(){
        return (this.distancia * this.peso * 0.01) + (0.01 * getSeguro());
    }

    public String toString(){
        return "";
    }
}
