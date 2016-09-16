//Jason Joo
//CISC181

import java.util.Scanner;

public class FootballStats {
	
		public static void main(String[] args) {
			
			//Scanner for input
			
			Scanner in= new Scanner(System.in);

			//Prompt user for various values
			
			System.out.println("How many TDs?");
			double TD=in.nextDouble();
			
			System.out.println("How many yards?");
			double YARD=in.nextDouble();
			
			System.out.println("How many interceptions?");
			double INT=in.nextDouble();
			
			System.out.println("How many completions?");
			double COMP=in.nextDouble();
			
			System.out.println("How many pass attempts?");
			double ATT=in.nextDouble();
			
			//Calculates from the inputs given
			
			double rate_a = ((COMP/ATT)-0.3)*5;
			double rate_b = ((YARD/ATT)-3)*0.25;
			double rate_c = (TD/ATT)*20;
			double rate_d = 2.375-((INT/ATT)*25);
			
			//The QB rating formula
			
			double QBrating = ((rate_a + rate_b + rate_c + rate_d)/6)*100;
			
			//Prints the resulting calculation
			System.out.println("The QB's rating is: ");
			System.out.printf("%.2f", QBrating); //Formats the calculation to decimal places
			
		}
}