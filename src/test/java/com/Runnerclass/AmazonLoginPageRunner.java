package com.Runnerclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass;
import com.Listener.ExtentReport_Test;
import com.Listener.ITestListenerClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.pomclass.LoginPom;
@Listeners(ITestListenerClass.class)
public class AmazonLoginPageRunner extends Baseclass {

	@BeforeMethod
	public static void setUp() {

		browserLaunch("chrome");

	}

	@Test(priority = 1)

	public static void validLogin() {

		ExtentReport_Test.extenttest = extentReports
				.createTest("LoginTest" + ": " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Valid Email And Valid Password");
		LoginPom logpom = new LoginPom(driver);
		Assert.assertTrue(logpom.validLogin(ExtentReport_Test.extenttest));

	}

	@Test(priority = 2)
	public static void invalidEmail() {

		ExtentReport_Test.extenttest = extentReports
				.createTest("LoginTest" + ": " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Invalid Email Id");
		LoginPom logpom = new LoginPom(driver);
		logpom.invalidEmailId();

	}

	@Test(priority = 3)
	public static void validEmailAndInvalidPswd() {

		ExtentReport_Test.extenttest = extentReports
				.createTest("LoginTest" + ": " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Valid Email and Invalid Password");
		LoginPom logpom = new LoginPom(driver);
		logpom.validEmaiIdAndInvalidPassword();

	}

	@Test(priority = 4)
	public static void emptyEmail() {

		ExtentReport_Test.extenttest = extentReports
				.createTest("LoginTest" + ": " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Empty Email Id");
		LoginPom logpom = new LoginPom(driver);
		logpom.emailEmpty();

	}

	@Test(priority = 5)
	public static void validEmailAndEmptypswd() {

		ExtentReport_Test.extenttest = extentReports
				.createTest("LoginTest" + ": " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Valid Email Id and Empty Password");
		LoginPom logpom = new LoginPom(driver);
		logpom.validEmailAndEmptyPassword();

	}

	@BeforeSuite

	public static void extendStartUp() {

		extentReportStart("C:\\Swathy\\framework\\Open_Mrs\\Reports");
	}

	@AfterSuite

	public static void extendReportEnd() throws IOException {

		extentReportTearDown("C:\\Swathy\\framework\\Open_Mrs\\Reports\\index.html");
	}

	@AfterMethod
	public static void tearDown() {

		quitbrowser(driver, "quit");
	}

}
