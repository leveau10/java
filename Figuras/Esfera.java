package Figuras;

public class Esfera extends Figura3D{
    private double raio;

    public Esfera(double raio){
        this.raio = raio;
    }
    
    public double getVolume(){
        return (4 * 3.14159265359 * Math.pow(this.raio, 3))/3;
    }

}
