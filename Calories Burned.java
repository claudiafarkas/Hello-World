import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		Scanner  in = new Scanner (System.in);
		double pizzaslice;
		double pizzaslicetotalcalories;
		double cycle;
		double calories;
		double caloriestoburn;
		System.out.println ("How many slices did you eat? ");
		pizzaslice = in.nextInt ();
		System.out.print ("You had ");
		pizzaslicetotalcalories = 335 ; 
		System.out.print (pizzaslicetotalcalories * pizzaslice);
		System.out.println (" calories in total");
		
		System.out.println ("How many calories would you want to burn off? ");
		calories = in.nextInt ();
		
		System.out.println ("How long do you want cycle for? ");
		cycle = in.nextInt ();
		
		caloriestoburn = (pizzaslicetotalcalories * pizzaslice -  calories);
		System.out.print ("You are left with ");
		System.out.print (caloriestoburn);
		System.out.print (caloriestoburn / cycle);
		System.out.print (" calories to burn off if you cycle for ");
		System.out.println (cycle);
		System.out.print (" hours ");
				
		// total calories div hours = hours to burn off #calories
		// 550 calories get burned off per hour
	}

}
