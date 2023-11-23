package Q1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        int media = (((a*2) + (b*3)) / 5);
        System.out.println("Média de " + a + " e " + b + " : " + media);
        input.close();
    }
}