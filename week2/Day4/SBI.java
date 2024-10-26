package week2.day4;

public class SBI extends Axis implements RBI {

	@Override
	public void knowYourCustomer() {
		System.out.println("AADHAR--->RBI");
		
	}

	@Override
	public void withDrawalLimit() {
		System.out.println("25000--->RBI");
		
	}
	public void goldLoan() {
		System.out.println("5%---->sbi");
	}
	public static void main(String[] args) {
		SBI s=new SBI();
		s.goldLoan();
		s.knowYourCustomer();
		s.withDrawalLimit();
	}

}
