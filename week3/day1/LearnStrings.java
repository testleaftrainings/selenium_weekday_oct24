package week3.day1;

public class LearnStrings {

	public static void main(String[] args) {
		
		//replaceAll
		String str="Testleaf123";
		String replaceAll = str.replaceAll("[^0-9]","t");
		System.out.println(replaceAll);
		//retrive the number
		String replaceAll2 = str.replaceAll("[^A-z]", "");
		System.out.println(replaceAll2);
		
		//replace
		String replace = str.replace("l", "2");
		System.out.println(replace);
		
		//string to Integer
		String s="321";
		int parseInt= Integer.parseInt(s);
		System.out.println(parseInt+10);
		
		//Integer to string
		int num=32;
		System.out.println(num+10);
		String string = Integer.toString(num);
		System.out.println(string+10);
		
		//split
		String ss="Testleaf and Qeagle";
		//String[] split = ss.split(" ");
		//System.out.println(split[2]);
		String[] split2 = ss.split("Testleaf");
		  System.out.println(split2[0]);
		
		//for (int i = 0; i < split.length; i++) {
			//System.out.println(split[i]);
		//}
	}

}
