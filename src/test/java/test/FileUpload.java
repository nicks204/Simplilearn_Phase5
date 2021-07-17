package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement FileInput = driver.findElement(By.xpath("//*[@name='uploadfile_0']"));
		
		FileInput.sendKeys("");
		
		WebElement Tnc = driver.findElement(By.xpath("//*[@name='terms']"));
		Tnc.click();
		
		WebElement Submit = driver.findElement(By.xpath("//*[@name='send']"));
		Submit.click();
		
		
		
		
		
	}

}
