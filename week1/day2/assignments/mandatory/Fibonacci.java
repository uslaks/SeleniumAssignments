package week1.day2.assignments.mandatory;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		// Declaring variables for the initial values of a Fibonacci series
		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;
		
		// Printing the first value (i.e. 0) of Fibonacci series
		System.out.println(firstNum);
		
		// Iterating from 1 to 11 to derive the Fibonacci series for second to 11th number
		for (int i =1; i<11; i++) {
			
			if (i == 1) {
				
				// Printing the second value (i.e. 1) of Fibonacci series as it is only for the first time
				System.out.println(secondNum);
								
			}
			
			else {
			
				// Deriving the Fibonacci number by adding the firstNum and secondNum
				sum = firstNum+secondNum;
				
				// Updating the firstNum and secondNum as the two preceding numbers
				firstNum = secondNum;
				
				secondNum = sum;
				
				System.out.println(sum);	
				
			}
			
		}
		
	}

}
