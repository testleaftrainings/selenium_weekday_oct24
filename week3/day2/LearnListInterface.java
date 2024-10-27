package week3.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnListInterface {

	
	public static void main(String[] args) {
		
		//Create object for List Interface with Implementation class
		
		//syntax interface<wrapper class> variable/object/list name = new ImplementationClass<Wrapper class>();
		
		List<String> names = new ArrayList<String>();
		names.add("Gokul");
		names.add("Siva");
		names.add("Babu");
		names.add("Hari");
		names.add("Mani");
		names.add("Babu");
		System.out.println(names.add("Gokul"));
		System.out.println(names);
		//To get particular value from the collection use method as get(), and the index starts from 0
		String string = names.get(0);
		
		System.out.println(string);
		
		System.out.println(names.remove("shan"));
		//To get the size of the collection --> size()
		int size = names.size();
		System.out.println("Length of the Collection is "+size);
		System.out.println(names.remove(6));
		System.out.println(names);
		names.add(3,"Shan");
		System.out.println(names);
		
		List<Integer> number1 = new LinkedList<Integer>();
		number1.add(1);
		number1.add(5);
		number1.add(7);
		number1.add(10);
		number1.add(71);
		number1.add(1);
		number1.add(15);
		System.out.println(number1);
		
		List<Integer> number2 = new ArrayList<Integer>();
		number2.add(79);
		number2.add(29);
		number2.add(84);
		number2.add(73);
		number2.add(1);
		System.out.println(number2);
		
		number2.addAll(number1);
		System.out.println(number2);
		number2.addAll(2, number1);
		System.out.println(number2);
		System.out.println(number2.size());
		number2.removeAll(number1);
		System.out.println(number2);
		number2.clear();// remove all the values from collection
		System.out.println(number2);
	}
	
	
}
