package week3.day1;

public class Iphone extends FeaturePhone{// SubClass extends SuperClass

	
	public void os() {
		System.out.println("IOS 18");
	}
	
	public void ram() {
		System.out.println("8 GB");
	}
	
	public void battery() {
		System.out.println("3870 mah");
	}
	
	
	public void basicCall() {
		super.makeCall();
	}
	
	public void makeCall() {
		System.out.println("Hey siri make a call to ...............");
	}
	
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.os();
		iphone.ram();
		iphone.battery();
		iphone.playMusic();
		iphone.makeCall();
		iphone.basicCall();
		iphone.sendMsg();
		iphone.printNumbers(1, 7);
	}
	
}
