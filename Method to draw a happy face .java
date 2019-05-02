// NAME: CLAUDIA FARKAS 
// DATE: NOVEMBER 17 2017
// DESCRIPTION: A method called drawHappyFace () that draws a happy face in a Graphics window. The happy face should be approximately 100 × 100 pixels.
//	In addition to the standard face, eyes and mouth, don’t forget to include other features on your happy face.
//----------------------------------------------------------------------------------------------------------

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MethodQuestion10ToSubmit extends JPanel {
	// DESCRIPTION: METHOD TO ANSWER QUESTION 10 
	// PARAPETERS:	X POINT, Y POINT, 
	// RETURN: VOID - ESSENCIALLY CREATES SHAPES OF CERTAIN SIZES AND PUTS THEM TOGETHE TO MAKE A SMILEY FACE
	private final Color PURPLE= new Color (180, 0, 180);

	//----------------------------------------------------------------------------------------------------------
	public MethodQuestion10ToSubmit ()
	{
		setPreferredSize (new Dimension (600, 480));
		setBackground (new Color (200, 200, 200));
	}
	//----------------------------------------------------------------------------------------------------------
	public void drawHappyFace (Graphics g, int x ,int y)
	{ 
		g.setColor(Color.BLACK);		//BACKGROUND
		//g.fillRect (x+5, y, x+2, y-2);
		g.fillRect(x-68, y-50, x-5, y-10);
		g.setColor(Color.GREEN); 	// FACE
		g.fillOval(x, y, 100, 100);
		g.setColor(Color.BLACK);		//LEFT EYE
		g.fillOval(x+25, y+30, 10, 10);
		g.setColor(Color.BLACK);		//RIGHT EYE
		g.fillOval(x+61, y+30, 10, 10);
		g.drawArc(x+22, y+30, 55, 45, -50, -85);		//MOUTH
		g.setColor(Color.GREEN);
		g.fillOval(x+61, y+85, 50, 30);		//RIGTH FOOT
		g.setColor(Color.GREEN);
		g.fillOval(x-8, y+85, 50, 30);
		g.setColor(Color.RED);		//HAT
		//g.fillRect (x+5, y, x+2, y-2);
		g.fillRect(x-20, y-5, x-100, y-185); 
		g.setColor(Color.RED);		//HAT
		//g.fillRect (x+5, y, x+2, y-2);
		g.fillRect(x+10, y-17, x-160, y-190);
	}
	//----------------------------------------------------------------------------------------------------------
	public void paintComponent (Graphics g) 
	{
		super.paintComponent (g);
		drawHappyFace (g, 250, 200);
	}
	//----------------------------------------------------------------------------------------------------------
	public static void main (String [] args){
		JFrame frame = new JFrame ("Simple Graphics Window");
		MethodQuestion10ToSubmit myPanel = new MethodQuestion10ToSubmit ();
		frame.add(myPanel);
		frame.pack();frame.setVisible(true);
	}
	//----------------------------------------------------------------------------------------------------------

}
