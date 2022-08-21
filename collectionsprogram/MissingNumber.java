package collectionsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	
	/*
	 * Problem 
	 * 
	 * There will be running number between 1 to 10
	 * One of the unique number will be missing
	 * Find the missing number
	 * 
	 * 
	 */
	
	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set
	 * b) Make sure the set is in the ascending order
	 * c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 */
	
	public static void main(String[] args) {
		
		// To define data set having running number between 1 to 10 with some duplicates
		int[] data = {1,3,2,4,6,7,8,9,10,6,7};
		
		// To convert the array list into TreeSet to have unique values in ascending order
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int eachNum:data) {
			int num = eachNum;
			set.add(num);
		}
		
		System.out.println("Created Set: "+set);
		
		// To convert the set to list to use indexing and get the values
		List<Integer> list = new ArrayList<Integer>(set);
		
		// To identify the missing number in the list
		
		for(int i=0; i<list.size(); i++) {
			int currentNumber = list.get(i);
			int expectedNextNumber = currentNumber+1;
			
			if(expectedNextNumber == list.get(i+1)) {
				
				continue;
				
			} else {
				
				System.out.println("The missing number in the set is "+expectedNextNumber);
				break;
				
			}
						
		}
		
				
	}
	
}
