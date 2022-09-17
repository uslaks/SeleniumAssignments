package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import leaftapAutomation.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods{
	@BeforeTest(alwaysRun = true )
	public void setData() {
		excelFileName = "CompanyDetails";
	}
	
	@Test(dataProvider = "sendData", invocationCount = 3, groups = "regression")
	public void runCreateLead(String CompanyName, String FirstName,String LastName) {

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		driver.findElement(By.name("submitButton")).click();
		
}
		
}