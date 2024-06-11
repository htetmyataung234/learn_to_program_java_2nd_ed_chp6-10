
public class Chap6ObjectCreation {
	//This program demonstrates object creation
	public static void main(String[] args) {
		Bus b = new Bus();
		System.out.println("Colour of bus is " + b.colour);
		System.out.println("Number of passengers in bus is " + b.numPassengers + " Passengers.");
	}
	
	static class Bus{
		String colour;
		int numPassengers = 0;
		
		//default constructor
		Bus() {
			colour = "Red";
		}
	}
}
