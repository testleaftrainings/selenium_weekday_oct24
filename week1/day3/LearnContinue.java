package week1.day3;

public class LearnContinue {

	public static void main(String[] args) {
		//print the numbers from 1 to 10
//when i find the number 3 print me in words &print the rest of the numbers but 3 should not be repeated
			LearnMethods o=new LearnMethods();
			System.out.println(o.bicycleData("activa", "red", 2345));
			
				for (int i = 1; i <=10 ; i++) {
					
					if (i==3) {
						
						System.out.println("three");
						
						continue;
						
					}
					System.out.println("hello");
				}
			}

	}


