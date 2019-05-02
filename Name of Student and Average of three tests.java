import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		{
	
			Scanner  in = new Scanner (System.in);
//create the variables 
			String name ; 
			int age; 
			int grade1;
			int grade2 ;
			int grade3 ;
			double average ; 
// start asking questions and getting answers
			System.out.println ("What is your name?");
			name = in.nextLine ();
			System.out.println ("How old are you?"); 
			age = in.nextInt ();
			System.out.println ("What are your three test marks?");
			System.out.println ("Test one");
			grade1 = in.nextInt ();
			System.out.println ("Test two");
			grade2 = in.nextInt ();
			System.out.println ("Test three");
			grade3 = in.nextInt ();
			
//calc average
			average = (grade1+grade2+grade3) / 3;
// display final message
			System.out.println (name + " is " + age + " years old. The test marks are " + grade1 + ", " +  grade2 + ", " + grade3 + " and the average is " + average);
		}// main method
	}

}//Assignment1  class
