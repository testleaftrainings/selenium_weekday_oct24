package week6.day1;

public class EmployeeDetails {
	int empId;
	String empName;
	boolean empStatus;
	
	public EmployeeDetails() {
		//this(90,"subraja",true);
		System.out.println("default contructor");
		empId=90;
		
	}
	public EmployeeDetails(int empId,String empName,boolean empStatus) {
		
		System.out.println("parameterized constructor");
		//this.empId=empId;
		this.empName=empName;
		this.empStatus=empStatus;
		
	}
	
	public static void main(String[] args) {
		/*
		 * EmployeeDetails ed=new EmployeeDetails();
		 * System.out.println(ed.empId+"\n"+ed.empName+"\n"+ed.empStatus);
		 */
		
		
		  EmployeeDetails ed1=new EmployeeDetails(100,"saranya",true);
		  System.out.println(ed1.empId+"\n"+ed1.empName+"\n"+ed1.empStatus);
		 
	}
}
