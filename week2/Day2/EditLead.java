package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Pseudocode
 * http://leaftaps.com/opentaps/control/main

 * 1	Launch the browser
 * 2	Enter the username
 * 3	Enter the password
 * 4	Click Login
 * 5	Click crm/sfa link
 * 6	Click Leads link
 * 7	Click Find leads
 * 8	Enter first name
 * 9	Click Find leads button
 * 10 Click on first resulting lead
 * 11 Verify title of the page
 * 12 Click Edit
 * 13 Change the company name
 * 14 Click Update
 * 15 Confirm the changed name appears
 * 16 Close the browser (Do not log out)
 */

public class EditLead {

	public static void main(String[] args) {

		// To open Chrome browser and launch leaftaps
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		// To login to the application
		WebElement usernamefield = driver.findElement(By.id("username"));
		usernamefield.sendKeys("Demosalesmanager");

		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("crmsfa");

		WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
		loginbutton.click();

		// To click and access CRM module
		WebElement linktoCRM = driver.findElement(By.linkText("CRM/SFA"));
		linktoCRM.click();

		// To click Leads tab
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();

		// To click Find Lead from left pane
		WebElement findLeadsLink = driver.findElement(By.linkText("Find Leads"));
		findLeadsLink.click();

		// To enter first name to search for lead
		WebElement firstName = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		firstName.sendKeys("Usha");

		// To click on the find leads button
		WebElement findLeadsButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeadsButton.click();

		// To wait for the lead results (web table) to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		// To click on the first resulting lead
		WebElement firstLead = driver.findElement(By.xpath("(//table/tbody/tr/td/div/a[@class='linktext'])[1]"));
		firstLead.click();

		// To verify title of the page
		String title = driver.getTitle();

		if(title.contains("View Lead")) {

			System.out.println("View Lead page is displayed");

		}

		// To click on Edit button
		WebElement edit = driver.findElement(By.linkText("Edit"));
		edit.click();

		// To enter password
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("My Recent Company");

		// To click on Update button
		WebElement updateButton = driver.findElement(By.xpath("(//input[@name='submitButton'])[1]"));
		updateButton.click();

		// To confirm the updated company name
		WebElement updatedCompanyName = driver.findElement(By.id("viewLead_companyName_sp"));
		String latestCompanyName = updatedCompanyName.getText();

		if(latestCompanyName.contains("My Recent Company")) {

			System.out.println("Company Name is updated for the Lead");

		}

		// To close the browser
		driver.close();


	}

}
