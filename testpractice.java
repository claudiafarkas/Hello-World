import java.util.*;
public class testpractice {

	public static void main(String[] args) {
		/*
		 Classic for-loop counting up from 0 to 99
		 0, 1, 2, 3, ... 99
		-init int i = 0
		-test i<100
		-increment i++
		 */
//		for (int i=0; i<100; i++) {
//			System.out.println(i);
//		}
		//------------------------------------------------------------------------------------------------------------------
		/*
		 For-loop to print the values
		 0, 2, 4, 6, .. 98
		 -increment by i + = 2, instead of i + +
		  (same as i = i + 2)
		*/
//		for (int i=1; i<100; i+=2) {
//		  System.out.println(i);
//		}
		//------------------------------------------------------------------------------------------------------------------
		/*
		 For-loop from 99 down to 0
		 99, 98, 97, ... 0
		 -init i=99
		 -test i>=0
		 -increment i--
		*/
//		for (int i=99; i>=0; i--) {
//		  System.out.println(i);
//		}
		//------------------------------------------------------------------------------------------------------------------
// }
	/*
	 For-loop from 0 to 100 by 5's
	 0, 5, 10, 15, .. 100
	 -test i<=100
	 -increment i+=5
	*/
//		for (int i=0; i<=100; i+=5) {
//			System.out.println(i);
//		}	
//	}
//	char A;
//	String B;
//	String C;
//	String D;
//		char grade ;
//		grade = in.nextLine().charAt(0); //take out 
//		System.out.print("Enter a grade");
//		grade = in.nextLine();
//		while (grade !='A' || grade != 'B' || grade !='C' || grade != 'D' ){
//			System.out.print("Invalid grade input. Try again");	
//			if (grade == 'A');
//			System.out.print(" mark in the 80's or 90's ");
//			else if (grade == 'B');
//			System.out.print("mark in the 70's");
//			else if (grade == 'C');
//			System.out.print("mark in the 60's");
//			else if (grade == 'D')
//				System.out.print("mark in the 50's");
//			else
//				System.out.print("mark lower than 50");
//		}
//	}
//	Program that displays what number grade is equal to what letter grade --------------------------------------------------
//		int grade;
//		System.out.print("Enter a grade");
//		grade = in.nextInt ();
//		if (grade >=80 ||grade <=90)
//			System.out.print("A");
//		else if (grade >=70 || grade <=79)
//			System.out.print ("B");
//		else if (grade >=60 || grade <=69)
//		System.out.print("C");
//		else if (grade >= 50 || grade <=59)
//		System.out.print("D");
//		else 
//			System.out.print("Invalid input");
//		
// Question #2 - Program that uses for loops to display number from 1 to 15 with their squares------------------------------------------- 
//		System.out.printf ("%-15s%-15s%-15s%n", "Number", "Square", "Cube");
//		for (int i = 1; i <= 15; i ++) {
//			System.out.printf ("%3d%15d%15d%n", i, i*i, i*i*i);
//		}
					
// Question #3 - 
//
//		Scanner in = new Scanner (System.in);
//		int total = 0; 
//		int number;
//		int count = 0;
//		double average;
//		int largest = Integer.MIN_VALUE;
//		int smallest = Integer.MAX_VALUE;
//		char answer;
//
//		do {
//			System.out.print ("Do you want to enter a number?");
//			answer = in.nextLine().charAt(0);
//			if (answer == 'y' || answer == 'Y') {
//				System.out.print ("Enter a number:" );
//				number = Integer.parseInt (in.nextLine ());
//				total += number;
//				count ++;
//				if (largest < number)
//					largest = number;
//				if (smallest > number)
//					smallest = number;			
//			}
//
//		}while (answer == 'y' || answer == 'Y');
//
//		average = total / (count * 1.0);
//		System.out.println ("The average is " + average);
//		System.out.println("The largest number entered is " + largest);
//		System.out.println("The smallest number entered is " + smallest);

				// Question #4

//				Scanner in = new Scanner (System.in);
//				int height, width;
		//
//				System.out.print ("Enter the height: ");
//				height = in.nextInt ();
//				System.out.print ("Enter the width: ");
//				width = in.nextInt ();
		//
//				System.out.println ("Normal: ");
//				for (int i = 1; i <= height; i++) {
//					for (int j = 1; j <= width; j++) 
//						System.out.print ("*");
//					System.out.println ();
//				}
//				System.out.println ("Outline: ");
//				for (int i = 1; i <= height; i++) {
//					for (int j = 1; j <= width; j++) { 
//						if (i == 1 || i == height || (j == 1 || j == width))
//							System.out.print ("*");
//						else
//							System.out.print (" ");
//					}	
//					System.out.println ();
//				}
			}

		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

