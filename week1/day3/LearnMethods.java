package week1.day3;

public class LearnMethods {

	//syntax:access modifier returntype methodName(arguments)
	
	public int addTwoNumbers(int a,int b,float c){
		
		System.out.println(a+b+c);
		return a;
		
	}
	
	private int noOfBicycles(){
		return 3;
	}
	
	String bicycleData(String brandName,String colour,int regNO) {
		return brandName+" "+colour+" "+regNO;
	}
	
	public static void main(String[] args) {
		
		//syntax:ClassName objectname=new ClassName();
		
		LearnMethods lm=new LearnMethods();
		lm.addTwoNumbers(7, 8, 9.2f);
		System.out.println(lm.noOfBicycles());
		//String bicycleData = lm.bicycleData("Activa", "red", 1234);
		//System.out.println( bicycleData);
		System.out.println(lm.bicycleData("honda", "white", 8976));

	}
	
	
	
}
