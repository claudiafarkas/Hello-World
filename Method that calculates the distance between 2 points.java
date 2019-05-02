// NAME: CLAUDIA FARKAS 
// DATE: NOVEMBER 13 2017
// DESCRIPTION: CREATE A METHOD CALLED distanceBetween () THAT CALCULATES THE DISTANCE BETWEEN TWO POINTS GIVEN FROM THE USER.
//----------------------------------------------------------------------------------------------------------

import java.util.*;

public class MethodQuestion9ToSubmit {
	// DESCRIPTION: METHOD TO ANSWER QUESTION 9 
	// PARAPETERS: FIRST X POINT, SECOND X POINT, FIRST Y POINT, SECOND Y POINT
	// RETURN: THE DISTANCE BETWEEN THE TWO POINHTS 
	public static double distanceBetween (int xFirstPoint , int yFirstPoint, int xSecondPoint, int ySecondPoint ){
		double distance = Math.sqrt (((xSecondPoint - xFirstPoint) * (xSecondPoint - xFirstPoint)) + ((ySecondPoint - yFirstPoint ) * (ySecondPoint - yFirstPoint)));                        ;
		return distance; 
	}

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int xFirstPoint, yFirstPoint, xSecondPoint, ySecondPoint;

		System.out.println (" Enter your first x point: ");
		xFirstPoint = in.nextInt ();
		System.out.println (" Enter your second x point: ");
		xSecondPoint = in.nextInt ();
		System.out.println (" Enter your first y point: ");
		yFirstPoint = in.nextInt ();
		System.out.println (" Enter your second y point: ");
		ySecondPoint = in.nextInt ();

		double distance = distanceBetween (xFirstPoint , yFirstPoint, xSecondPoint, ySecondPoint );
		System.out.println (" The distance betwenn your points is: " + distance );
	}

}
