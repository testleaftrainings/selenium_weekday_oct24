package week3.day1;

public class AndroidPhone extends FeaturePhone{ // SubClass extends SuperClass

	public void os() { 
		System.out.println("Stack Android");
	}
	
	public void ram() {
		System.out.println("12 GB");
	}
	
	public void battery() {
		System.out.println("6000 mah");
	}
	
	
	public static void main(String[] args) {
		AndroidPhone android = new AndroidPhone();
		android.os();
		android.ram();
		android.battery();
		android.makeCall();
	}
	
	
	
}
