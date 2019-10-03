import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Hashtable;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
 
public class Tester {
 
    public static void main(String[] args) {
        // Create and set up a frame window
        JFrame frame = new JFrame("Question 2");
        frame.setPreferredSize(new Dimension(300, 300));
        frame.setLayout(new GridLayout(2, 1));
        
        
         
        // Set the panel to add buttons
        JPanel panel1 = new JPanel();
        
        //Set the car
        CarIcon car = new CarIcon(100);
        JLabel label = new JLabel(car); 
        
        
        // Set the slider
        JSlider slider = new JSlider(0,20,10);
        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
         
        // Set the labels to be painted on the slider
        slider.setPaintLabels(true);
         
        // Add positions label in the slider
        Hashtable<Integer, JLabel> position = new Hashtable<Integer, JLabel>();
        position.put(0, new JLabel("0"));
        position.put(5, new JLabel("5"));
        position.put(10, new JLabel("10"));
        position.put(15, new JLabel("15"));
        position.put(20, new JLabel("20"));
         
        // Set the label to be drawn
        slider.setLabelTable(position);
         
        // Add change listener to the slider
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
            JSlider source = (JSlider)e.getSource();
            int width = (int) source.getValue();
            car.resize(10*width);
            label.repaint();
            }
        });
       
        
        // Add the slider to the panel
        panel1.add(slider);
         
        // Set the window to be visible as the default to be false
        frame.add(panel1);
        frame.add(label);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
 
    }
 
}