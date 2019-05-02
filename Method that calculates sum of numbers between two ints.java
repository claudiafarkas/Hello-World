// NAME: CLAUDIA FARKAS 
// DATE: NOVEMBER 13 2017
// DESCRIPTION: CREATE A METHOD THAT CALCULATES AND FINDS THE SUM OF NUMBERS BETWEEN TWO INTEGERS,INCLUDING THE TWO INTEGERS
//----------------------------------------------------------------------------------------------------------

import java.util.*;

public class MethodQuestion8ToSubmit {
	// DESCRIPTION: METHOD TO ANSWER QUESTION 8
	// PARAPETERS: TWO NUMBERS  
	// RETURN: THE SUM OF THE TWO INPUTED NUMBERS
	public static int sumOfNumbersBetween (int firstNum , int secondNum ){
		int sumOfTwoNums = 0;
		for (int i = firstNum ; i <= secondNum ; i++)
			sumOfTwoNums = sumOfTwoNums +1;
		return sumOfTwoNums;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int firstNum =0;
		int secondNum =0;
		int sumOfTwoNums ;
		System.out.print("Enter your first number: ");
		firstNum = in.nextInt();
		System.out.print("Enter your second number: ");
		secondNum = in.nextInt ();

		System.out.print("The sum of your two number is: ");
		sumOfTwoNums = firstNum + secondNum;

		System.out.print(sumOfTwoNums);

	}

}
