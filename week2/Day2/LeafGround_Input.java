package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Pseudocode
 * https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0

 * 1	Launch the URL in Chrome browser
 * 2	Type your name
 * 3	Append Country to this City.
 * 4	Verify if text box is disabled
 * 5	Clear the typed text.
 * 6	Retrieve the typed text.
 * 7	Type email and Tab. Confirm control moved to next element.
 * 8	Type about yourself
 * 9	Text Editor
 * 10 	Just Press Enter and confirm error message*
 * 11 	Click and Confirm Label Position Changes
 * 12 	Type your name and choose the third option
 * 13 	Type your DOB (mm/dd/yyyy) and confirm date chosen
 * 14 	Type number and spin to confirm value changed
 * 15 	Type random number (1-100) and confirm slider moves correctly
 * 16 	Click and Confirm Keyboard appears
 * 17 	Custom Toolbar
 */

public class LeafGround_Input {

	
	public static void main(String[] args) {
		
	// To launch the LeafGrounds page in Chrome browser
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
	driver.manage().window().maximize();
	
	// To Type name
	driver.findElement(By.xpath("//div/input[contains(@name,'name')]")).sendKeys("Usha Lakshmanan");
	
	// To Append Country to the City existing in the text box
	driver.findElement(By.xpath("//div/input[contains(@class,'city')]")).sendKeys(Keys.SPACE,"India");

	// To verify if text box is disabled
	boolean enabled = driver.findElement(By.xpath("//input[@placeholder='Disabled']")).isEnabled();
	
	if (enabled==false) {
		System.out.println("The text box is disabled");
	} else {
		System.out.println("The text box is not disabled");
	}
	
	// To clear the typed text
	driver.findElement(By.xpath("//input[contains(@value,'clear me')]")).clear();
	
	// To retrieve the typed text
	String text = driver.findElement(By.xpath("//input[contains(@value,'learning')]")).getAttribute("value");
	
	System.out.println("The retrieved text is '"+text+"'");
	
	// To Type email and Tab and to Confirm control moved to next element
	driver.findElement(By.xpath("//input[contains(@placeholder,'email')]")).sendKeys("testemail@gmail.com",Keys.TAB);
	
	String domAttribute = driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).getDomAttribute("class");
	
	if (domAttribute.contains("ui-state-focus")) {
		System.out.println("The control is moved to the next element 'About Yourself'");
	} else {
		System.out.println("The control is Not moved to the next element 'About Yourself'");
	}
	
	
	}
	

}
