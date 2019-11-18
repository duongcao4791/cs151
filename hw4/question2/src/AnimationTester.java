import java.awt.*;
import java.awt.event.*;
import java.util.jar.JarEntry;
import javax.swing.*;

/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester implements Runnable
{
   public static void main(String[] args)
   {

      JFrame frame = new JFrame();

      final MoveableShape shape
            = new CarShape(0, 0, CAR_WIDTH);

      ShapeIcon icon = new ShapeIcon(shape,
            ICON_WIDTH, ICON_HEIGHT);

      final JLabel car1 = new JLabel(icon);
      final JLabel car2 = new JLabel(icon);
      final JLabel car3 = new JLabel(icon);
      final JLabel car4 = new JLabel(icon);

      frame.setLayout(new GridLayout(4,1));
      frame.add(car1);
      frame.add(car2);
      frame.add(car3);
      frame.add(car4);


      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

      Thread c1 = new Thread((Runnable) car1);
      Thread c2 = new Thread((Runnable) car2);
      Thread c3 = new Thread((Runnable) car3);
      Thread c4 = new Thread((Runnable) car4);

      c1.start();
      c2.start();
      c3.start();
      c4.start();



   }

   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;

   @Override
   public void run() {
      final int DELAY = 100;
      // Milliseconds between timer ticks
      Timer t = new Timer(DELAY, event ->
      {
         shape.move();
         car.repaint();
      });
      t.start();

   }
}
