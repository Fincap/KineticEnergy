/*------------------------------------------------------
My name:			Matthew Archer
My subject code:	CSIT111
My student number:	6093887
My email address:	ma674@uowmail.edu.au
Assignment number:	1
-------------------------------------------------------*/

import java.util.Scanner;

public class KineticEnergy {
	
	public static void main(String[] args) {
		//vars
		double ballRadius, ballLinearVelocity;
		
		Scanner input = new Scanner(System.in);
		
		//If the radius and velocity were not command-line arguments, get them from user now
		/*if (args.length == 2 ) {
			ballRadius = Double.parseDouble(args[0]);
			ballLinearVelocity = Double.parseDouble(args[1]);
		} else {
			ballRadius = 0;
		}*/
		
		ballRadius = (args.length == 2) ? Double.parseDouble(args[0]) : input.nextDouble();
		ballLinearVelocity = (args.length == 2) ? Double.parseDouble(args[1]) : input.nextDouble();
		
		System.out.printf("Radius: %f\n", ballRadius);
		System.out.printf("Velocity: %f\n", ballLinearVelocity);
		
	}
	
}
