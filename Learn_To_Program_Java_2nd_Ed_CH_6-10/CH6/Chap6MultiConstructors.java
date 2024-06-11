
public class Chap6MultiConstructors {

	public static void main(String[] args) {
		Bus b = new Bus();
		System.out.println("Colour of bus is " + b.colour);
		System.out.println("Number of passengers in bus is " + b.numPassengers 
				+ " Passengers.");
		
		Bus b1 = new Bus("Blue");
		System.out.println("Colour of bus is " + b1.colour);
		System.out.println("Number of passengers in bus is " + b1.numPassengers 
				+ " Passengers.");
		
		Bus b2 = new Bus("White", 10);
		System.out.println("Colour of bus is " + b2.colour);
		System.out.println("Number of passengers in bus is " + b2.numPassengers 
				+ " Passengers.");
		
	}
	
	static class Bus {
		String colour;
		int numPassengers = 0;

		// default constructor
		Bus() {
			colour = "Red";
		}

		// Constructor 1
		Bus(String c) {
			colour = c;
		}
		
		//Constructor 2
		Bus(String Colour, int numPassengers) {
			this.colour = Colour;
			this.numPassengers = numPassengers;
		}
	}
}
