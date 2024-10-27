package week3.day1;

import java.util.Arrays;
import java.util.Iterator;

public class FindDuplicateNumbersInTwoArrays {

	
	public static void main(String[] args) {
		
		//2,3,7,9
		int num1[] = {2,4,7,3,9,11,15,18};
		int[] num2 = {2,5,7,3,9,10, 13,17};
		
		System.out.print("The Duplicate numbers are: ");
		//Nested for loop
		for(int i=0; i<num1.length;i++) {//outer loop - execute once
			
			for(int j=0; j<num2.length; j++) {//inner loop - complete iteration
				
				//Comparison to check the number is Duplicate
				if(num1[i]==num2[j]) {
					System.out.print(num1[i]+", ");
					
				}
			}
			
		}
		
		
		//Type -2 
		//datatype[] variable/object name = new datatype[size];
		int[]  num = new int[5];
		//assign value the index
		System.out.println("\nThe numbers are: ");
		num[0] = 1;
		num[1] = 5;
		num[2] = 3;
		num[3] = 8;
		num[4] = 7;
		num[0] = 10;
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+", ");
		}
		
		//Assign number from 1 to 10 in Array
		
		double[] number = new double[10];
		
		for (int i = 0; i < number.length; i++) {
			double random = Math.random();
			number[i] = random;
		}
		
		System.out.println("The random numbers are:");
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		
		
		
//		0.31536887651076206
//		0.4893464156041838
//		0.3249351926677726
//		0.06650794777169589
//		0.11062326534743816
//		0.7992708444205303
//		0.7970810846619079
//		0.6759117675477958
//		0.9111456700855247
//		0.7414783213753918

		
	}
	
	
}
