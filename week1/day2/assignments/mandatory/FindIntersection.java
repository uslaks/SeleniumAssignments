package week1.day2.assignments.mandatory;

public class FindIntersection {
		
	public static void main(String[] args) {
		
		// Input for the array1
		int[] arr1 = {3,2,11,4,6,7};
				
		// Input for the array1
		int[] arr2 = {1,2,8,4,9,7};	
		
		// Creating first (outer) for loop to fetch values of arr1
		for (int i=0; i<arr1.length; i++) {
			
			// Creating second (inner) for loop to fetch values of arr2
			for (int j=0; j<arr2.length; j++) {
				
				// Compare values of both arrays and report the intersecting or matching value
				if (arr1[i] == arr2[j]) {
					
					System.out.println("The matching number in both arrays is "+arr1[i]);
					
					break;
					
				}
								
			}
			
		}
		
	}

}
