package Retangle;
import java.lang.Math;

public class Retangle {
    private double base, height;

    public Retangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public void setBase(double base){
        this.base = base;
    }
    
    public void setHeight(double height){
        this.height = height;
    }

    public double getBase(){
        return this.base;
    }

    public double getHeight(){
        return this.height;
    }

    public double calcArea(){
        return this.base * this.height;
    }

    public double calcDiagonal(){
        double diag = 0;
        diag = Math.sqrt(Math.pow(this.base,2) + Math.pow(this.height,2));
        return diag;
    }

    public String toString(){
        return "Base: " + this.base + " Altura: " + this.height;
    }

}
