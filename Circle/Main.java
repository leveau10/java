package Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();
        input.close();
        circle.setRadius(radius);
        System.out.println("Area: "+ circle.getArea() + " m²");
        System.out.println("Circumference: " + circle.getCircumference());

    }   


}
    
