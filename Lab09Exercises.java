import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab09Exercises {
	 
	 public static void main(String[] args) {
		 
       String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/" + map + ".map");
		 Display.setSize(10, 10);
		 Display.setSpeed(10);
       
       Athlete athena = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
       
       int a = 0; int b = 0; int c = 0; int d = 0;
       
       while (athena.nextToABeeper())
      {
       athena.pickBeeper();
       athena.move();
       a++;
      }
       athena.turnAround();
       for (int k = 1; k <= a; k++)
      {
       athena.move();
      }
       athena.turnLeft();
       athena.move();
       athena.turnLeft();
       
       while (athena.nextToABeeper())
      {
       athena.pickBeeper();
       athena.move();
       b++;
      }
       athena.turnAround();
       for (int l = 1; l <= b; l++)
      {
       athena.move();
      }
       athena.turnLeft();
       athena.move();
       athena.turnLeft();
       
       while (athena.nextToABeeper())
      {
       athena.pickBeeper();
       athena.move();
       c++;
      }
       athena.turnAround();
       for (int m = 1; m <= c; m++)
      {
       athena.move();
      }
       athena.turnLeft();
       athena.move();
       athena.turnLeft();
       
       while (athena.nextToABeeper())
      {
       athena.pickBeeper();
       athena.move();
       d++;
      }
       athena.turnAround();
       for (int n = 1; n <= d; n++)
      {
       athena.move();
      }
      
       athena.turnRight();
       athena.move();
       athena.move();
       athena.move();
       athena.turnRight();
       athena.move();
       athena.move();
       athena.move();
       athena.turnRight();
       
       for (int o = 1; o <= a; o++)
      {
       athena.putBeeper();
       athena.move();
      }
       athena.turnAround();
       for (int p = 1; p <= a; p++)
      {
       athena.move();
      }
       athena.turnLeft();
       athena.move();
       athena.turnLeft();
       
       for (int q = 1; q <= b; q++)
      {
       athena.putBeeper();
       athena.move();
      }
       athena.turnAround();
       for (int r = 1; r <= b; r++)
      {
       athena.move();
      }
       athena.turnLeft();
       athena.move();
       athena.turnLeft();
       
       for (int s = 1; s <= c; s++)
      {
       athena.putBeeper();
       athena.move();
      }
       athena.turnAround();
       for (int t = 1; t <= c; t++)
      {
       athena.move();
      }
       athena.turnLeft();
       athena.move();
       athena.turnLeft();
       
       for (int u = 1; u <= d; u++)
      {
       athena.putBeeper();
       athena.move();
      }
       athena.turnAround();
       for (int v = 1; v <= d; v++)
      {
       athena.move();
      }
      
   }
}