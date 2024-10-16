package week1.day3;

public class LearnBreak {

	public static void main(String[] args) {
		//print the numbers from 1 to 10
		//when i find the number 3 print me in words &i need to stop the iteration
		
		LearnMethods obj=new LearnMethods();
		obj.addTwoNumbers(6, 5, 7.2f);
		
		for (int i = 1; i <=10 ; i++) {
			
			if (i==3) {
				
				System.out.println("three");
				break;
				
			}
			System.out.println(i);
		}
	}

}
