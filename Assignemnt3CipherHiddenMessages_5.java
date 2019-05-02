//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// NAME: 		CLAUDIA FARKAS
// DATE: 		NOVEMBER 9TH 2017
// DESCRIPTION: THIS PROGRAM LETS YOU ENCRYPT AND DECRYPT A LINE OF TEXT OR MANY LINES OF TEXT BY READING IN FROM A FILE OR BY WRITING TO A FILE
// ENCRYPTION PROCESS STEPS: 0. CREATE LEADING SPACE STRING AND TRAILING SPACE STRING TO BE ADDED BACK TO THE ENCRYPTED TXTLINE 1. REMOVE ANY LEADING OR TRAILING SPACES 2. CHANGE TO UPPER CASE  3. SUBSTITUTE THE LETTERS WITH SYMBOLS   4. MOVE FIRST HALF TO BE THE LAST HALF
// 				5. SWAP THE FIRST TWO CHARACTERS WITH THE LAST TWO   6.SWAP THE TWO CHARACTERS IMMEDIETELY TO TH ELEFT OF THE MIDDLE STRING WITH THE TWO CHARACTERS THAT IMMEDIETLY FOLLOW THEM 7. SWAP EVERY TWO LETTERS  8. ADD BACK THE LEADING AND TRAILING SPACES
// DECRYPTION PROCESS STEPS: 0. CREATE LEADING SPACE STRING AND TRAILING SPACE STRING TO BE ADDED BACK TO THE ENCRYPTED TXTLINE  1. REMOVE ANY LEADING OR TRAILING SPACES  7. SWAP EVERY TWO LETTERS  6. SWAP THE TWO CHARACTERS IMMEDIETELY TO TH ELEFT OF THE MIDDLE STRING WITH THE TWO CHARACTERS THAT IMMEDIETLY FOLLOW THEM
// 				5. SWAP THE FIRST TWO CHARACTERS WITH THE LAST TWO   4. MOVE FIRST HALF TO BE THE LAST HALF   3. SUBSTITUTE THE SYMBOLS WITH LETTERS  2. CHANGE TO LOWER CASE  8. ADD BACK THE LEADING AND TRAILING SPACES
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// EXAMPLE OF PROGRAM WORKING USING THE FIRST VERSE OF STAIRWAY TO HEAVEN
// INPUT TEXT FILE:
//                Stairway to Heaven  
//                   Led Zeppelin   
//        There's a lady who's sure  
//        All that glitters is gold  
//        And she's buying a stairway to heaven  
//        When she gets there she knows  
//        If the stores are all closed  
//        With a word she can get what she came for  
//        Oh oh oh oh and she's buying a stairway to heaven 
//
// ENCRYPTED TEXT FILE:
//                _YH_@=$^=+@N&!@W*+  
//                   =ZL==LN!_D##  
//        D@HW'*_$U$H+=&&='=_$_@YL_  
//        +!$&!__$*GL@DL_LH++@G_+L=  
//        _@!@W&Y@+__*=H^@N@N=_DH$'=_$UB!YGN$_+  
//        +_=&$_=HK_*NHW$WN=$_=HG_+=H$=  
//        _$_=L@_LLC$*F!D=+_=H$_*+=&&@  
//        G_W_@H_+H$_=@C=MF_!W&*H+@_W_&*_DH$_=@C=N+  
//        YU_G_@+$!@W&Y@+__*=H^@H*N=*__HH**__HN@_DH$'=_$!BN
//
// DECRYPTED TEXT FILE:
//                stairway to heaven  
//                   led zeppelin  
//        there's a lady who's sure  
//        all that glitters is gold  
//        and she's buying a stairway to heaven  
//        when she gets there she knows  
//        if the stores are all closed  
//        with a word she can get what she came for  
//        oh oh oh oh and she's buying a stairway to heaven  
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------




import java.util.*;
import java.io.*;

public class Assignemnt3CipherHiddenMessages_5 {

	public static void main(String[] args) throws IOException {

		Scanner inkeyboard = new Scanner (System.in);		// if you have more than one scanner you must give different names to each, eg. Scanner  in, Scanner inkey, Scanner apple
		// scanner variables i'm using : inkeyboard -> for user input from the keyboard, intxtfile -> for txt file import/export

		// DECLARING VARILABLES--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		

		int answer ;
		String inputFileName ; //file to read from - input 
		String outputFileName; //file to output to - output
		String character = "" ;  //individual character in line of txt 
		String txtLineStringTemp ;
		String leadingSpace = "" ;
		String trailingSpace = "";
		int spaceCounter ; 
		//CODE ENCRYPT!!!-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//FIRST PART - ASKS QUESTION OF WEATHER USER WANTS TO DECYRPT OR ENCRYPT--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		do {
			System.out.println("Enter 1 to encrypt an existing file, enter 2 to decrypt an existing file ");
			answer = Integer.parseInt (inkeyboard.nextLine());
		} while  (answer != 1 && answer != 2);

