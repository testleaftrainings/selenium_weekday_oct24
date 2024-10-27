package week3.day2;
// Iphone class is implementation Class
public class Iphone implements IphoneFrontView, IphoneBackView, IphoneLeftSideView, IphoneRIghtSideView, IphoneBottomView{

	public void dynamicIsland() {
		System.out.println("To access notifications");
	}
	
	
	public static void main(String[] args) {
		Iphone ip = new Iphone();
	}


	@Override
	public void flashLight() {
		System.out.println("Lumos");
	}


	@Override
	public void backCamera() {
		System.out.println("Back camera");
	}


	@Override
	public void logo() {
		System.out.println("a");
	}


	@Override
	public void magSafe() {
		System.out.println("Wireless charging");
	}


	@Override
	public void chargingPort() {
		System.out.println("Type-C charging port");
	}


	@Override
	public void powerButton() {
		System.out.println("Turn ON/OFF iphone");
	}


	@Override
	public void actionButton() {
		System.out.println("Swtich to silent mode");
	}


	@Override
	public void upVolumeButton() {
		System.out.println("Increase the volume");
	}


	@Override
	public void downVolumeButton() {
		System.out.println("Decrease the volume");
	}

}
