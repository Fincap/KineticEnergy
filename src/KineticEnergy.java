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
		//Variable declaration
		double ballRadius, ballLinearVelocity;
		double angularVelocity, momentOfInertia, mVariable; //I have no idea what m in the assignment is supposed to represent
		double totalKineticEnergy, linearKineticEnergy, angularKineticEnergy;
		
		final double IRON_DENSITY = 7.8;
		final double PI = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		//If the radius and velocity were not command-line arguments, get them from user now
		if (args.length == 2 ) {
			ballRadius = Double.parseDouble(args[0]);
			System.out.printf("Ball radius loaded as: %.2f\n", ballRadius);
			ballLinearVelocity = Double.parseDouble(args[1]);
			System.out.printf("Ball linear velocity loaded as: %.2f\n", ballLinearVelocity);
		} else {
			System.out.print("Enter ball radius: ");
			ballRadius = input.nextDouble();
			System.out.print("Enter ball linear velocity: ");
			ballLinearVelocity = input.nextDouble();
		}
		
		//TODO calculates wrong velocity. Manual calci
		
		//Calculate angular velocity
		angularVelocity = ballLinearVelocity / ballRadius;
		
		System.out.println(angularVelocity);
		
		//Calculate moment of inertia
		//TODO given 1, 1 as v and r, produces 24.492 instead of 32.656 Possibly has something to do with a different order of operations
		mVariable = (4/3) * PI * Math.pow(ballRadius, 3) * IRON_DENSITY;
		System.out.println(mVariable);
		momentOfInertia = 0.4 * mVariable * Math.pow(ballRadius, 2);
		System.out.println(momentOfInertia);
		
		//Calculate angular kinetic energy
		angularKineticEnergy = 0.5 * momentOfInertia * Math.pow(angularVelocity, 2);
		System.out.println(angularKineticEnergy);
		
		//Calculate linear kinetic energy
		linearKineticEnergy = 0.5 * mVariable * Math.pow(ballLinearVelocity, 2);
		System.out.println(linearKineticEnergy);
		
		//Calculate total kinetic energy
		totalKineticEnergy = linearKineticEnergy + angularKineticEnergy	;
		
		System.out.printf("The total kinetic energy is: %.2f\n", totalKineticEnergy);
		
	}
	
}
