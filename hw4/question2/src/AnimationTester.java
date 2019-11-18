import java.awt.*;
import java.awt.event.*;
import java.util.jar.JarEntry;
import javax.swing.*;

/**
   This program implements an animation that moves
   a car shape.
*/
class Car extends Thread{
   public void run(MoveableShape shape, JLabel label, int time){
      try{
         shape.move();
         Thread.sleep(time);
         label.repaint();

      } catch (InterruptedException e){};
   }

}
public class AnimationTester
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

      Car c1 = new Car();
      Car c2 = new Car();
      Car c3 = new Car();
      Car c4 = new Car();

      Thread t1 = new Thread(c1);
      Thread t2 = new Thread(c2);
      Thread t3 = new Thread(c3);
      Thread t4 = new Thread(c4);

      Timer s1 = new Timer(1, event ->
      {
         c1.run(shape,car1,1);
      });
      s1.start();

      Timer s2 = new Timer(50, event ->
      {
         c2.run(shape,car2,50);
      });
      s2.start();

      Timer s3 = new Timer(200, event ->
      {
         c3.run(shape,car3,200);
      });
      s3.start();


      Timer s4 = new Timer(500, event ->
      {
         c4.run(shape,car4,500);
      });
      s4.start();

      t1.start();
      t2.start();
      t3.start();
      t4.start();



   }

   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
   int d1 = 100;
   int d2 = 1000;
   int d3 = 1;
   int d4 = 500;
}
