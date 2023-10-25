package Retangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangle ret = new Retangle(10, 20);
        System.out.println("Base: " + ret.getBase() + " Height: "+ ret.getHeight());
        ret.setBase(240);
        ret.setHeight(120);
        System.out.println("Base: " + ret.getBase() + " Height: "+ ret.getHeight());
        System.out.println("Area: " + ret.calcArea());
        System.out.println("Diagonal: " + ret.calcDiagonal());
        System.out.println("Atributos: " + ret.toString());
    }
}
