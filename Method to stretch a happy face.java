// NAME: CLAUDIA FARKAS 
// DATE: NOVEMBER 17 2017
// DESCRIPTION:  Creates a stretched version of the smiley face from question 10
//----------------------------------------------------------------------------------------------------------


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MethodQuestion11Tosubmit extends JPanel {
	// DESCRIPTION: METHOD TO ANSWER QUESTION 11 
	// PARAPETERS:	X POINT, Y POINT, 
	// RETURN: VOID - ESSENCIALLY CREATES SHAPES OF CERTAIN SIZES AND PUTS THEM TOGETHE TO MAKE A SMILEY FACE  
	
	private final Color PURPLE= new Color (180, 0, 180);

	//----------------------------------------------------------------------------------------------------------
	public MethodQuestion11Tosubmit ()
	{
		setPreferredSize (new Dimension (600, 480));
		setBackground (new Color (200, 200, 200));
		//setFont (ARIAL_30);
	}
	//----------------------------------------------------------------------------------------------------------
	public void drawHappyFace (Graphics g, int x ,int y)
	{ 
		g.setColor(Color.BLACK);		//BACKGROUND
		//g.fillRect (x+5, y, x+2, y-2);
		g.fillRect(x-68, y-50, x-5, y-10);
		g.setColor(Color.GREEN); 	// FACE +50
		g.fillOval(x, y, 150, 100);
		g.setColor(Color.BLACK);		//LEFT EYE 
		g.fillOval(x+10, y+30, 40, 10);
		g.setColor(Color.BLACK);		//RIGHT EYE 
		g.fillOval(x+70, y+30, 50, 10);
		g.drawArc(x+22, y+30, 95, 45, -50, -85);		//MOUTH
		g.setColor(Color.GREEN);
		g.fillOval(x+61, y+85, 75, 30);		//RIGTH FOOT
		g.setColor(Color.GREEN);
		g.fillOval(x-8, y+85, 70, 30);		// LEFT FOOT
		g.setColor(Color.RED);		
		g.fillRect(x-20, y-5, x-80, y-190);  //BIG PART OF HAT
		g.setColor(Color.RED);		
		g.fillRect(x+25, y-12, x-175, y-195); // LITTLE PART OF HAT
	}
	//----------------------------------------------------------------------------------------------------------
	public void paintComponent (Graphics g) 
	{
		super.paintComponent (g);
		drawHappyFace (g, 250, 200);

		//String title = "TEXT IN THE WINDOW";
		//int xPos = (int) ((this.getWidth() - this.getFontMetrics (ARIAL_30)
		//	.getStringBounds (title, g) . getWidth ()) /2;
	}
	//----------------------------------------------------------------------------------------------------------
	public static void main (String [] args){
		JFrame frame = new JFrame ("Simple Graphics Window");
		MethodQuestion11Tosubmit myPanel = new MethodQuestion11Tosubmit ();
		frame.add(myPanel);
		frame.pack();frame.setVisible(true);
	}
	//----------------------------------------------------------------------------------------------------------

}
