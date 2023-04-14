// CSE 142 Homework 8 (Critters)
// Authors: Stuart Reges and Marty Stepp
//
// CritterMain provides the main method for a simple simulation program.  Alter
// the number of each critter added to the simulation if you want to experiment
// with different scenarios.  You can also alter the width and height passed to
// the CritterFrame constructor.

public class CritterMain {
	public static void main(String[] args) {
		CritterFrame frame = new CritterFrame(60, 40);

		// uncomment each of these lines as you complete these classes
//		frame.add(480, Lion.class);
		frame.add(480, Bear.class);
		frame.add(480, Tiger.class);
		frame.add(480, Ninja.class);
		frame.add(480, Ninja2.class);
// 		frame.add(300, Ninja3.class);
// 		frame.add(300, Ninja4.class);
 		frame.add(480, Ninja5.class);
// 		frame.add(300, Ninja6.class);

//		frame.add(50, FlyTrap.class);
//		frame.add(50, Food.class);
		
		frame.start();
	}
}
