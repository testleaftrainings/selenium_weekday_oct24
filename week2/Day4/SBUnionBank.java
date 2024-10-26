package week2.day4;

public class SBUnionBank extends SingaporeBank {

	@Override
	public void withDrawalLimit() {
		System.out.println("20000");
		
	}

	@Override
	public void convertCurrency() {
		System.out.println("in dollars");
	}
	public static void main(String[] args) {
		SBUnionBank ban=new SBUnionBank();
		ban.goldLoan();
		ban.convertCurrency();
	}

}
