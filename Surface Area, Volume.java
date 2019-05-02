import java.util.*;
public class Question15 {

	public static void main(String[] args) {
		Scanner  in = new Scanner (System.in);
		double height;
		double radius;
		double surfacearea;
		double volume ;
		System.out.println ("What is the height of your cylinder ");
		height = in.nextInt ();
		System.out.println ("What is radius of your cylinder ");
		radius = in.nextInt ();
		System.out.println ("The surface area of your cylinder is ");
		surfacearea = ((2*3.14*radius*height) + (2*3.14 * Math.pow(radius,2) ));
		System.out.println (surfacearea);
		System.out.println ("The volume of your cylinder is ");
		volume = (3.14 * Math.pow(radius,2) * height);
		System.out.println (volume);
	}

}
