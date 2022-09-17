package leaftapAutomation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	
	public ChromeDriver driver;
	public String excelFileName;
	
	@Parameters({"url"})
	@BeforeMethod(alwaysRun = true)
	public void launchBrowser(String url) {
		// To use WebDriverManager
		WebDriverManager.chromedriver().setup();

		// To access ChromeDriver
		driver = new ChromeDriver();

		// To Launch the URL
		driver.get(url);

		// To maximize the browser window
		driver.manage().window().maximize();

		// To have implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Parameters({"username","password"})
	@BeforeMethod(alwaysRun = true)
	public void leaftapLogin(String username, String password) {
		// To enter user name
		WebElement usernamefield = driver.findElement(By.id("username"));
		usernamefield.sendKeys(username);
		
		// To enter password
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys(password);

		// To click login button
		WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
		loginbutton.click();
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		// To close browser
		driver.close();
	}
	
	@DataProvider
	public String[][] sendData() throws IOException {
		String[][] data = ReadExcelData.getData(excelFileName);
		return data;
	}

}
