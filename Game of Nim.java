
//CLAUDIA FARKAS
//OCTOBER 5 2012
//DESCRIPTION: CREATE A PROGRAM THAT SIMULATES THE GAME NIM; A GAME BETWEEN TWO PLAYERS THAT USES 3 PILES OF 
//MATCHES, EACH PLAYER CHOSES A PILE AND WHOEVER ENDS UP WITH 1 MATCH LET LOSES. 

import java.util.*;
public class assignment2test {
	//Assignment2TheGameofNim
	public static void main(String[] args) {
		Scanner  in = new Scanner (System.in); 
		//Declaring Variables -----------------------------------------------------------------------------------------------------
		String player1 ;
		String player2; 
		int RotatePlayer = 0;
		char pilechoice;
		int pileA = 3;
		int pileB = 4;
		int pileC = 5;
		//int amountToRemove;
		int takeOutAnswer;
	//	int amountLeftInPile;
		char playAgainAnswer;
		boolean playAgainLoop = true;
		boolean loop;

		//Section 1 - Players Names -----------------------------------------------------------------------------------------------
		System.out.print(" Player 1:  Enter your name: ");
		player1 = in.nextLine();
		//		System.out.print(player1);
		System.out.print(" Player 2:  Enter your name: ");
		player2 = in.nextLine();
		//		System.out.print(player2);

		// Displays the original piles----------------------------------------------------------------------------------------------------		
		do{
			pileA =3;
			pileB = 4;
			pileC = 5; 
			loop = true;

			System.out.println (" ");
			System.out.print (" A:"+ pileA);
			System.out.print ("        B:"+ pileB);
			System.out.println ("          C:"+ pileC);

			// Section 2 - Loops to check the pile choice + asks which pile player wants to pick from---------------------------------------------------------------------------------------------------		
			
				do{
					if (RotatePlayer%2 ==0){
						System.out.print(" " + player1 + ", Choose a pile: ");
					}
					else {
						System.out.print(" " + player2 + ", Choose a pile: ");
					}
					RotatePlayer++;


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

					// Section 3 - Display new pile----------------------------------------------------------------------------------------------
					//AmountLeftInPile = pilechoice - AmountToRemove;
					//System.out.println(AmountLeftInPile);
					// Display how much is left in piles
					System.out.println (" ");
					System.out.print (" A:"+ pileA);
					System.out.print ("        B:"+ pileB);
					System.out.println ("          C:"+ pileC);

				} while ( loop == true);

				// Section 4 - End of Game-----------------------------------------------------------------------------------------------	

				// if game ends with 0 or 1 than game over!

				//		System.out.print("player name , won!!!");

				// Play Again Question----------------------------------------------------------------------------------------------------
				System.out.print("Play again? (Enter Y/N): ");
				playAgainAnswer = in.nextLine().charAt(0);
				while (playAgainAnswer != 'Y' && playAgainAnswer != 'y' && playAgainAnswer != 'N' && playAgainAnswer != 'n') {
					System.out.print("Invalid answer.  Play again? (Enter Y/N: )");
					playAgainAnswer = in.nextLine().charAt(0);
							System.out.print("Thank you for playing!");
				}	
				if (playAgainAnswer == 'N' || playAgainAnswer == 'n');
				System.out.print("Thank you for playing!");
			}while(playAgainLoop == false);
		} 

	}

