package week6.day1;

public class LearnEncapsulation {
	
	private int ssn;
	private String empName;
	private int empAge;
	
	
	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}


	public static void main(String[] args) {
		LearnEncapsulation le=new LearnEncapsulation();
		le.setSsn(1324343);
		System.out.println("ssn num is:"+le.getSsn());
		le.setEmpName("subraja");
		System.out.println(le.getEmpName());
	}

}
