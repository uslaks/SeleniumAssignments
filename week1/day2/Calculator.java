package week1.day2;

// Creating class Calculator
public class Calculator {

	// Creating 'add' method
	public int add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}

	// Creating 'sub' method
	public int sub(int num1, int num2) {
		int difference = num1 - num2;
		return difference;
	}

	// Creating 'mul' method
	public double mul(double num1, double num2) {
		double product = num1 * num2;
		return product;
	}

	// Creating 'divide' method
	public float divide(float num1, float num2) {
		float quotient = num1 / num2;
		return quotient;
	}
	
	//Tried creating another class file 'MyCalculator' inside the class 'Calculator' but many errors occurred. Can't we create multiple classes in a single class file?
	
}
