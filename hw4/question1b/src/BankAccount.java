public class BankAccount {
    private double balance;

    /*
     * Constructor
     */
    public BankAccount(){
        balance = 0;
    }

    public double getBalance(){
        return balance;
    }


    public synchronized void deposit(double amount){
        System.out.print("Deposit " + amount);
        balance = balance + amount;
        System.out.println(", New balance is " + balance);

    }

    public synchronized void withdraw(double amount){
            System.out.print("Withdraw " + amount);
            if (balance<amount){
            System.out.println(" Account is overdrawn, cannot withdraw!!!");
            }
            else {
                balance = balance - amount;
                System.out.println(", New balance is " + balance);
        }

    }
}