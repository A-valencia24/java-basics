package inheritance;

class Vehicle {
	String color;
	int wheels;
	String model;

	public void park() {
		System.out.println("The Vehicle is in parked postition \n");
	}

	public void reverse() {
		System.out.println("The Vehicle is in reverse \n");
	}

	public void drive() {
		System.out.println("The Vehicle is in drive \n");
	}

}

class Truck extends Vehicle {
	public void drive() {
		super.drive();
		System.out.println("The truck accelerates forward \n");
	}

	public void park() {
		super.park();
		System.out.println("The truck is Idle \n");
	}

	public void reverse() {
		super.reverse();
		System.out.println("The vehicle is in Reverse \n ");
	}

}

class Car extends Vehicle {
	public void drive() {
		super.drive();
		System.out.println("The Car accelerates forward \n");
	}

	public void park() {
		super.park();
		System.out.println("The Car is Idle \n");
	}

	public void reverse() {
		super.reverse();
		System.out.println("The vehicle is in Reverse \n ");
	}

}

class Bus extends Vehicle {
	public void drive() {
		super.drive();
		System.out.println("The Bus accelerates forward \n ");
	}

	public void park() {
		super.park();
		System.out.println("The Bus is Idle \n ");
	}

	public void reverse() {
		super.reverse();
		System.out.println("The vehicle is in Reverse \n ");
	}

}

public class Exercise {
	public static void main(String[] args) {
		Truck t = new Truck();
		t.drive();
		t.park();
		// t.reverse();
		Car c = new Car();
		c.drive();
		c.park();
		// c.reverse();
		Bus b = new Bus();
		// b.drive();
		// b.park();
		// b.reverse();

	}

}
