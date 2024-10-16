package week1.day3;

import java.util.Arrays;

public class PrintDuplicateValues {

	public static void main(String[] args) {
		//{2,5,7,5,7,9,3,2}
		
		int num[]= {2,5,7,5,7,9,3,2};
		//length of array
		int arrlength = num.length;
		System.out.println(arrlength);
		
		//sort the values
		Arrays.sort(num);//{2,2,3,5,5,7,7,9}//num[0]=2num[1]=2num[2]=3 num[3]=5
		System.out.println("arrays after sorting:"+num[0]);
		
		//print my values
		
		for (int i = 0; i < arrlength-1; i++) {
			
			if(num[i]==num[i+1]) {//2==2
			System.out.println("print the duplicates:"+num[i]);
		}

	}

	}
}
