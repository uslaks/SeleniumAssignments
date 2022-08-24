package week3.Day1;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		
		System.out.println("My deposited amount as on 2022 is 7.5 Lakhs");
		
	}

	public static void main(String[] args) {
		
	AxisBank bankinfo = new AxisBank();
	bankinfo.saving();
	bankinfo.fixed();
	bankinfo.deposit();
		
	}
	
}
