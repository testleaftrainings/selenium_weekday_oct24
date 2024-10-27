package week3.day1;

public class Calculator {
	
	//To add  wholeNumber and whole number, whole number and decimal number, decimal number and decimal number
	
	
	/*
	 * public void addWholeNumber(int a, int b) {
	 * 
	 * }
	 * 
	 * 
	 * public void addDecimalNumber(double a, double b) {
	 * 
	 * }
	 * 
	 * 
	 * public void addDecimalNumberAndWholeNumber(double a, int b) {
	 * 
	 * }
	 * 
	 * public void addWholeNumberAndDecimalNumber(int a, double b) {
	 * 
	 * }
	 */
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	private float add(float x, float y) {
		System.out.println(x+y);
		
		return x+y;
	}
	
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
	
	public void add(double a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, double b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
//		cal.addWholeNumber(1.5, 2);
		cal.add(1.5, 10.5);
		cal.add(10, 20);
		cal.add(10, 20, 30);
	}
	

}
