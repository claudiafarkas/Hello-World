import java.util.*;
public class NumIsPrime {

	public static void main(String[] args) {
//		Scanner  in = new Scanner (System.in);
//		// Write a program that determines if a number is a prime number
//		int primenum;
//		int num;
//		String answer = "Your number is a prime number";
//
//		System.out.print("Type in your number");
//		num = in.nextInt ();
//		for ( int count = 2; count < num; count++)
//		if (num % count == 0){
//		answer = "Your number is not a prime number";
//		break;
//		}
//		System.out.println(answer);
//		
		Scanner  in = new Scanner (System.in);
//		Upgrade the program to output all the prime numbers before a given number 
		// eg. if n = 15 -> output : 2,3,5,7,11,13,
		
		int primenum;
		int num;
		String answer = "Your number is a prime number";

		System.out.print("Type in your number");
		num = in.nextInt ();
//		for ( int count = 2; count < num; count++)
//		if (num % count == 0){
//		answer = "Your number is not a prime number";
//		break;
//		}
//		System.out.println(answer);
//		
		boolean isPrime = true;
		for (int i = 2; i < num; i ++) {
			isPrime = true;
			for (int count = 2; count < i; count++) {
				if (i % count == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true)
				System.out.println(i);
		}
		
	 	
	}

}
