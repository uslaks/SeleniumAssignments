package week3.Day1;

public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println("Student Id is "+id);
		
	}
	
	public void getStudentInfo(int id, String name) {
		
		System.out.println("Student Id is "+id+" and Name is "+name);
		
	}
	
	public void getStudentInfo(String email, long phoneNumber) {
		
		System.out.println("Student email is "+email+" and PhoneNumber is "+phoneNumber);
		
	}
	
	public static void main(String[] args) {
		
		Students info = new Students();
		info.getStudentInfo(12345);
		info.getStudentInfo(13658, "Akhila");
		info.getStudentInfo("testemail@gmail.com", 9874563210L);
				
		
	}
	

}
