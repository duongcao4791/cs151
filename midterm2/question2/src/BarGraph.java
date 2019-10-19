import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * BarGraph Class
 * draws a bar graph showing the values of the numbers
 * redraw the graph when the numbers is edited
 */
public class BarGraph extends JFrame implements ChangeListener
{
    private ArrayList arr;
    private DataModel dataModel;
    JFrame frame = new JFrame();

    /**
     * Create BarGraph
     * @param data - numbers
     */
    public BarGraph(DataModel data)
    {
        //Store data in a model
        dataModel = data;
        arr = dataModel.getData();

        //Create barIcon
        Icon barIcon = new Icon()
        {
            /**
             * @return the width of icon
             */
            public int getIconWidth()
            {
                return 20;
            }

            /**
             * @return the height of icon
             */
            public int getIconHeight()
            {
                return 200;
            }

            /**
             * paintIcon method
             * @param c - component
             * @param g - graphics
             * @param x - dimension
             * @param y - dimension
             */
            public void paintIcon(Component c, Graphics g, int x, int y)
            {
                Graphics2D g2 = (Graphics2D)g;
                g2.setColor(Color.blue);

                //print one bar for a number in array list
                for (int i = 0; i< arr.size(); i++)
                {
                    double barWidth = getIconWidth();   //generate the width of the bar
                    double value = (int) arr.get(i);    //value of the bar
                    double barHeight = (double) getIconHeight() * (value/100);  //the height of the bar
                    x = (int) (barWidth + 30*i);        //set x
                    y = (int) (200 - (barHeight/2));    //set y
                    Rectangle2D.Double rect = new Rectangle2D.Double(x, y, barWidth, barHeight);
                    g2.fill(rect);                      //draw rectangle as a bar
                    String s = String.format("%.0f", value);    //format value
                    g2.drawString(s, x+2,y-5);    //draw value for each bar
                }

            }
        };

        //add JLabel bar to the frame
        JLabel bar = new JLabel(barIcon);
        frame.setLocation(400, 200);
        frame.setPreferredSize(new Dimension(250,400));
        frame.add(bar);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * stateChanged of ChangeListener implementation
     * @param e - event
     */
    public void stateChanged(ChangeEvent e)
    {
        arr = dataModel.getData();
        frame.repaint();
    }
}
