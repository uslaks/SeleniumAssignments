package week1.day2.assignments.mandatory;

public class IsPrime {
	
	public static void main(String[] args) {
		
			// Declaring the input variable
			int num = 10;
			
			// Declaring an indicator to use it inside loop
			int flag = 0;
			
			// Iterating from 2 to the number one less than given input number
			for (int i=2; i<=num-1; i++) {
				
				// Check if the input number is divisible by at lease any one number between 2 and num-1 and break the loop
				if (num%i == 0) {
					
					flag = 1;
					
					break;
					
				}
				
			}
			
			// Check the flag for being divisible by other numbers and report it as either prime or non-prime
			if (flag != 1) {
				
				// If the number is non divisible by any number between 2 and num-1 it is prime
				System.out.println("The number " +num +" is prime");
				
			}
			
			else {
				
				// If the number is divisible by any number between 2 and num-1 it is non-prime
				System.out.println("The number " +num +" is non-prime");
			}
		
	}

}
