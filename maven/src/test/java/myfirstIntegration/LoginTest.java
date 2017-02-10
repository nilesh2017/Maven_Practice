package myfirstIntegration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {

	
	@Test
	public void AdminLogin() throws InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///G:/Nilesh/Automation%20Engineer/Offline%20Website%20_%20new/index.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("nilesh@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("nilesh");
		
		driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).click();
		
	}

}
