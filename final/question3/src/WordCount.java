import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount extends Thread {

    private String filename;
    int count = 0;

    //Instructor
    public WordCount(String s) {
        filename = s;
    }

    @Override
    public void run() {
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(new FileInputStream(file));

            while (sc.hasNext())
            {
                count++;
                sc.next();
            }
            System.out.println(filename + ": " + count);

            question3.total += count;

        } catch (FileNotFoundException e) {
            System.out.println(filename + " not found!!!");
        }
    }

}