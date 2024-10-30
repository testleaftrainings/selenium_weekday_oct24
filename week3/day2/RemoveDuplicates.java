package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//declare an array
		int num[]= {2,4,5,5,7,2,3,4,7};
		//declare an set
		//syntax:interface<wrapperclass> variable=new imp.class<wrapperclass> ();
		Set<Integer> unique=new LinkedHashSet<Integer>();
		Set<Integer> duplicates=new TreeSet<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			boolean add = unique.add(num[i]);
			
			if(!add) {
				duplicates.add(num[i]);
			}
		}
		
		System.out.println(duplicates);
	}

}
