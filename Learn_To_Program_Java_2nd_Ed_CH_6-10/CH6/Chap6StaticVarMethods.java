public class Chap6StaticVarMethods {
	//This program demonstrates referencing static variables and
	//methods
	public static void main(String[] argv) {
		Bus b = new Bus ("Blue ", 10);
		Bus.numBuses++;
		Bus b1 = new Bus ("Red  ", 16);
		Bus.numBuses++;
		Bus b2 = new Bus ("White", 10);
		b2.incNumBuses();
		Bus b3 = new Bus ("Orange", 19);
		b2.incNumBuses();
		Bus b4 = new Bus ("Green", 7);	
		Bus.incNumBuses();
		System.out.println("Using object b. "+ "Number of buses is " 
		+ b.numBuses);
		System.out.println("Using object b1. "+ "Number of buses is " 
		+ b1.numBuses);
		System.out.println("Using object b2. "+ "Number of buses is " 
		+ b2.numBuses);
		System.out.println("Using object b3. "+ "Number of buses is " 
		+ b3.numBuses);
		System.out.println("Using object b4. "+ "Number of buses is " 
		+ b4.numBuses);
		System.out.println("Using class name. "+ "Number of buses is " 
		+ Bus.numBuses);
	}
	
	static class Bus {
		String colour;
		int numPassengers = 0;
		static int numBuses;
		//Constructor
		Bus(String colour, int numPassengers) {
			this.colour = colour;
			this.numPassengers = numPassengers;
		}
		// n passengers board the bus.
		void board(int n) {
			numPassengers += n;
		}
		// n passengers leave from the bus.
		void disembark(int n) {
			numPassengers -= n;
		}
		
		static void incNumBuses() {
			numBuses++;
		}
	}
	
}
