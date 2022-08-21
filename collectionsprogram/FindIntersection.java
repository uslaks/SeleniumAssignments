package collectionsprogram;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	/*
	 * Pseudo Code
	 *input: int[] a={3,2,11,4,6,7};
	 *        int[] b={1,2,8,4,9,7};
	 *output:2,4,7
	 *
	 * a) Declare An Array for {3,2,11,4,6,7};	 
	 * b) Declare another Array for {1,2,8,4,9,7};
	 * c) create a two empty Lists - list1 & list2
	 * c) Declare for loop iterator from 0 to array a.length and add into list1
	 * d) Declare for loop iterator from 0 to array b.length and add into another list2
	 * e) Compare Both list1 & list2 using a nested for loop
	 *    1)Print the matching number
	 *  
	 */
	
	public static void main(String[] args) {
		
		// Declaring 2 set of Arrays
		
		int[] a = {3,2,11,4,6,7};
		int[] b = {1,2,8,4,9,7};
		
		// Creating first list using for each loop by adding data from 1st array
		List<Integer> listA = new ArrayList<Integer>();
		
		for(int numA:a) {
			listA.add(numA);
		}
		System.out.println("listA : "+listA);
		
		// Creating second list using for each loop by adding data from 2nd array
		List<Integer> listB = new ArrayList<Integer>();
		
		for(int numB:b) {
			listB.add(numB);
		}
		System.out.println("listB : "+listB);
		
		List<Integer> intersectedValuesList = new ArrayList<Integer>();
		
		// To identify the matching number in both the lists using nested for each loop
		
		for(int eachNumA:listA) {
			
			for(int eachNumB:listB) {
				
			if(eachNumA == eachNumB) {
				
				System.out.println("The number "+eachNumA+" matches in both the lists");
				intersectedValuesList.add(eachNumA);
				
			}
				
			}
						
		}
		
		System.out.println("The matching numbers in both the lists are "+intersectedValuesList);
		
	}
	
}
