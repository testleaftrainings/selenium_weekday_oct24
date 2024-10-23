package week2.day3;

public class Bike extends Vehicle {
public void noOfWheels() {
	System.out.println("2---->Bike");
}
public void applyMeter() {
	System.out.println("amount paid");
	
}
public void applyGear() {
	System.out.println("gear applied---->car");
}
public static void main(String[] args) {
	Bike b=new Bike();
	b.applyMeter();

	
}
}
