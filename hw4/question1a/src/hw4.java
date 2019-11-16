public class hw4 {
    public static void main(String []args){
        BankAccount account = new BankAccount();
        final double AMOUNT = 100;
        final int COUNT = 10;

        for (int i = 1; i<=COUNT; i++){

            Deposit d = new Deposit(account, AMOUNT, COUNT);
            Withdraw w = new Withdraw(account, AMOUNT, COUNT);

            Thread one = new Thread(d);
            Thread two = new Thread(w);

            one.start();
            two.start();
        }


    }
}
