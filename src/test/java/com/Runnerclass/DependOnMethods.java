package com.Runnerclass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass;

public class DependOnMethods extends Baseclass{

	@Test
	
	public void login() {
		
		browserLaunch("Chrome");
		launchUrl("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[contains(text(),'Hello, sign in')]")).click();
		implicitWait(driver, 20);
		driver.findElement(By.name("email")).sendKeys("swathyyosh@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("ap_password")).sendKeys("amazon123");
		driver.findElement(By.id("signInSubmit")).click();
	}
@Test(dependsOnMethods = "login" )
	
	public void search() {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dictionary");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
	@Test
	public void select() {
		
		driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	}
}


