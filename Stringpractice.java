	import java.util.*;
public class Stringpractice {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);	

	
// 2.4.12 ---------------------------------------------------------------------------------------------------------
				//Write a program that lets you enter a "login" and "password". The Login ignores upper or lower case, 
				// but the password must be exact. After entering both, your program must say either; "welcome" 
				// or "password or login incorrect"
			
//				String login = "panda123";
//				String password = "byebye";
//				String loginanswer; 
//				String passwordanswer;
//				
//				System.out.print("Enter a login");
//				login = in.nextLine();
//				System.out.print("Enter a password");
//				password = in.nextLine();
//					
//					if ((loginanswer.equalsIgnoreCase(login)) && (passwordanswer.equalsIgnoreCase(password))
//					System.out.print("Welcome");
//					else 
//						System.out.print("Password or login incorrect");
					
// 2.4.13----------------------------------------------------------------------------------------------------- 
				// Write a program that lets you enter a word and that checks if is a palindrome (the same forward as 
					// backwards, such as Mom, Madam, Radar). The program should repeat asking for more words, 
					// until you enter "stop". The test should be case insensitive.		
//					String reversedword = "";
//					String word;
	
//					do {
//						reversedword = "";
//						System.out.print (" Enter a word: ");
//						word = in.nextLine();
//						if (!word.equals ("stop")){
//						for (int i = word.length ()-1 ; i >= 0; i--)
//							reversedword +=  word.charAt(i);
//							//System.out.print (reversedword);
//							if (reversedword.equals(word))
//								System.out.println(" Your word is a palindrome ");
//							else
//								System.out.println(" Your word is not a palindrome ");
//						}
//						}while(!word.equals ("stop"));
//					System.out.println("END");
//				

//2.2.13-17 Write a program that lets you enter a word, such as: Canada and that prints out the word in various ways:-----
//		String word; 
//		System.out.println("enter a word: ");
//		word = in.nextLine();
		
//Option 1---------------------------------------------------------------------------------------------------------
		//		for (int i=  word.length(); i >= 0; i--)
		//				System.out.println (word.substring (0, i));
				
		/*
				canada -- substring (0, word.length())
				canad  -- substring (0, word.length()-1)
				cana   -- substring (0, 4)
				can
				ca
				c
		 * */
		
//Option 2---------------------------------------------------------------------------------------------------------			 
		//		for (int i= 0 ; i < word.length(); i++)
		//			System.out.println (word.substring (i , word.length()));
		/*
		canada  -- substring ( 0 ,word.length())
		anada -- substring (1 , word length())
		nada -- substring (2, word length ())
		ada
		da
		a 
		 **/

// Option 3-------------------------------------------------------------------------------------------------------
		
		// String space = "";	
		//		for (int i= 0 ; i<word.length (); i++){
		//			System.out.print (space);
		//			System.out.println (word.substring(i));
		//			space= space + " ";
		//		}
		//		}
		
		/* 
			 Canada -- 0
			  anada -- 1
			   nada -- 2
			    ada -- 3
			     da -- 4
			      a -- i
			 **/
		
// Option 4-------------------------------------------------------------------------------------------------------
		
//		 for (i = length.word (); i >= 0; i--))
//	        for i : l .. length (word) - (l - 1)
//	            if (i = length (word) - (l - 1)) then
//	                put word (i) ..
//	            else
//	                put word (i), "-" ..
//	            end if
//	            
//	        end for
//	        put ""
//	    end for
//
//	end loop
//		
		
// Option 5-------------------------------------------------------------------------------------------------------
	
		String newword = "";
		String spaces = "";
		String word; 
		
		System.out.println("enter a word: ");
		word = in.nextLine();	

		for (int i = word.length()-1; i>-1 ; i--){

			newword += word.charAt(i);
		}
				newword += word;

				int takeout =0;
				for (int i = 0; i < 0.5 * newword.length(); i++)
				{
					System.out.println(spaces + newword.substring(i,newword.length()-takeout));
					spaces = spaces + " ";

					if (takeout < newword.length())
						takeout ++;
				}
			}
		}
			
		
	
		
		
		
		
		
		
		
		
	// 2.2.18-19 Write a program that lets you enter a number n between 1 and 20 and that prints a diagonal 
	// line made up of n stars (*),
	//
//				int number;
//				String star = "*";
//				String space = "";
//				
//				System.out.print("Enter a number from 1 to 20");
//				number=in.nextInt ();
//				
//				for (int count = 1; count <= n ; count++);{
//					System.out.print (space);
//					space = space + " "
//							
//					
//							)
//				}
//				
//				
//				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				















					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				
				//Write a program that lets you enter a "login" and "password". The Login ignores
		   //upper or lower case, but the password must be exact. After entering both, your
		  //program must say either; "welcome" or "password or login incorrect"

			}

		

	}


