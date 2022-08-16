package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*http://leaftaps.com/opentaps/control/main

Delete Lead:
1	Launch the browser
2	Enter the username
3	Enter the password
4	Click Login
5	Click crm/sfa link
6	Click Leads link
7	Click Find leads
8	Click on Phone
9	Enter phone number
10	Click find leads button
11	Capture lead ID of First Resulting lead
12	Click First Resulting lead
13	Click Delete
14	Click Find leads
15	Enter captured lead ID
16	Click find leads button
17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
18	Close the browser (Do not log out)
*/

public class DeleteLead {
	
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

		// To click on phone tab and to enter phone number
		WebElement phoneTab = driver.findElement(By.xpath("//span[text()='Phone']"));
		phoneTab.click();

		WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
		phoneNumber.sendKeys("9876543210");
		
		// To click on the find leads button
		WebElement findLeadsButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeadsButton.click();

		// To wait for the lead results (web table) to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// To capture lead id of the first resulting lead
		WebElement firstLead = driver.findElement(By.xpath("(//table/tbody/tr/td/div/a[@class='linktext'])[1]"));
		String firstLeadId = firstLead.getText();
		
		System.out.println("The first resulting lead's Lead Id is "+firstLeadId);
		
		// To click on the first resulting lead
		firstLead.click();

		// To delete the first resulting lead
		WebElement delete = driver.findElement(By.linkText("Delete"));
		delete.click();

		// To click Find Lead from left pane
		WebElement findLeadsLeftPane = driver.findElement(By.linkText("Find Leads"));
		findLeadsLeftPane.click();
		
		// To search for the lead id which is deleted
		WebElement id = driver.findElement(By.name("id"));
		id.sendKeys(firstLeadId);
		
		// To click on the find leads button
		WebElement findLeads = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeads.click();
		
		// To confirm successful deletion of the lead
		WebElement infoMessage = driver.findElement(By.xpath("//div[text()='No records to display']"));

		if(infoMessage.isDisplayed()) {

			System.out.println("The lead id "+firstLeadId+" is successfully deleted");

		}

		// To close the browser
		driver.close();


	}
	

}
