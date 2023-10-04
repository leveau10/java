package Calculator;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Welcome to Leo's Calculator!");
        System.out.println("Type one of the operations below and then two numbers to begin:");
        System.out.println("0 - QUIT");
        System.out.println("1 - Sum");
        System.out.println("2 - Sub");
        System.out.println("3 - Mul");
        System.out.println("4 - Div");
        System.out.println("-----------------------------------------------------------------");
        String n = input.next();
        if(n.equals("0"))System.exit(0);
        float x = input.nextFloat();
        float y = input.nextFloat();
        calc.setValueOne(x);
        while(!n.equals("0")){
            if(n.equals("1")){
                calc.sum(y);
            }else if(n.equals("2")){
                calc.sub(y);
            }else if(n.equals("3")){
                calc.mul(y);
            }else if(n.equals("4")){
                calc.div(y);
            }

            System.out.println("What's the new operation?");
            System.out.println("Type the number of the operation and next number.");
            System.out.println("Actual value: "+ calc.getValue());
            n = input.next();
            if(n.equals("0"))System.exit(0);
            y = input.nextFloat();
        }
        input.close();
    }
}

