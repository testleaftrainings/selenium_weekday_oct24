package week3.day1;

public class ReverseString {

	
	public static void main(String[] args) {
		
		//hello--> olleh
		String x = "hello";
		String output = "";
		//convert the String into Array
		char[] charArray = x.toCharArray();
		int length = charArray.length;
		//reverse for loop to reverse the array
		for(int i=length-1; i>=0; i--) {
			System.out.print(charArray[i]);
			output = output+charArray[i];
		}
	System.out.println("\nThe reverse String is "+output);	
	}
	
}
