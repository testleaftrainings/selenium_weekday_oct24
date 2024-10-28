package week1.day4;

public class LearnStrings {

	public static void main(String[] args) {
		//syn:Literal--->String var="values";
		
		String str="Test leaf";
		String strliteral="Testleaf";
		
		
		//syn:using instantiation
		String str1=new String("testleaf");
		String str3=new String("testleaf");
		
		//to count the no of characters
		
		int length = str.length();
		System.out.println(length);
		
		//to compare two strings(equals)compare the content
		
		boolean equals = str.equals(str3);
		System.out.println(equals);
		
		if (str1.equals(str3)) {
			System.out.println("same");
				
		} else {
			System.out.println("not same");

		}
		
		if (str1==str3) {//== compares the memory allocation
			
			System.out.println("same");
			
		} else {
			System.out.println("not same");

		}
		
		//ignoring case sensitivity
		
		boolean equalsIgnoreCase = str1.equalsIgnoreCase(str3);
		System.out.println(equalsIgnoreCase);
		
		//contains
		if (strliteral.contains("laef")) {
			System.out.println("yes");
		} else {
			System.out.println("no");

		}
		
		//toCharArray
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		
		//charAt
		char charAt = str.charAt(4);
		System.out.println(charAt);
		
		//print all the characters 
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}//saranya---aynaras
	}

}
