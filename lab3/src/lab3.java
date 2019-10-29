import java.awt.*;
import java.util.Arrays;


public class lab3 {

    public static void dumpArray(Object[] obj) {
        for(int i=1; i<obj.length;i++)
        {
            if (obj[i] instanceof Object[] || obj[i] == null) {
                Object[] s = (Object[]) obj[i];
                System.out.println(Arrays.deepToString(s));
            }
            else
                System.out.println(obj[i].toString());
        }
    }
    public static void main(String[] args){
        Object[] obj = new Object[]{"text", 8, new Rectangle(50,80), new Integer[]{2,3,4,5},
                new Double[]{3.5,8.1,7.2}, true, false, null};
        dumpArray(obj);
    }


}


