package week2.day4;



public class Axis implements RBI {

	@Override
	public void knowYourCustomer() {
		System.out.println("PANCARD--->AXIS");
		
	}

	@Override
	public void withDrawalLimit() {
		System.out.println("10000");
		
	}
	public void fixedDeposit() {
		System.out.println("7%");
	}
	public static void main(String[] args) {
		Axis A=new Axis();
		A.fixedDeposit();
		A.knowYourCustomer();
		
	}

}
