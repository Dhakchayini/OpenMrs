package com.Runnerclass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass;

public class Priority extends Baseclass{
	
	@Test(priority = 3)
	private void browserLaunch() {
	
	browserLaunch("chrome");
	launchUrl("https://www.amazon.in/");
	}
		
	
	@Test(priority = 4)
	private void search() {
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("MOBILES");
	}
	
	
	@Test(priority = 5)
	private void close() {
		
		driver.quit();
	}
	
	

}
