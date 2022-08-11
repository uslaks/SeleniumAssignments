package week1.day2;

// Creating another class MyCalculator
public class MyCalculator {
	
	// Creating main method for execution
			public static void main(String[] args) {
			
			// Creating reference to the Public class Calculator
			Calculator calcResult = new Calculator();
			
			// Calling all methods used in the class Calculator using the object created
			int result1 = calcResult.add(1,2,3);
			int result2 = calcResult.sub(5,3);
			double result3 = calcResult.mul(1002, 5236);
			float result4 = calcResult.divide(56.35f, 2.5f);
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
			System.out.println(result4);
				
		}	

}
