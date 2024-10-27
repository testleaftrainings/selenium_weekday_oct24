package week3.day2;

public class ObjectForInterface {

	public static void main(String[] args) {
		//datatype variable = value;
		
		
		//Create object for class
		Iphone16 iphone = new Iphone16();
		
		
		//Create object for interface
//			syntax: IntefaceName objectName = new ImplementationClass();
		IphoneFrontView frontView = new Iphone16();
		frontView.dynamicIsland();
		
	}
	
	
}
