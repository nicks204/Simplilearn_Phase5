package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement CustId = driver.findElement(By.xpath("//*[@name='cusid']"));
		
		WebElement Submit = driver.findElement(By.xpath("//*[@name='submit']"));
		
		
		CustId.sendKeys("12345");
		Submit.click();
		
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("asdasd");
		
		//alert.accept();
		alert.dismiss();
		
		
		

	}

}
