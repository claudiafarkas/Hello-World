import java.util.*;
public class StringsToSubmit {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);	
		
//2.2.13-17---------------------------------------------------------------------------------------------------------------
//Write a program that lets you enter a word, such as: Canada and that prints out the word in various ways:
		
//Option 1 (2.2.13 -> PROGRAM)~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//		String word; 
//		String space = "";		
//
//		System.out.print("Enter a word: ");
//		word = in.nextLine();
//		
//		for (int i=  word.length(); i >= 0; i--)
//						System.out.println (word.substring (0, i));
//	}
//}
		
		/* 
				canada -- substring (0, word.length())
				canad  -- substring (0, word.length()-1)
				cana   -- substring (0, 4)
				can
				ca
				c
		 *  */ 
		
//Option 2 (2.2.14 -> PROGRAM)~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//		String word; 
//		String space = "";		
//
//		System.out.print("Enter a word: ");
//		word = in.nextLine();
//		
//		for (int i= 0 ; i < word.length(); i++)
//					System.out.println (word.substring (i , word.length()));
//	}
//}
		/*
		canada  -- substring ( 0 ,word.length())
		anada -- substring (1 , word length())
		nada -- substring (2, word length ())
		ada
		da
		a 
		 **/

// Option 3 (2.2.15 -> PROGRAM)~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//		String word; 
//		String space = "";		
//
//		System.out.print("Enter a word: ");
//		word = in.nextLine();		
//		for (int i= 0 ; i<word.length (); i++){
//			System.out.print (space);
//			System.out.println (word.substring(i));
//			space= space + " ";
//		}
//	}
//}	
		/* 
			 Canada -- 0
			  anada -- 1
			   nada -- 2
			    ada -- 3
			     da -- 4
			      a -- i
			 **/
		
// Option 4 (2.2.16 -> PROGRAM)~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//		String word; 
//		String newstring = "";
//		String space = "";		
//
//		System.out.print("Enter a word: ");
//		word = in.nextLine();	
//
//		for (int i= 0; i< word.length(); i++){
//			newstring = newstring + (word.charAt (i))+ "-";
//		}
//
//		for (int i = newstring.length() ;i > 0 ; i-= 2){
//			System.out.println (space + newstring.substring (0, i -1));
//			space += " ";
//		}
//	}
		/*
			C-a-n-a-d-a
			 C-a-n-a-d
			  C-a-n-a
			   C-a-n
			    C-a
			     C
			**/	
		
// Option 5 (2.2.17 -> PROGRAM)~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//	
//		String newword = "";
//		String spaces = "";
//		String word; 
//		
//		System.out.print("Enter a word: ");
//		word = in.nextLine();	
//
//		for (int i = word.length()-1; i>-1 ; i--){
//
//			newword += word.charAt(i);
//		}
//				newword += word;
//
//				int takeout =0;
//				for (int i = 0; i < 0.5 * newword.length(); i++)
//				{
//					System.out.println(spaces + newword.substring(i,newword.length()-takeout));
//					spaces = spaces + " ";
//
//					if (takeout < newword.length())
//						takeout ++;
//				}
//			}
//	{
		/*
			adanaCCanada       (-1 on both sides until gets to first / last letter)
		     danaCCanad
		      anaCCana
		       naCCan
		        aCCa
		         CC 
		 **/
		 
// 2.4.12 (EXTRA QUESTION!! :D P.S. don't count it if its wrong :) ) ---------------------------------------------------------------------------------------------------------
//Write a program that lets you enter a "login" and "password". The Login ignores upper or lower case, 
// but the password must be exact. After entering both, your program must say either; "welcome" 
// or "password or login incorrect"
	
//		String login = "panda123";
//		String password = "byebye";
//		String loginanswer = ""; 
//		String passwordanswer = "";
//		
//		System.out.print("Enter a login");
//		login = in.nextLine();
//		System.out.print("Enter a password");
//		password = in.nextLine();
//			
//			if ((loginanswer.equalsIgnoreCase(login)) && (passwordanswer.equalsIgnoreCase(password)))
//				System.out.print("Welcome");
//			else 
//				System.out.print("Password or login incorrect"); 
//	}
//}
		
// 2.4.13----------------------------------------------------------------------------------------------------- 
		// Write a program that lets you enter a word and that checks if is a palindrome (the same forward as 
			// backwards, such as Mom, Madam, Radar). The program should repeat asking for more words, 
			// until you enter "stop". The test should be case insensitive.	
		
//			String reversedword = "";
//			String word;
//
//			do {
//				reversedword = "";
//				System.out.print (" Enter a word: ");
//				word = in.nextLine();
//				if (!word.equals ("stop")){
//				for (int i = word.length ()-1 ; i >= 0; i--)
//					reversedword +=  word.charAt(i);
//					//System.out.print (reversedword);
//					if (reversedword.equals(word))
//						System.out.println(" Your word is a palindrome ");
//					else
//						System.out.println(" Your word is not a palindrome ");
//				}
//				}while(!word.equals ("stop"));
//			System.out.println("END");
		
// 2.2.18-19--------------------------------------------------------------------------------------------------------------
//Write a program that lets you enter a number n between 1 and 20 and that prints a diagonal 
// line made up of n stars (*),
//
//		int n;
//	//	String star = "*";
//		String space = "";
//        String secondspace = "";
//		
//        do{
//        	System.out.print("Enter a number from 1 to 20: ");
//        	n=in.nextInt ();
//        }while (n<1 || n>20);
//
//        for (int count = 1; count <= n ; count++){
//        	System.out.print(space);
//        	space = space + " ";
//        	System.out.println ("*");
//        }
//        	for (int i = 1 ; i<n ; i++){
//        		secondspace = secondspace + " ";
//        	}
//        	for (int count =0 ; count <n ; count++){
//        		System.out.println(secondspace.substring(count)+ "*");
//        	}
//
//        }

		
		
//	}





