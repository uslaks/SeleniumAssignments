package week1.day1;

public class ConvertANegativeNumberToPositiveNumber {
	
	public static void main(String[] args) {
		int number = -5;
		
		if(number<0) {
			
			int convertedNumber = -1*number;
			
			System.out.println("The converted positive number is " +convertedNumber);
			
		}
	}

}
