package week2.day4;

public abstract class SingaporeBank implements RBI {
	public void knowYourCustomer() {
		System.out.println("voter-id");
	}
	public  void goldLoan() {
		System.out.println("5%");
	}
		
	public abstract void convertCurrency();
	
	//abstract class is called as partial abstraction--->not possible to create an object
	public static void main(String[] args) {
		
	}
}
