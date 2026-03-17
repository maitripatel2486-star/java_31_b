package march_17;

public abstract class Account {

    int accountNumber;
    String holderName;
    double balance;

    Account(int accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    abstract double calculateInterest();

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display(){
        System.out.println("Acc No: " + accountNumber);
        System.out.println("Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

}