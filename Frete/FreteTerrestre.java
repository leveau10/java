package Frete;

public class FreteTerrestre extends Frete{
    FreteTerrestre(double distancia, double peso){
        super(distancia, peso);
    }

    public double getFrete(){
        return this.distancia * this.peso * 0.01;
    }

    public String toString(){
        return "";
    }
}
