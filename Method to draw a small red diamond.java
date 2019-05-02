// NAME: CLAUDIA FARKAS 
// DATE: NOVEMBER 17 2017
// DESCRIPTION:  Uses a method called drawDiamond () that draws a small (20 pixels by 20 pixels) red diamond
//----------------------------------------------------------------------------------------------------------

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame; 
import javax.swing.JPanel;

public class MethodQuestion12Tosubmit extends JPanel {
	// DESCRIPTION: METHOD TO ANSWER QUESTION 12 
	// PARAPETERS:	X POINT, Y POINT, 
	// RETURN: VOID - ESSENCIALLY DRAWS 4 LINES THAT INTERSECT AND CREATE A DIAMOND 
	private final Color PURPLE= new Color (180, 0, 180);

	//----------------------------------------------------------------------------------------------------------
	public MethodQuestion12Tosubmit ()
	{
		setPreferredSize (new Dimension (600, 480));
		setBackground (new Color (200, 200, 200));
	}
	//----------------------------------------------------------------------------------------------------------
	public void drawDiamond (Graphics g, int x ,int y)
	{ 
		g.setColor(Color.RED); 	// LINE
		g.drawLine(x, y, x+20, y+20);
		g.drawLine(x, y, x-20, y+20);
		g.drawLine(x-20, y+20, x, y+40);
		g.drawLine(x+20, y+20, x, y+40);
	}
	//----------------------------------------------------------------------------------------------------------
	public void paintComponent (Graphics g) 
	{
		super.paintComponent (g);
		drawDiamond (g, 250, 200);
	}
	//----------------------------------------------------------------------------------------------------------
	public static void main (String [] args){
		JFrame frame = new JFrame ("Simple Graphics Window");
		MethodQuestion12Tosubmit myPanel = new MethodQuestion12Tosubmit ();
		frame.add(myPanel);
		frame.pack();frame.setVisible(true);
	}
	//----------------------------------------------------------------------------------------------------------

}
