import java.awt.*;
import java.util.concurrent.RecursiveAction;

public class lab3 {
    public static void dumpArray(Object[] obj) {
        for (Object arr : obj) {
            System.out.println(arr.toString());
        }

    }

    public static void main(String[] args){
        Object[] obj = {"text", 8, new Rectangle(50,80),"Hello"};
        dumpArray(obj);
    }
}
