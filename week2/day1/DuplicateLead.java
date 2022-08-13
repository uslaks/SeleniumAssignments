package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
	public static void main(String[] args) {

		// To use WebDriverManager
		WebDriverManager.chromedriver().setup();

		// To access ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// To Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// To maximize the browser window
		driver.manage().window().maximize();

		// To enter user name
		WebElement usernamefield = driver.findElement(By.id("username"));
		usernamefield.sendKeys("Demosalesmanager");
		
		// To enter password
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("crmsfa");

		// To click login button
		WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
		loginbutton.click();

		// To get the welcome message
		WebElement welcomemessage = driver.findElement(By.tagName("h2"));
		String sucessmessage = welcomemessage.getText();
		
		// To verify if login is successful
		if (sucessmessage.contains("Welcome")) {
			
			System.out.println("Login is Successful");
		}
		
		// To click and access CRM module
		WebElement linktoCRM = driver.findElement(By.linkText("CRM/SFA"));
		linktoCRM.click();
		
		// To click Leads tab
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		
		// To click Create Lead from left pane
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		
		// To enter values in input fields of create lead page
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("NewCompany");
		
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Usha");
		
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Lakshmanan");
		
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("Ush");
		
		WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("Sales & Execution");
		
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("I will be performing and Leading the Sales and Execution Team");
		
		WebElement emailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailAddress.sendKeys("testemail@gmail.com");
				
		// To select value from State drop-down
		WebElement stateDd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateddSelect = new Select(stateDd);
		stateddSelect.selectByVisibleText("New York");
		
		// To submit the inputs provided and create a lead
		WebElement submitButton = driver.findElement(By.className("smallSubmit"));
		submitButton.click();	
		
		// To get the title of the resulting page
		String pageTitle = driver.getTitle();

		System.out.println("The page with title " +pageTitle + " is opened");

		// To click duplicate lead
		WebElement duplicate = driver.findElement(By.linkText("Duplicate Lead"));
		duplicate.click();
				
		// Creating the reference to webElements in Duplicate lead page and entering values
		WebElement companyName1 = driver.findElement(By.id("createLeadForm_companyName"));
		companyName1.clear();
		companyName1.sendKeys("NewCompany_1");
		
		WebElement firstName1 = driver.findElement(By.id("createLeadForm_firstName"));
		firstName1.clear();
		firstName1.sendKeys("Rekha");

		driver.findElement(By.className("smallSubmit")).click();

		// To get the title of the resulting page after creating Duplicate Lead
		pageTitle = driver.getTitle();

		System.out.println("The page with title " +pageTitle + " is opened");
	
	}
}
