/**
 * A robot moves along a row, collecting piles of beepers and placing them one square to
 * the right.
 * 
 * @author Shaurya Prakash
 * @version 20/11/2014
 *
 */

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab09Alternative {
	 
	 public static void main(String[] args) {
		 
       String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/" + map + ".map");
		 Display.setSize(10, 10);
		 Display.setSpeed(10);
       
       Athlete athena = new Athlete(1, 1, Display.EAST, 0);
		 
       int count1 = 0; int count2 = 0; int count3 = 0; int count4 = 0; int count5 = 0; int count6 = 0; int count7 = 0;
       
       while (athena.nextToABeeper())
      {
       athena.pickBeeper();
       count1++;
      }
       athena.move();
       while (athena.nextToABeeper())
      {
       athena.pickBeeper();
       count2++;
      }
       for (int a = 1; a <= count1; count1--)
      {
       athena.putBeeper();
      }
       athena.move();
       while (athena.nextToABeeper())
      {
       athena.pickBeeper();
       count3++;
      }
       for (int b = 1; b <= count2; count2--)
      {
       athena.putBeeper();
      }
       athena.move();
       while (athena.nextToABeeper())
      {
       athena.pickBeeper();
       count4++;
      }
       for (int c = 1; c <= count3; count3--)
      {
       athena.putBeeper();
      }
       athena.move();
       while (athena.nextToABeeper())
      {
       athena.pickBeeper();
       count5++;
      }
       for (int d = 1; d <= count4; count4--)
      {
       athena.putBeeper();
      }
       athena.move();
       while (athena.nextToABeeper())
      {
       athena.pickBeeper();
       count6++;
      }
       for (int e = 1; e <= count5; count5--)
      {
       athena.putBeeper();
      }
       athena.move();
       while (athena.nextToABeeper())
      {
       athena.pickBeeper();
       count7++;
      }
       for (int f = 1; f <= count6; count6--)
      {
       athena.putBeeper();
      }
       athena.move();
       for (int g = 1; g <= count7; count7--)
      {
       athena.putBeeper();
      }
       athena.turnAround();
       while (athena.frontIsClear()) 
      {
       athena.move();
      }

  }
}