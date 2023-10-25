package Equation;
import java.lang.Math;
public class Equation {
    private double delta;
    private double[] raizes;
    private int a, b, c;


    public Equation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.raizes = new double[2]; 
        this.calcDelta();
        this.calcRaizes();
    }

    private void calcDelta(){
        this.delta = (this.b*this.b) - (4*this.a*this.c);
    }

    private void calcRaizes(){
        this.raizes[0] = (((this.b*-1)+Math.sqrt(this.delta))/(2*this.a));
        this.raizes[1] = (((this.b*-1)-Math.sqrt(this.delta))/(2*this.a));
    }

    public String toString(){
        return this.a + "x²" + " + " + this.b +"x" + " + " + this.c  + "Delta: " + this.delta + " Raíz 1: " + this.raizes[0] + " Raíz 2: " + this.raizes[1] ; 
    }

}
