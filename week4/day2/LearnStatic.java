package week4.day2;

public class LearnStatic {
	 static int x;//static variable
	String name;
	//normal method
	public void add() {
		System.out.println("addition of two numbers");
	}
	//static
	public static void sub() {
		System.out.println("sub of two numbers");
	}
	static {
	}
	public static void main(String[] args) {
		System.out.println(x);
		LearnStatic obj=new LearnStatic();
		System.out.println(obj.name);
		obj.add();
		
	}
}
