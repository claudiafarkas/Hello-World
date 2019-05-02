import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		Scanner  in = new Scanner (System.in);
		double length;
		double width;
		double area;
		System.out.println ("What is the length of your rectangle");
		length = in.nextInt ();
		System.out.println ("What is width of your rectangle");
		width = in.nextInt ();
		area = (length * width );
		System.out.println ("The area of your rectangle is");
		System.out.println (area);
	}

}
