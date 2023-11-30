package Figuras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Retangle ret = new Retangle(10, 20);
        Esfera esf = new Esfera(20);
        Cubo cub = new Cubo(12);
        System.out.println("Volume da esfera: " + esf.getVolume());
        System.out.println();
        System.out.println("Volume do cubo: " + cub.getVolume());
        input.close();
    }
}
