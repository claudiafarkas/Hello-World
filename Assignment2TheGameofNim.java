//CLAUDIA FARKAS
//OCTOBER 5 2012
//DESCRIPTION: CREATE A PROGRAM THAT SIMULATES THE GAME NIM; A GAME BETWEEN TWO PLAYERS THAT USES 3 PILES OF 
//MATCHES,EACH PLAYER GETS TO REMOVE ONE OR MORE MATCHES FROM EACH PILE WHEN ITS THEIR TURN. 
//THE GAME ENDS IF THERE ARE NO MORE MATCHES IN ANY OF THE PILES OR IF THERE IS 1 MATCH LEFT IN TOTAL. 
 
import java.util.*;
public class Assignment2TheGameofNim {

	public static void main(String[] args) {
		Scanner  in = new Scanner (System.in); 
		//Declaring Variables -----------------------------------------------------------------------------------------------------
		String player1 ;
		String player2; 
		int rotatePlayer = 0;
		int player1Score = 0;
		int player2Score = 0;
		char pilechoice;
		int pileA = 3;
		int pileB = 4;
		int pileC = 5;
		int takeOutAnswer;
		char playAgainAnswer;
		boolean playAgainLoop = true;
		boolean loop;

		//Section 1 - INTRO WITH PLAYER NAMES -----------------------------------------------------------------------------------------------
		System.out.print(" Player 1:  Enter your name: ");
		player1 = in.nextLine();
		System.out.print(" Player 2:  Enter your name: ");
		player2 = in.nextLine();

		// Displays the original piles----------------------------------------------------------------------------------------------------		
		do{
			// Reset each pile after each round------------------------------------------------------------------------------------
			pileA =3;
			pileB = 4;
			pileC = 5; 
			loop = true;
			// Print out each pile ------------------------------------------------------------------------------------------------------------------
			System.out.println (" ");
			System.out.print (" A:"+ pileA);
			System.out.print ("        B:"+ pileB);
			System.out.println ("          C:"+ pileC);

			// Section 2 - LOOPS TO CHECK THE PILE CHOICE + ASKS USER WHICH PILE PLAYER WANTS TO PICK FROM---------------------------------------------------------------------------------------------------		
			do{
				if (rotatePlayer%2 ==0){
					System.out.print(" " + player1 + ", Choose a pile: ");
				}
				else {
					System.out.print(" " + player2 + ", Choose a pile: ");
				}
				rotatePlayer++;
				pilechoice = in.nextLine().charAt(0); //take out 
				while (( pilechoice != 'A' && pilechoice != 'a' && pilechoice != 'B' && pilechoice != 'b' && pilechoice != 'C' && pilechoice != 'c') ||
						((pileA == 0 && (pilechoice == 'A' || pilechoice == 'a' )) ||
								(pileB == 0 && (pilechoice =='B' || pilechoice == 'b')) ||
								(pileC == 0 && (pilechoice =='C' || pilechoice == 'c'))))  {
					System.out.println ("Invalid pile. Please Chose between A, B, C or a, b, c ");
					pilechoice = in.nextLine().charAt(0);
				} 
				// Loop to check choice for Pile A----------------------------------------------------------------------------------			
				if ( pilechoice == 'A' || pilechoice == 'a' ){
					System.out.print(" How many to remove from pile A:  ");
					do {
						takeOutAnswer = Integer.parseInt(in.nextLine());  
						if (takeOutAnswer <0 || takeOutAnswer > pileA)
							System.out.print (" Invalid answer. Please try again.");
					}while (takeOutAnswer < 0 || takeOutAnswer > pileA);
					pileA -= takeOutAnswer ;
				}	
				// Loop to check choice for Pile B----------------------------------------------------------------------------------
				else if ( pilechoice == 'B' || pilechoice == 'b' ){
					System.out.print(" How many to remove from pile B:  ");
					do{
						takeOutAnswer = Integer.parseInt(in.nextLine());  
						if (takeOutAnswer <0 || takeOutAnswer > pileB)
							System.out.print (" Invalid answer. Please try again.");
					}while (takeOutAnswer < 0 || takeOutAnswer > pileB);
					pileB -= takeOutAnswer ;
				}
				// Loop to check choice for Pile C----------------------------------------------------------------------------------
				else if ( pilechoice == 'C' || pilechoice == 'c' ){
					System.out.print(" How many to remove from pile C:  ");
					do{
						takeOutAnswer = Integer.parseInt(in.nextLine());  
						if (takeOutAnswer <0 || takeOutAnswer > pileC)
							System.out.print (" Invalid answer. Please try again.");
					}while (takeOutAnswer < 0 || takeOutAnswer > pileC);
					pileC -= takeOutAnswer ;
				}
				if (pileA == 0 && pileB ==0 && pileC == 0|| pileA + pileB + pileC ==1)
					loop = false;
				
				// Section 3 - DISPLAY NEW PILE----------------------------------------------------------------------------------------------
				System.out.println (" ");
				System.out.print (" A:"+ pileA);
				System.out.print ("        B:"+ pileB);
				System.out.println ("          C:"+ pileC);
 
				// Section 4 - END OF GAME-----------------------------------------------------------------------------------------------	
			} while ( loop == true);
			rotatePlayer--;
			if (rotatePlayer%2 == 0){
				System.out.print("\n " + player1 + ", won!!!");
				player1Score++;
			} 
			else { 
				System.out.print("\n " + player2 + ", won!!!");
				player2Score++;
			}
			
		
			// Play Again Question + checking if answer is valid or not ----------------------------------------------------------------------------------------------------
			System.out.print(" \n Play again? (Enter Y/N): ");
			do {
				playAgainAnswer = in.nextLine().charAt(0);
				if (playAgainAnswer == 'y' || playAgainAnswer == 'Y')
					playAgainLoop = true;
				else if (playAgainAnswer == 'N'|| playAgainAnswer == 'n')
					playAgainLoop = false;
				else 
					System.out.println (" Invalid Answer. Enter Again.");
			}while (playAgainAnswer != 'n' && playAgainAnswer != 'y' && playAgainAnswer != 'N' && playAgainAnswer != 'Y');
		}while(playAgainLoop == true);
		System.out.println(" Thank you for playing!");
		
		// BONUS QUESTION - displays score of the players--------------------------------------------------------------------------------------------------------------
		System.out.println (" " + player1 + " score: " + player1Score);
		System.out.println (" " + player2 + " score: " + player2Score);
	} 

}
