package Bank;

public class Bank {
    private float _balance = 0;

    void withdraw(float x){
        if(x <= _balance){
            _balance -= x;
            System.out.println("You just withdrew "+x+".");;
        }else{
            System.out.println("You have no balance for that. Try Again.");
        }
    }

    void deposit(float x){
        _balance += x;
        System.out.println("You deposited "+x+".");    
    }

    void pix(float x){
        if(x<=_balance){
            _balance -= x;
            System.out.println("You sent "+ x+".");
        }else{
            System.out.println("You have no balance for that. Try Again.");
        }
    }

    float getBalance(){
        return _balance;
    }
}
