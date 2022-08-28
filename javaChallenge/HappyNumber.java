package javaChallenge;

/*psuedocode
Happy Number is found by making sum of squares of its each digit. 
If it ends in 1 its a Happy Number.
If not ends by 1, i.e. if it ends by 4 (which if again squared will lead to indefinite loop) it is Not a Happy number.

Example 1:
n = 19
1square + 9square = 82
8square + 2square = 68
6square + 8 square = 100
1square + 0square + 0square = 1
Hence 19 is a Happy Number.

Example 2:
n=2
2square = 4
Hence 2 is Not a Happy Number.
*/

public class HappyNumber {
	
	public static void main(String[] args) {
		
		// To convert the number to string
		int n = 152;
		String num = Integer.toString(n);
		
		// To insert the converted String to an character array to split the number as per digits
		char[] arr = num.toCharArray();
		
		// To initialize and keep a counter until which the while loop has to run
		int count=1;
		
		// Initializing a variable sum and assigning zero to it. This variable will be used to store the sum of square of each digits of the number
		int sum=0;
			
		// Running the loop until the count>=1 and incrementing the count until we reach the number 1 or 4	
		while(count>=1) {
				sum = 0;
				System.out.println("value of count "+count);
			
			// Calculating sum of square of each digits	of the number that is kept in an array
			for(int j=0; j<arr.length; j++) {
				int newNum = Character.getNumericValue(arr[j]);
				int square = newNum*newNum;
				sum += square;					
			}
			
			int calc = sum;
			System.out.println("Result value is "+calc);
			
			// Keeping a condition to check if the resultant number reached 1 or 4. Breaking the loop if it reaches 1 or 4 otherwise continuing the loop.
			if(calc!=1 && calc!=4) {
			String num1 = Integer.toString(calc);
			arr = num1.toCharArray();
			count++;
			}
			else if(calc==1) {
				System.out.println("The given number "+n+" is a Happy Number");
				break;
			}
			else {
				System.out.println("The given number "+n+" is Not a Happy Number");
				break;
			}
			
			
		}
	
	}

}

