package march_17;

public class BankDemo {

    public static void main(String[] args) {

        Account acc[] = new Account[4];

        acc[0] = new SavingAccount(1,"Maitri",5000);
        acc[1] = new CurrentAccount(2,"foram",800);
        acc[2] = new SavingAccount(3,"keyur",7000);
        acc[3] = new CurrentAccount(4,"niyati",1500);

        System.out.println("----- Banking System -----");

        for(int i=0;i<acc.length;i++){

            acc[i].deposit(1000);
            acc[i].withdraw(500);

            double interest = acc[i].calculateInterest();
            acc[i].balance += interest;

            acc[i].display();
            System.out.println("--------------------");

        }

    }

}