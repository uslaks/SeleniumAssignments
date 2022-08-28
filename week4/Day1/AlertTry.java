package week4.Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTry {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Browser']/ancestor::a")).click();
		driver.findElement(By.xpath("//span[text()='Alert']/ancestor::a")).click();
		driver.findElement(By.xpath("(//span[text()='Show']/ancestor::button)[5]")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		
		
	}
	

}
