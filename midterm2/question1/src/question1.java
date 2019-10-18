import java.awt.Rectangle;

/**
 * Test class
 */
public class question1 {
    public static void main(String args[]){

        //Create Rectangle array
        Rectangle[] rect = new Rectangle[7];
        rect[0] = new Rectangle(3,4);
        rect[1] = new Rectangle(4,5);
        rect[2] = new Rectangle(7,3);
        rect[3] = new Rectangle(4,6);
        rect[4] = new Rectangle(8,2);
        rect[5] = new Rectangle(10,4);
        rect[6] = new Rectangle(6,6);


        //declare Measurer m
        RectangleMeasurer m = new RectangleMeasurer();

        //Get the maximum object in the array
        Rectangle maxObj = (Rectangle)maximum(rect,m);

        //Print out the Rectangle with largest area
        System.out.println("Largest Area: "+m.measure(maxObj));
        System.out.println("Rectangle's dimension"+ "\nWidth: " + maxObj.getWidth() + "\nHeight: " + maxObj.getHeight());

    }

    /**
     * Computes the object in the array with the largest measure.
     * @param o - object array
     * @param m - measurer
     * @return
     */
    public static Object maximum(Object[] o, Measurer m){
        Object obj = null;
        float max = 0;
        for(int i = 0; i< o.length; i++){
            if(max < m.measure(o[i])) {
                max = m.measure((o[i]));
                obj = o[i];
            }
        }
        return obj;
    }
}