		if (answer == 1){
			System.out.println("You chose to encrypt an existing text file.");				
			System.out.println ("What is the name of the text file you would like to read from?");
			inputFileName = inkeyboard.nextLine();
			System.out.println ("What is the name of the text file you want to output to?"); 
			outputFileName = inkeyboard.nextLine();

			// SECOND PART STARTS THE PROGRAM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
			Scanner intxtfile = new Scanner (new File (inputFileName));			 
			System.out.println ("This is your imported text file:");

			while (intxtfile.hasNextLine ()){
				String txtLineString = intxtfile.nextLine ();		// reads the file line by line 
				System.out.println (txtLineString);			//displays the txt file 
		 
				//  0. CREATE LEADING SPACE STRING AND TRAILING SPACE STRING TO BE ADDED BACK TO THE ENCRYPTED TXTLINE ------------------------------------------------------------------------------------------------------------------------------------------------------------------
				leadingSpace = "";
				trailingSpace = "";
				int count = 0;
				do{ 
					if (txtLineString.charAt(count)== ' ')
						leadingSpace = leadingSpace + " ";
					count ++;
				}while (txtLineString.charAt (count)== ' ');
				count = 0;
				count = txtLineString.length()-1;
				do{
					if (txtLineString.charAt(count)== ' ')
						trailingSpace = trailingSpace + " ";
					count --;
				}while (txtLineString.charAt (count) == ' ');


				//  1. REMOVE ANY LEADING OR TRAILING SPACES ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				txtLineString = txtLineString.trim();
				//System.out.println (txtLineString);

				// 2. CHANGE TO UPPER CASE -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				txtLineString = txtLineString.toUpperCase();
				// System.out.println (txtLineString);

				// 3. SUBSTITUTE THE LETTERS WITH SYMBOLS -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				for (int i = 0 ; i < txtLineString.length(); i++) {
					if (txtLineString.charAt(i) == 'A')
						txtLineString = txtLineString.substring (0, i) + "@" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == 'E')
						txtLineString = txtLineString.substring (0, i) + "=" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == 'I')
						txtLineString = txtLineString.substring (0, i) + "!" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == 'J')
						txtLineString = txtLineString.substring (0, i) + "?" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == 'O')
						txtLineString = txtLineString.substring (0, i) + "*" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == 'P')
						txtLineString = txtLineString.substring (0, i) + "#" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == 'R')
						txtLineString = txtLineString.substring (0, i) + "&" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == 'S')
						txtLineString = txtLineString.substring (0, i) + "$" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == 'T')
						txtLineString = txtLineString.substring (0, i) + "+" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == 'V')
						txtLineString = txtLineString.substring (0, i) + "^" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == 'X')
						txtLineString = txtLineString.substring (0, i) + "%" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == ' ')
						txtLineString = txtLineString.substring (0, i) + "_" + txtLineString.substring ( i + 1);
				} 
				// System.out.println (txtLineString);	

				// 4. MOVE FIRST HALF TO BE THE LAST HALF-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				if (txtLineString.length () % 2 == 0) {  // if mod = 0
					txtLineString = txtLineString.substring (txtLineString.length() /2, txtLineString.length())+ txtLineString.substring (0,txtLineString.length() /2 );   	//moves the first half of the string to be that last half 
				}
				else {
					//System.out.println ("your word is odd"); 
					txtLineString = txtLineString.substring (txtLineString.length () /2 +1 , txtLineString.length())+ txtLineString.substring (0,txtLineString.length() /2 +1); 	//moves the first half of the string to be that last half 
				} 		
				// System.out.println (txtLineString);

				// 5. SWAP THE FIRST TWO CHARACTERS WITH THE LAST TWO -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				txtLineString = txtLineString.substring (txtLineString.length () -2 ,txtLineString.length ()) + txtLineString.substring (2,txtLineString.length () -2) + txtLineString.substring(0,2);
				// System.out.println(txtLineString);

				// 6.SWAP THE TWO CHARACTERS IMMEDIETELY TO TH ELEFT OF THE MIDDLE STRING WITH THE TWO CHARACTERS THAT IMMEDIETLY FOLLOW THEM -----------------------------------------------------------------------------------------------------------------------------------
				if (txtLineString.length () % 2 == 0) {  // if mod = 0
					//System.out.println("your word is even");
					txtLineString = txtLineString.substring (0 , txtLineString.length()/2 -2 )+ txtLineString.substring (txtLineString.length()/2 , txtLineString.length()/2 +2 )+ txtLineString.substring ( txtLineString.length()/2 -2 , txtLineString.length() /2 ) +  txtLineString.substring (txtLineString.length()/2 +2 , txtLineString.length()) ;   	//moves the first half of the string to be that last half 
				}
				else {
					//System.out.println ("your word is odd");
					txtLineString = txtLineString.substring (0 , txtLineString.length()/2 -2 )+ txtLineString.substring (txtLineString.length()/2 , txtLineString.length()/2 +2 )+ txtLineString.substring ( txtLineString.length()/2 -2 , txtLineString.length() /2 ) +  txtLineString.substring (txtLineString.length()/2 +2 , txtLineString.length()) ;   	//moves the first half of the string to be that last half 
				}
				// System.out.println(txtLineString);

				// 7. SWAP EVERY TWO LETTERS ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				txtLineStringTemp = "";
				if (txtLineString.length () % 2 == 0) {  // if mod = 0
					for (int i = 0 ; i < txtLineString.length(); i += 2 ) {
						txtLineStringTemp = txtLineStringTemp + txtLineString.substring(i+1 , i+2) + txtLineString.substring (i, i+1);
					}
					txtLineString= txtLineStringTemp; 
				} 
				else {
					for (int i = 0 ; i < (txtLineString.length()-1) ; i += 2 ) {
						txtLineStringTemp = txtLineStringTemp + txtLineString.substring(i+1 , i+2) + txtLineString.substring (i, i+1);
					}
					txtLineStringTemp = txtLineStringTemp + txtLineString.substring(txtLineString.length () -1 ,txtLineString.length () );
					txtLineString= txtLineStringTemp;  
				}
				// System.out.println(txtLineString);			// fully encrypted txtlineString  
					
				// 8. ADD BACK THE LEADING AND TRAILING SPACES ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				txtLineString = leadingSpace + txtLineString + trailingSpace ;		
				System.out.println(txtLineString);
				System.out.println(" ");

