public class Withdraw implements Runnable {
    private static final int DELAY =100;
    private BankAccount account;
    private double amount;
    private int count;


    /*
     * Constructor
     */
    public Withdraw(BankAccount account, double amount, int count){
        this.account = account;
        this.amount = amount;
        this.count = count;
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                for (int i = 1; i <= count; i++) {
                    account.withdraw(amount);
                    Thread.sleep(DELAY);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
