public class Deposit implements Runnable {
    private static final int DELAY =100;
    private BankAccount account;
    private double amount;
    private int count;


    /*
     * Constructor
     */
    public Deposit(BankAccount account, double amount, int count){
        this.account = account;
        this.amount = amount;
        this.count = count;
    }

    @Override
    public void run() {
        try{
            for (int i = 1; i<=count; i++){
                account.deposit(amount);
                Thread.sleep(DELAY);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
