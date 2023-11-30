package Figuras;

public class Cubo {
    private double lado;

    public Cubo(double lado){
        this.lado = lado;
    }

    public double getVolume(){
        return Math.pow(this.lado, 3.0);
    }
}
