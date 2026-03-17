package march_17;

public class SavingAccount extends Account {

    SavingAccount(int accNo, String name, double balance){
        super(accNo, name, balance);
    }

    double calculateInterest(){
        return balance * 0.04;
    }

}