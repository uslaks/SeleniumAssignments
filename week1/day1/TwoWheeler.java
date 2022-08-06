package week1.day1;

public class TwoWheeler {
	
		//Declaring global variables with values
		public int noOfWheels = 2;
		public short noOfMirrors = 2;
		public long chassisNumber = 109186L;
		public boolean isPunctured = false;
		public String bikeName = "Activa 4G";
		public double runningKM = 35083;

		//Adding Main method
		public static void main(String[] args) {
			
		//creating an object using new keyword
		TwoWheeler mybike = new TwoWheeler();
		
		//calling all the variables inside main method and print the values
		System.out.println(mybike.bikeName);
		System.out.println(mybike.chassisNumber);
		System.out.println(mybike.runningKM);
		System.out.println(mybike.isPunctured);
		System.out.println(mybike.noOfWheels);
		System.out.println(mybike.noOfMirrors);
		}
		
}

