public class Chap6Inheritance {
    //This program illustrates inheritance
	public static void main(String[] args) {
		Bus b = new Bus("White", 10);
		System.out.println("Colour of bus is " + b.colour);
		System.out.println("There are " + b.numPassengers + 
						" passengers");
		
		Car c = new Car("Gold", 4);
		System.out.println("Colour of car is " + c.colour);
		System.out.println("There are " + c.numPassengers 
				+ " passengers");
		
		Truck t = new Truck("Black", 1);
		System.out.println("Colour of truck is " + t.colour);
		System.out.println("There are " + t.numPassengers 
				+ " passengers");
		
		Motorcycle m = new Motorcycle("Red", 1);
		System.out.println("Colour of motorcycle is " + m.colour);
		System.out.println("There are " + m.numPassengers 
				+ " passengers");
	}
	
	static class Vehicle {
		String colour;
		int numPassengers = 0;
		Vehicle(){
		};
	}
	
	static class Bus extends Vehicle {
		
		// Constructor
		Bus(String colour, int numPassengers){
            this.colour = colour;
            this.numPassengers = numPassengers;
		};
	}
	
	static class Car extends Vehicle {
		

		// Constructor
		Car(String colour, int numPassengers) {
			this.colour = colour;
			this.numPassengers = numPassengers;
		};
	}
	
	static class Truck extends Vehicle {
		

		// Constructor
		Truck(String colour, int numPassengers) {
			this.colour = colour;
			this.numPassengers = numPassengers;
		};
	}
	
	static class Motorcycle extends Vehicle {
		

		// Constructor
		Motorcycle(String colour, int numPassengers) {
			this.colour = colour;
			this.numPassengers = numPassengers;
		};
	}

}
