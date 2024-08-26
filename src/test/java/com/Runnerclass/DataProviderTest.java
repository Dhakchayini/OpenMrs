package com.Runnerclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "Login Credential")
	private void login(String username, String password) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("email")).sendKeys(username);
		
		driver.findElement(By.name("pass")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
	}
	
	
	@DataProvider(name = "Login Credential")
	public Object[][] dataset(){
		
		return new Object[][] 
				
		{{"a.n.swathyraj@gmail.com","****"},{"admin","Admin12"},{"admin1","admin123"}};
		
		
		
		
		
	}
	
	
	
	

}
