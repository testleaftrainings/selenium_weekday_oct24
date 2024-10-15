package week1.day1;

public class LearnIf {

	public static void main(String[] args) {
		
		int marks=50;
		//short cut for if--->type if and do ctrl+space
		
		if (marks>=40) {
			System.out.println("pass");
		}
		
		if (marks>=60) {
			System.out.println("grade1");
			
		} else {
			System.out.println("grade d");
		}
		
		//nested if else
		
		int marks1=80;
		
		if(marks1==60) {
			System.out.println("grade 1");
			
		}else if(marks1<40) {
			
			System.out.println("fail");
		}else if(marks1>80) {
			
			System.out.println("distiction");
		}else {
			System.out.println("out of range");
		}
	}

}
