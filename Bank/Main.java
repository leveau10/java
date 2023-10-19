package Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Leo's Bank. Choose your operation:");
        System.out.println("0 - QUIT");
        System.out.println("1 - Deposit.");
        System.out.println("2 - Withdraw.");
        System.out.println("3 - PIX.");
        System.out.println("4 - See Balance.");
        String n = input.next();
        if(n.equals("0")){System.exit(0);}
        Bank bankOne = new Bank();
        float x = 0;
        while(!n.equals("0")){
            if(n.equals("1")){
                System.out.println("Deposit value:");
                x = input.nextFloat();
                bankOne.deposit(x);
            }else if(n.equals("2")){
                System.out.println("Withdraw value:");
                x = input.nextFloat();
                bankOne.withdraw(x);
            }else if(n.equals("3")){
                System.out.println("PIX Value:");
                x = input.nextFloat();
                bankOne.pix(x);
            }else if(n.equals("4")){
                System.out.println("Balance value:" + bankOne.getBalance());
            }
            n = input.next();
        }
        input.close();
    }
}
