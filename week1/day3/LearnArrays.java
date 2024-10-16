package week1.day3;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		//syntax:datatype[] variable name={values}
		//index always starts from 0--->index=length-1{1,2,3,4,5,6}--->length=6 index=6-1=5
		
		int[] scores= {96,78,96,83,94,91};
		
		//to find the length of the array
			int arrlength = scores.length;
			System.out.println(arrlength);
			
			//retrieve a single element in an array
		   System.out.println(scores[4]);
		   
		   //sort an array
		   Arrays.sort(scores);
		   System.out.println("the min value is:"+scores[0]);
		   
		   //max value
		   
		   System.out.println("the max value is:"+scores[arrlength-1]);
		   
		   //to print all the values in an array
		   
		   for (int i = 0; i < arrlength; i++) {
			   System.out.println(scores[i]);
			
		}
	}

}
