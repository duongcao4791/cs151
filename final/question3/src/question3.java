public class question3 {
    static int total = 0;

    public static void main(String[] args) {
        WordCount w[] = new WordCount[args.length];

        try {
            if (args.length != 0) {
                for (int i = 0; i < args.length; i++) {
                    w[i] = new WordCount(args[i]);
                    w[i].start();
                    w[i].join();
                }

                System.out.println("Total words: " + total);

            }
            else {
                throw new IllegalAccessException();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("Wrong input: No file selectedgit \n" + "Please enter correct form: java question3 filename1.txt filename2.txt ...");
        }
    }
}