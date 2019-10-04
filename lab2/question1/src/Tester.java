import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      

      final int SIZE = 20;
      CircleIcon circle = new CircleIcon(SIZE);
      
      JLabel label = new JLabel(circle);
      JButton redButton = new JButton("Repaint Red");
      redButton.addActionListener(event->{circle.repaint(Color.RED);label.repaint();});
      
      JButton blueButton = new JButton("Repaint Blue");
      blueButton.addActionListener(event->{circle.repaint(Color.BLUE);label.repaint();});
     
      JButton greenButton = new JButton("Repaint Green");
      greenButton.addActionListener(event->{circle.repaint(Color.GREEN);label.repaint();});

      
      frame.setLayout(new FlowLayout());

      frame.add(redButton);
      frame.add(blueButton);
      frame.add(greenButton);
      frame.add(label);
      

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
   
}
