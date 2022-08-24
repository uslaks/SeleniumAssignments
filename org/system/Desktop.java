package org.system;

// To do Single inheritance of Computer class by Desktop class
public class Desktop extends Computer {
	
	public void desktopSize() {
		
		System.out.println("My Desktop size is 16 inches");
		
	}
		
	public static void main(String[] args) {
		
		Desktop myDesktop = new Desktop();
		
		// Calling methods from both parent (Computer class) and child (Desktop class)
		myDesktop.desktopSize();
		myDesktop.computerModel();
		
	}

}
