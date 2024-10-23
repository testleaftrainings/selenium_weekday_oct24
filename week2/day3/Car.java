package week2.day3;

public class Car extends Vehicle {
	
	public void applyGear() {
		System.out.println("gear applied---->car");
	}
	public static void main(String[] args) {
		
		Car c=new Car();
		c.applyGear();
		c.applyBrake();
		c.soundHorn();
	
	}
}
