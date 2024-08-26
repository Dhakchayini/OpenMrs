package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Baseclass.Baseclass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginPom extends Baseclass {

	public static WebDriver loginPomDriver;

	@FindBy(id="nav-link-accountList")
	private WebElement signIn;

	@FindBy(name="email")
	private WebElement emailID;

	@FindBy(id = "continue")
	private WebElement continueBtn;

	@FindBy(id="ap_password")
	private WebElement password;

	@FindBy(xpath ="//input[@class='a-button-input']")
	private WebElement signBtn;

	@FindBy(xpath = "//div[@id='auth-email-invalid-claim-alert']//div[@class='a-alert-content']")
	private WebElement incorrectEmailId;

	@FindBy(xpath = "//div[@class='a-box-inner a-alert-container']//*[@class='a-list-item']")
	private WebElement incorrectPswd;

	@FindBy(xpath = "//div[contains(text(),'Enter your')]")
	private WebElement emailEmpty;

	@FindBy(xpath = "//div[@class='a-alert-content']//*[@class='a-list-item']")
	private WebElement passwordEmpty;

	@FindBy(xpath = "//div[@class='nav-line-1-container']")
	private WebElement signInAssert;

	public LoginPom(WebDriver driver) {

		loginPomDriver = driver;

		PageFactory.initElements(driver, this);

	}

	public boolean validLogin(ExtentTest extendtest) {

		try {
			implicitWait(driver, 30);
			launchUrl("https://www.amazon.in/");
			navigateRefresh(driver);
			clickOnElement(driver, signIn);
			navigateRefresh(driver);
			inputValue(driver, emailID, "swathyyogesh@gmail.com");
			clickOnElement(driver, continueBtn);
			inputValue(driver, password, "amazon123");
			clickOnElement(driver, signBtn);
			Assert.assertEquals(signInAssert.getText(), "Hello, Swathy");
			extendtest.log(Status.PASS, "Login Successfull");

		} catch (AssertionError e) {
			extendtest.log(Status.FAIL, "login Failed" + e.getMessage());
			return false;

		}

		return true;

	}
	
	public void invalidEmailId() {
		implicitWait(driver, 30);
		launchUrl("https://www.amazon.in/");
		navigateRefresh(driver);
		clickOnElement(driver, signIn);
		
		inputValue(driver, emailID, "swa");
		clickOnElement(driver, continueBtn);
		Assert.assertEquals(incorrectEmailId.getText(), "Wrong or Invalid email address or mobile phone number. Please correct and try again.");
		
	}
	
	public void validEmaiIdAndInvalidPassword() {
		implicitWait(driver, 30);
		launchUrl("https://www.amazon.in/");
		//navigateRefresh(driver);
		clickOnElement(driver, signIn);
		navigateRefresh(driver);
		inputValue(driver, emailID, "swathyyogesh@gmail.com");
		clickOnElement(driver, continueBtn);
		inputValue(driver, password, "12");
		Assert.assertEquals(incorrectPswd.getText(), "Your password is incorrect");
	}
	
	public void emailEmpty() {
		implicitWait(driver, 30);
		launchUrl("https://www.amazon.in/");
		//navigateRefresh(driver);
		clickOnElement(driver, signIn);
		navigateRefresh(driver);
		inputValue(driver, emailID, "");
		clickOnElement(driver, continueBtn);
		Assert.assertEquals(emailEmpty.getText(), "Enter your");
		
	}
	
	public void validEmailAndEmptyPassword() {
		implicitWait(driver, 30);
		launchUrl("https://www.amazon.in/");
		
		clickOnElement(driver, signIn);
		navigateRefresh(driver);
		inputValue(driver, emailID, "swathyyogesh@gmail.com");
		clickOnElement(driver, continueBtn);
		inputValue(driver, password, "");
		clickOnElement(driver, signBtn);	
		Assert.assertEquals(passwordEmpty.getText(),"Enter your password");
		
	}
	
	
	
}
