package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapSteps {
	
	ChromeDriver driver;
	@Given("Chrome browser is opened")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@And("Load the application URL as {string}")
	public void loadURL(String url) {
		driver.get(url);
	}
	
	@And("Maximize and set the timeouts")
	public void maxAndTimeout() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@And("Enter Username as {string}")
	public void username(String username) {
		WebElement usernamefield = driver.findElement(By.id("username"));
		usernamefield.sendKeys(username);
		
	}
	
	@And("Enter Password as {string}")
	public void password(String password) {

		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys(password);
		
	}
	
	@And("Login button is clicked")
	public void login() {
		
		WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
		loginbutton.click();
	}
	
	@And("CRMSFA link is clicked")
	public void crmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@And("Leads tab is clicked")
	public void leadsTab() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@And("Create Lead link is clicked")
	public void createLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@And("Enter Mandatory Lead information as {string}, {string}, {string}")
	public void enterLeadInfo(String CompanyName, String FirstName, String LastName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
	}
	
	@And("Enter only Company Name as {string}")
	public void enterCompanyName(String CompanyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
	}
	
	@When("Create Lead button is clicked")
	public void createLead() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("View Lead page should be displayed")
	public void viewLead() {
		String pageTitle = driver.getTitle();	
		System.out.println("The page with title " +pageTitle + " is opened");
	}
	
	@Then("Error Message should be displayed")
	public void errorMessage() {
		boolean errorDisplay = driver.findElement(By.xpath("//ul[@class='errorList']")).isDisplayed();
		if (errorDisplay = true) {
			System.out.println("Error message is displayed");
		}
	}
	
	@And("Find Leads link is clicked")
	public void findLeadLink() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@And("Enter PhoneNumber as {string} and search Lead")
	public void enterLeadInfo(String number) throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(number);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
	@And("Enter FirstName as {string} and search Lead")
	public void searchLead(String firstName) throws InterruptedException {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
	@And("Update Company Name as {string}")
	public void updateCompanyName(String CompanyName) {
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(CompanyName);
	}
	
	@And("Select a lead")
	public void selectLead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@When("Delete Lead button is clicked")
	public void deleteLead() {
		driver.findElement(By.linkText("Delete")).click();	
	}
	
	@When("Duplicate Lead button is clicked and Submitted")
	public void duplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Given("Merge Lead is clicked")
	public void mergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	
	@And("From and To Leads are selected using lookup")
	public void leadSelectionforMerge() throws InterruptedException {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("hari");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("babu");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
	}

	
	@When("Merge button is clicked and message accepted")
	public void mergeLeadSubmit() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
	}
	
	@And("Close browser")
	public void close() {
		driver.close();
	}
}
