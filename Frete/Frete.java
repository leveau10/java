package Frete;

public abstract class Frete {
    protected double distancia;
    protected double peso;

    Frete(double distancia, double peso){
        this.distancia = distancia;
        this.peso = peso;
    }

    public abstract double getFrete();

    public abstract String toString();
}
