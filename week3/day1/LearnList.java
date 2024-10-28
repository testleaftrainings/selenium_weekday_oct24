package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
	//syntax:interface<wrapperclass> variable name=new imp.class<wrappercass>();
		
		//Declare an empty list
		List<String> mentors=new ArrayList<String>();
		List<String> coach=new ArrayList<String>();
		coach.add("Babumanickam");
		System.out.println(coach);
		coach.addAll(mentors);
		System.out.println(coach);
		
		//add items in the list
		mentors.add("ANburaj");//index starts from 0
		mentors.add("mukesh");
		mentors.add("muthu");
		mentors.add("kathir");
		System.out.println(mentors);
		//add(index,string)
		mentors.add(2, "Bhuvanesh");
		System.out.println(mentors);
		coach.addAll(mentors);
		System.out.println(coach);
		
		//size of the list
		int size = mentors.size();
		System.out.println(size);
		
		//retrieve the particular value from the list
		String string = mentors.get(4);
		System.out.println(string);
		//remove an item from alist
		String remove = mentors.remove(2);
		System.out.println(remove);
		//clear the list
		mentors.clear();
		System.out.println(mentors);
				
		
	}


}
