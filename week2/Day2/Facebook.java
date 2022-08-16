package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	/*psuedo code
	//Step 1: Download and set the path 
	//Step 2: Launch the chrome browser
	//Step 3: Load the URL https://en-gb.facebook.com/
	//Step 4: Maximize the window
	//Step 5: Add implicit wait
	//Step 6: Click on Create New Account button
	//Step 7: Enter the first name
	//Step 8: Enter the last name
	//Step 9: Enter the mobile number
	//Step 10: Enter the password
	//Step 11: Handle all the three drop downs
	//Step 12: Select the radio button "Female"  
	 */

	public static void main(String[] args) {

		// To open Chrome browser and launch facebook
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		// To wait implicitly for 30 seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// To click Create New Account button
		
		WebElement createNewAccount = driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]/a[@role='button']"));
		createNewAccount.click();

		// To enter all required details for a new signup
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Radha");

		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Krishna");

		WebElement mobilenumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobilenumber.sendKeys("1632960889");

		WebElement password = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		password.sendKeys("Facebook1!");

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		day.sendKeys("20");

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		month.sendKeys("Oct");

		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		year.sendKeys("2000");

		WebElement female = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		female.click();

	}


}
