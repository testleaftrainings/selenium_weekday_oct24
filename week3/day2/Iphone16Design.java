package week3.day2;

public abstract class Iphone16Design implements IphoneFrontView, IphoneBottomView{

	@Override
	public void chargingPort() {
		System.out.println("Type-C Charging port");
	}

	@Override
	public void dynamicIsland() {
		
		System.out.println("Access Notifications and Apple Intelligence");
		voiceAssitantce();
		ai();
	}

	
	//abstract method
	public abstract void voiceAssitantce();
	
	public abstract void ai();
	
	
	public static void main(String[] args) {
//		Iphone16Design ipDesign = new Iphone16Design();
	}
	
}
