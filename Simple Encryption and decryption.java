/*Name: Nika Sharifi-Dariani
 *Date: November 2, 2017
 *Description: A program that performs a simple encryption and decryption on a text file message.
 */
import java.util.*;
import java.io.*;

public class Assignment3Cipher {

	public static void main(String[] args) throws IOException {

		Scanner inkey = new Scanner (System.in);

 

		int choice ;
		String nameOfFile1;          //input 
		String nameOfFile2;			//output
		String newStr;
		String symbols = "@=!?*#&$+^%_";
		char sub;
		
	// First question ---------------------------------------------------------------------------------------------------------	
		do{
			System.out.println ("Enter 1 if you would like to encrypt an existing file. \nEnter 2 if you would like to decrypt an existing file.");
			choice = Integer.parseInt (inkey.nextLine());
		}while (choice != 1 && choice != 2);
// questions--------------------------------------------------------------------------------------------------------------------
		System.out.println("Enter the name of the text file you wish to read from:");
		nameOfFile1 = inkey.nextLine();
		System.out.println("Enter the name of the text file you wish to output to:");
		nameOfFile2 = inkey.nextLine();

		Scanner in = new Scanner (new File (nameOfFile1));
		PrintWriter out = new PrintWriter (new FileWriter (nameOfFile2));

		
		// line in txt file 
		String line = in.nextLine();
		System.out.println(line);
		
		// #1
		line = line.trim();
		System.out.println(line);
		
		// #2
		line = line.toUpperCase();
		System.out.println(line);
		
		//#3
		for (int i = 0 ; i < line.length() ; i++)
			if (line.charAt(i) == 'a' || line.charAt(i) =='A')
				line = line.substring(0,i) + "@" + line.substring(i+1);
		System.out.println(line);
				
	}
}
				
		
		
		
		
		
//		if (choice == 1)
//			while (in.hasNextLine()){
//				String s = in.nextLine();
//				s = s.trim();
//				s = s.toUpperCase();
//				//System.out.println(s);
//				
//			}
		







