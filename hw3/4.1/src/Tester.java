import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Tester {
   public static void main(String[] args){
      JFrame frame = new JFrame();
      frame.setPreferredSize(new Dimension(500,500));
      frame.setLayout(new GridLayout(2,1));
      AtomicInteger width = new AtomicInteger(100);
      JPanel panel = new JPanel();
      CarIcon car = new CarIcon(100);
      JLabel label = new JLabel(car);

      JButton in = new JButton("Zoom in");
      JButton out = new JButton(("Zoom out"));

      in.addActionListener(e -> {
         car.resize(width.addAndGet(-30));
         label.repaint();
      });
      out.addActionListener(e -> {
         car.resize(width.addAndGet(30));
         label.repaint();
      });

      panel.add(in);
      panel.add(out);

      frame.add(panel);
      frame.add(label);


      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);



   }
}