package Frete;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        FreteAereo freteA = new FreteAereo(10, 10, 10);
        FreteTerrestre freteT = new FreteTerrestre(10, 10);
        System.out.println("Frete Aereo: " + freteA.getFrete());
        System.out.println();
        System.out.println("Frete Terrestre: " + freteT.getFrete());
        input.close();
    }
}