// FILE WRITE OUT ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
				PrintWriter out2 = new PrintWriter (new FileWriter (outputFileName, true));		//writing to the file
				out2.println (txtLineString);
				out2.close();		 //closes writing to file section
			} 			// while loop for encrypt code 
			intxtfile.close();  		//closes reading in from file section 
		} 			//if 

		//CODE TO DECYPT!!!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		else {
			System.out.println("You chose to decrypt an existing encrypted text file.");
			System.out.println ("What is the name of the text file you would like to read from?");
			inputFileName = inkeyboard.nextLine();
			System.out.println ("What is the name of the text file you want to output to?");
			outputFileName = inkeyboard.nextLine();

			// SECOND PART STARTS THE PROGRAM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
			Scanner intxtfile = new Scanner (new File (inputFileName));
			PrintWriter out2 = new PrintWriter (new FileWriter (outputFileName));

			System.out.println ("This is your imported text file:");

			while (intxtfile.hasNextLine ()){
				String txtLineString = intxtfile.nextLine ();		// reads the file line by line 
				System.out.println (txtLineString);			//displays the txt file 

			//  0. CREATE LEADING SPACE STRING AND TRAILING SPACE STRING TO BE ADDED BACK TO THE ENCRYPTED TXTLINE ------------------------------------------------------------------------------------------------------------------------------------------------------------------
				leadingSpace = "";
				trailingSpace = "";
				int count = 0;
				do{ 
					if (txtLineString.charAt(count)== ' ')
						leadingSpace = leadingSpace + " ";
					count ++;
				}while (txtLineString.charAt (count)== ' ');
				count = 0;
				count = txtLineString.length()-1;
				do{
					if (txtLineString.charAt(count)== ' ')
						trailingSpace = trailingSpace + " ";
					count --;
				}while (txtLineString.charAt (count) == ' ');
				
				//  1. REMOVE ANY LEADING OR TRAILING SPACES ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				txtLineString = txtLineString.trim();
				//	System.out.println (txtLineString);
				
				// 7. SWAP EVERY TWO LETTERS-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				txtLineStringTemp = "";
				if (txtLineString.length () % 2 == 0) {  // if mod = 0
					for (int i = 0 ; i < txtLineString.length(); i += 2 ) {
						txtLineStringTemp = txtLineStringTemp + txtLineString.substring(i+1 , i+2) + txtLineString.substring (i, i+1);
					}
					txtLineString= txtLineStringTemp; 
				} 
				else {
					for (int i = 0 ; i < (txtLineString.length()-1) ; i += 2 ) {
						txtLineStringTemp = txtLineStringTemp + txtLineString.substring(i+1 , i+2) + txtLineString.substring (i, i+1);
					}
					txtLineStringTemp = txtLineStringTemp + txtLineString.substring(txtLineString.length () -1 ,txtLineString.length () );
					txtLineString= txtLineStringTemp; 
				}
				//	System.out.println(txtLineString);

				// 6. SWAP THE TWO CHARACTERS IMMEDIETELY TO TH ELEFT OF THE MIDDLE STRING WITH THE TWO CHARACTERS THAT IMMEDIETLY FOLLOW THEM -----------------------------------------------------------------------------------------------------------------------------------
				if (txtLineString.length () % 2 == 0) {  	// if mod = 0
					//System.out.println("your word is even");
					txtLineString = txtLineString.substring (0 , txtLineString.length()/2 -2 )+ txtLineString.substring (txtLineString.length()/2 , txtLineString.length()/2 +2 )+ txtLineString.substring ( txtLineString.length()/2 -2 , txtLineString.length() /2 ) +  txtLineString.substring (txtLineString.length()/2 +2 , txtLineString.length()) ;   	//moves the first half of the string to be that last half 
				}
				else {
					//System.out.println ("your word is odd");
					txtLineString = txtLineString.substring (0 , txtLineString.length()/2 -2 )+ txtLineString.substring (txtLineString.length()/2 , txtLineString.length()/2 +2 )+ txtLineString.substring ( txtLineString.length()/2 -2 , txtLineString.length() /2 ) +  txtLineString.substring (txtLineString.length()/2 +2 , txtLineString.length()) ;   	//moves the first half of the string to be that last half 
				}
				//	System.out.println(txtLineString);

				// 5. SWAP THE FIRST TWO CHARACTERS WITH THE LAST TWO -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				txtLineString = txtLineString.substring (txtLineString.length () -2 ,txtLineString.length ()) + txtLineString.substring (2,txtLineString.length () -2) + txtLineString.substring(0,2);
				// System.out.println(txtLineString);

				// 4. MOVE FIRST HALF TO BE THE LAST HALF-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				if (txtLineString.length () % 2 == 0) {  // if mod = 0
					txtLineString = txtLineString.substring (txtLineString.length() /2, txtLineString.length())+ txtLineString.substring (0,txtLineString.length() /2 );   	//moves the first half of the string to be that last half 
				}
				else {
					//System.out.println ("your word is odd"); 
					txtLineString = txtLineString.substring (txtLineString.length () /2 , txtLineString.length())+ txtLineString.substring (0,txtLineString.length() /2); 	//moves the first half of the string to be that last half 
				} 		
				// System.out.println (txtLineString);

				// 3. SUBSTITUTE SYMBOLS WITH LETTERS -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				for (int i = 0 ; i < txtLineString.length(); i++) {
					if (txtLineString.charAt(i) == '@')
						txtLineString = txtLineString.substring (0, i) + "A" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == '=')
						txtLineString = txtLineString.substring (0, i) + "E" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == '!')
						txtLineString = txtLineString.substring (0, i) + "I" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == '?')
						txtLineString = txtLineString.substring (0, i) + "J" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == '*')
						txtLineString = txtLineString.substring (0, i) + "O" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == '#')
						txtLineString = txtLineString.substring (0, i) + "P" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == '&')
						txtLineString = txtLineString.substring (0, i) + "R" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == '$')
						txtLineString = txtLineString.substring (0, i) + "S" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == '+')
						txtLineString = txtLineString.substring (0, i) + "T" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == '^')
						txtLineString = txtLineString.substring (0, i) + "V" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == '%')
						txtLineString = txtLineString.substring (0, i) + "X" + txtLineString.substring ( i + 1);
					if (txtLineString.charAt(i) == '_')
						txtLineString = txtLineString.substring (0, i) + " " + txtLineString.substring ( i + 1);
				}
				// System.out.println (txtLineString); 
 
				// 2. CHANGE TO LOWER CASE -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				txtLineString = txtLineString.toLowerCase();
				// System.out.println (txtLineString);

				//  1. ADD BACK  ANY LEADING OR TRAILING SPACES ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				txtLineString = leadingSpace + txtLineString + trailingSpace ;		// fully Decrypted txtlineString with the leading and trailing spaces added back 
				System.out.println(txtLineString);
				System.out.println(" ");
				
// FILE WRITE OUT ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
				PrintWriter out3 = new PrintWriter (new FileWriter (outputFileName, true));		//writing to the file
				out3.println (txtLineString);
				out3.close();		 //closes writing to file section	
			} // while 
			intxtfile.close();  //closes reading in from file section 
		} // else

	} //public static

}  //public class
