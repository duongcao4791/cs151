import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Tester {
   public static void main(String[] args){
      //Create the Jframe
      JFrame frame = new JFrame();
      frame.setPreferredSize(new Dimension(500,500));
      frame.setLayout(new GridLayout(2,1));

      //Create Actomic variable width for changing the size
      AtomicInteger width = new AtomicInteger(100);

      //Create car label
      CarIcon car = new CarIcon(100);
      JLabel label = new JLabel(car);

      //Create JButton for Zoom in and Zoom out
      JButton in = new JButton("Zoom in");
      JButton out = new JButton(("Zoom out"));

      //AddActionListener
      in.addActionListener(e -> {
         car.resize(width.addAndGet(-30));
         label.repaint();
      });
      out.addActionListener(e -> {
         car.resize(width.addAndGet(30));
         label.repaint();
      });

      //Create JPanel
      JPanel panel = new JPanel();
      panel.add(in);
      panel.add(out);

      frame.add(panel);
      frame.add(label);


      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);



   }
}