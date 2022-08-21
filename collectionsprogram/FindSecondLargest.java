package collectionsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */

		// To create empty Set using TreeSet and to add the input numbers to the set
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i=0; i<data.length; i++) {
			
			int num = data[i];
			set.add(num);
		
		}
		
		System.out.println("Created Set: "+set);
		
		// To convert set into list
		List<Integer> list = new ArrayList<Integer>(set);
		System.out.println("Converted List: "+list);
		
		// To identify and print the second last element from List
		int secondLargestNum = list.get(list.size()-2);
		
		System.out.println("The Second Largest number is "+secondLargestNum);
	}
	

}
