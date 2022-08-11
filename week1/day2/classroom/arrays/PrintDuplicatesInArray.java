package week1.day2.classroom.arrays;

public class PrintDuplicatesInArray {
	
public static void main(String[] args) {
		
		// Input for the array
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i<arr.length; i++) {
			
			int count = 0;
			
			// iterate from j to the length of the array by adding 1 to i (inner loop starts here)
			for (int j = i +1; j <arr.length; j++) {
				
				// compare both the loop variables & check they're equal
				if (arr[i]==arr[j]) {
					
					// increase the count if both the arrays are equal
					count = count +1;	
									
				}
					
				}
			
			if (count > 0) {
				
				System.out.println("The Duplicate number is " +arr[i]);
			//This print statement can be written inside the inner loop itself when the array values are equal. Why do we need this additional count condition? 	
			}
			
			
		}
		
	}

}
