package Discipline;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Discipline disc = new Discipline();
        System.out.println("What's the name of the discipline?");
        String name = input.next();
        disc.setDiscName(name);

        System.out.println("First test:");
        int test = input.nextInt();
        disc.setTestOne(test);

        System.out.println("Second test:");
        test = input.nextInt();
        disc.setTestTwo(test);

        if(disc.approved()){
            System.out.println("You are approved!");
            input.close();
            System.exit(0);
        }else{
            System.out.println("You are not approved! Enter your final test:");
            test = input.nextInt();
            disc.setFinalTest(test);
            if(disc.finalApproved()){
                System.out.println("You are approved!");
            }else{
                System.out.println("You are reproved! Burrokkkkkk");
            }
        }
        input.close();
    }   
}
