package week3.day1;

public class LearnString {

	
	public static void main(String[] args) {
		
		//Literal way
		String name1 = "TestLeaf";
		//Instantiation way
		String name2 = new String("Testleaf");
		
		String name3 = "TestLeaf";
		String name4 = new String("TestLeaf");
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println("name1==name2 --> "+(name1==name2));
		System.out.println("name1==name3 --> "+(name1==name3));
		System.out.println("name2==name4 --> "+(name2==name4));
		
		int length = name1.length();
		System.out.println("The length of name1 is "+length);
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name1.contains("Leaf"));
		
		//To convert the String to char[] 
		char[] charArray = name1.toCharArray();
		
		char charAt = name1.charAt(0);
		System.out.println(charAt);
		String concat = name1.concat(" and Qeagle");
		System.out.println(concat);
		System.out.println(name1);
		
	}
	
}
