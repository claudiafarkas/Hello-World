// NAME: CLAUDIA FARKAS
// DATE: SEPTEMBER 19 2017
// DESCRIPTION OF CODE : PROGRAM USED TO PINT OUT THE BILL OF THE ORDER OF THE GUEST FROM THE RESTAURANT. 
// THE BILL INCLUDES THE TOTAL AMOUNT THAT IS DUE, THE TOTAL AMOUNT THE CUSTOMER MUST PAY ASWELL AS THE TOTAL 
// AMOUNT OF CHANGE DUE TO THE CUSTOMER.

 
import java.util.*;
public class Assignment1MyAwesomeRestaurant {
 
	public static void main(String[] args) {
		Scanner  in = new Scanner (System.in);
		
//VARIABLE DECLERARTIONS-------------------------------------------------------------------	
	int waffles ;
	double wafflesprice = 2.50 ;
	int cheeseburgers ;
	double cheeseburgersprice = 3.00 ;
	int pulledpork ; 
	double pulledporkprice = 4.00 ;
	int icecreambowl;
	double icecreambowlprice = 2.00 ;
	int bubbletea;
	double bubbleteaprice = 3.30;
	double totalprice ;
	double priceaftertax ;
	double amountpayed ; 
	double changedue;
	int change; 
	int twentybill ;
	int tenbill =10;
	int fivebill = 5;
	int toonie = 2 ;
	int loonie = 1 ;
	double dimes = 0.10 ;
	double quarters = 0.25 ;
	double pennies = 0.01 ;
	double nickles = 0.05;	
	String inputFileName;
	
	
	System.out.println ("What is the name of the text file you would like to read from?");
	inputFileName = in.nextLine();
	System.out.print(inputFileName);

//TITLE --------------------------------------------------------------------------------
	System.out.println("WELCOME TO MY AWESOME RESTAURANT \n") ;
	
//QUESTIONS ----------------------------------------------------------------------------
		System.out.print("How many waffles would you like?  ") ;
		waffles = in.nextInt ();
		System.out.print("How mnay cheeseburgers would you like?  ") ;
		cheeseburgers = in.nextInt ();
		System.out.print("How many pulled pork sandwitched would you like?  ") ;
		pulledpork = in.nextInt ();
		System.out.print("How many bowls of ice-cream would you like?  ") ;
		icecreambowl = in.nextInt ();
		System.out.print("How many bubbleteas would you like? ") ;
		bubbletea = in.nextInt ();

//BILL TITLE-----------------------------------------------------------------------
		System.out.println("\nYOUR BILL \n") ;
		
//WAFFLE CALCULATIONS-----------------------------------------------------------------------
		wafflesprice = (waffles * 2.50);
		System.out.print(waffles + " waffles @ $2.50 each = $" ) ;
		System.out.printf("%.2f%n",wafflesprice );
	
//CHEESEBURGER CALCUALTOINS------------------------------------------------------------------
		cheeseburgersprice = (cheeseburgers * 3.00);
		System.out.print(cheeseburgers + " cheeseburgers @ $3.00 each = $" ) ;
		System.out.printf("%.2f%n",cheeseburgersprice );
		
//PULLED PORK CALCUALTOINS------------------------------------------------------------------
		pulledporkprice = (pulledpork * 4.00);
		System.out.print(pulledpork + " pulled pork sandwiches @ $4.00 each = $" ) ;
		System.out.printf("%.2f%n",pulledporkprice );		
		
//ICE CREAM BOWLS CALCUALTOINS---------------------------------------------------------------
		icecreambowlprice = (icecreambowl * 2.00);
		System.out.print(icecreambowl + " bowls of ice-Cream @ $2.00 each = $" ) ;
		System.out.printf("%.2f%n",icecreambowlprice );			
		 
//BUBBLE TEA  CALCUALTOINS-------------------------------------------------------------------
		bubbleteaprice = (bubbletea * 3.30);
		System.out.print(bubbletea + " bubble teas @ $3.30 each = $" ) ;
		System.out.printf("%.2f%n",bubbleteaprice );
		
//TOTAL  CALCUALATIONS------------------------------------------------------------------------
		totalprice = (wafflesprice + cheeseburgersprice + pulledporkprice + icecreambowlprice+ bubbleteaprice); 
		System.out.print("\nTotal = $" + totalprice ) ;
	    System.out.print("\n"); 
//CHANGE  CALCUALATIONS------------------------------------------------------------------------
//	    amountpayed = in.nextInt ();
		System.out.print("\nPlease enter the amount paid:    ") ;
		amountpayed = in.nextDouble ();
		changedue = (amountpayed - totalprice);
		
		System.out.printf("The change will be:    $%.2f", changedue ) ;
//TO MAKE UP THE AMOUNT CALCUALATIONS------------------------------------------------------------------------		   
		System.out.print("\n");
		System.out.println("\nTo make up this amount, you will need:") ;
		 
//calculation for the twenty
		change = (int)changedue / 20;
		changedue = changedue - (change * 20);
		// System.out.print(change);
		String temp  = "twenty-dollar bills" ;
		System.out.printf("%3d %-20s", change, temp );
		
//calculation for the ten dollars
		//System.out.print(" \n");
		change = (int)(changedue / 10);
		changedue = changedue - (change * 10);
		// System.out.print(change);
		 temp  = "ten-dollar bills" ;
		System.out.printf("%3d %-20s", change, temp );
		// System.out.printf(" %5d " +change+ "  ten-dollar bills" );
				 
//calculation for the five dollars
		System.out.print(" \n"); 
		change = (int)(changedue / 5);
		changedue = changedue - (change * 5);
		// System.out.print(change);
		temp  = "five-dollar bills" ;
		System.out.printf("%3d %-20s ", change, temp  );

//calculation for the 2 dollars
		// System.out.print(" \n"); 
		change = (int)(changedue / 2);
		changedue = changedue - (change * 2);
		// System.out.print(change);
		temp = "toonies";
		System.out.printf("%2d %-20s" , change, temp  );

//calculation for the 1 dollar
		System.out.print(" \n"); 
		change = (int)(changedue / 1);
		changedue = changedue - (change * 1);
		// System.out.print(change);
		temp = "loonies";
		System.out.printf("%3d %-20s ", change, temp  );		
		
//calculation for the quarters 
		//System.out.print(" \n"); 
		changedue = Math.round (changedue*100)/100.0; 
		change = (int) (changedue / 0.25);
		changedue = changedue - (change * 0.25);
		// System.out.print(change);
		temp = "quarters";
		System.out.printf("%2d %-20s ", change, temp  );

//calculation for the dimes 
		System.out.print(" \n"); 
		changedue = Math.round (changedue*100)/100.0; 
		change = (int) (changedue / 0.10);
		changedue = changedue - (change * 0.10);
		// System.out.print(change);	
		temp= "dimes";
		System.out.printf("%3d %-23s ", change, temp );
 
//calculation for the nickels 
        //System.out.print(" \n"); 
		changedue = Math.round (changedue*100)/100.0; 
		change = (int)(changedue / 0.05);
		changedue = changedue - (change * 0.05);
		// System.out.print(change);
		//System.out.print(" " +change+ "  nickels" );	
		temp = "nickles";
		System.out.printf("%1d %-20s ", change, temp  );		
 
//calculation for the pennies 
		System.out.print(" \n"); 
		changedue = Math.round (changedue*100)/100.0; 
		change = ((int)(changedue / 0.01));
		changedue = changedue - (change * 0.01);
		// System.out.print(change);
		//System.out.print(" " +change+ "  pennies" );
		temp = "pennies";
		System.out.printf("%3d %-23s ", change, temp  );
		
		
		
		
	}

}
