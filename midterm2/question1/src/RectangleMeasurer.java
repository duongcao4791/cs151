import java.awt.Rectangle;
/**
 * RectangleMeasurer class
 * Get the area of the rectangle
 */
public class RectangleMeasurer implements Measurer {
    /**
     * @param obj - object
     * @return area - area of the rectangle
     */
    @Override
    public float measure(Object obj) {
        Rectangle r = (Rectangle) obj;
        float area = r.height * r.width;
        return area;
    }
}
