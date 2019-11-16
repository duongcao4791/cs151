import java.awt.*;
import java.util.Arrays;


public class lab3 {

    public static void dumpArray(Object[] obj) {
        for(int i=0; i<obj.length;i++)
        {
            if(obj[i] instanceof int[]) {
                int[] oldArray = (int[]) obj[i];
                Integer[] newArray = new Integer[oldArray.length];
                int j=0;
                for (int value : oldArray) {
                    newArray[j++] = Integer.valueOf(value);
                }
                System.out.println(Arrays.deepToString(newArray));
            }
            else if(obj[i] instanceof double[]) {
                double[] oldArray = (double[]) obj[i];
                Double[] newArray = new Double[oldArray.length];
                int j=0;
                for (double value : oldArray) {
                    newArray[j++] = Double.valueOf(value);
                }
                System.out.println(Arrays.deepToString(newArray));
            }
            else if (obj[i] instanceof Object[] || obj[i] == null) {
                Object[] s = (Object[]) obj[i];
                System.out.println(Arrays.deepToString(s));
            }
            else
                System.out.println(obj[i].toString());
        }
    }
    public static void main(String[] args){
        Object[] obj = new Object[]{"text", 8, new Rectangle(50,80), new int[]{2,3,4,5},
                new double[]{3.58,8.1,7.2}, true, false, null};
        dumpArray(obj);
    }


}


