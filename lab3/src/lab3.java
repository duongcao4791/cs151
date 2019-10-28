import java.awt.*;
import java.util.concurrent.RecursiveAction;

public class lab3 {
    public static void dumpArray(Object[] obj) {
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i].toString());
        }

    }

    public static void main(String[] args){
        Object[] obj = {("text"), 8, new Rectangle(50,80)};
        dumpArray(obj);
    }
}
