package week3.day2;

public class Iphone16 extends Iphone16Design{

	@Override
	public void voiceAssitantce() {
		System.out.println("Hey Siri");		
	}

	@Override
	public void ai() {
		System.out.println("Apple Innovation");
	}
	
	
	public static void main(String[] args) {
		
		Iphone16 iphone = new Iphone16();
		iphone.chargingPort();
		iphone.dynamicIsland();
		
	}

}
