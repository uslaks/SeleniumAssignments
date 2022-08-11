package week1.day2;

public class Car {

	public void printBrand() {
		System.out.println("Car Brand is BMW");
	}
	
	public String getColor() {
		String color = "White";
		return color;
	}
	
	public int getEngineNumber() {
		int engineNumber = 5263478;
		return engineNumber;
	}
	
	public int getCalculation(int a,int b) {
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		Car detailsOfCar = new Car();
		detailsOfCar.printBrand();
		String color = detailsOfCar.getColor();
		System.out.println("Car color is "+color);
		System.out.println(detailsOfCar.getEngineNumber());
		//detailsOfCar.getEngineNumber();
		int result = detailsOfCar.getCalculation(5,34);
		System.out.println(result);
	}
}
