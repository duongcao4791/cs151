public class BankAccount {
    private double balance;

    /*
     * Constructor
     */
    public BankAccount(){
        balance = 0;
    }


    public void deposit(double amount){
        System.out.println("Deposit " + amount);
        balance = balance + amount;
        System.out.println("New balance is " + balance);

    }

    public void withdraw(double amount){
        System.out.println("Withdraw " + amount);
        balance = balance - amount;
        System.out.println("New balance is " + balance);

    }
}