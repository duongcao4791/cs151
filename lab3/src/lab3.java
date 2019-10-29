import java.awt.*;
import java.util.Arrays;


public class lab3 {
    private final Object[] obj;

    public lab3(Object[] obj) {
        this.obj = obj;
    }
    public static void dumpArray(Object[] obj) {
        System.out.println(Arrays.deepToString(obj));
    }
    public static void main(String[] args){
        Object[] obj = new Object[]{"text", 8, new Rectangle(50,80), new Integer[]{2,3,4,5}, true, false, null};
        dumpArray(obj);
    }


}


