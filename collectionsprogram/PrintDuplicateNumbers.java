package collectionsprogram;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateNumbers {
	
	public static void main(String[] args) {

		int[] data = {4,3,6,8,29,1,2,4,7,8};

		/*
		 * Problem Statement : Print only duplicate values
		 * Expected output: 4 and 8
		 * 
		 * How to solve?
		 * 1) Regular for loop
		 * 2) Using Set
		 * 
		 * Using Set 
		 * 
		 * a) Add every element into Set
		 * b) If it is already there in the Set -> Print duplicate
		 * 
		 */

		// To create set using the given data
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		// To create a list only with the duplicate values
		List<Integer> duplist = new ArrayList<Integer>();
		
		// To add values from the array to set using for each loop
		for(int eachNum:data) {
			
			// To verify (before adding a number to the set) and report it as duplicate if the number already exists in the Set
			if(set.contains(eachNum)) {
				System.out.println("The number "+eachNum+ " is a duplicate entry");
				duplist.add(eachNum);
			}
			
			set.add(eachNum);
						
		}

		System.out.println("The duplicate numbers are "+duplist);
	}

}
