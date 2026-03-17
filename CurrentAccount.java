package march_17;

public class CurrentAccount extends Account {

    CurrentAccount(int accNo, String name, double balance){
        super(accNo, name, balance);
    }

    double calculateInterest(){
        if(balance < 1000){
            balance -= 500; // penalty
        }
        return 0;
    }

}