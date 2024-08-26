package com.Listener;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Baseclass.Baseclass;
import com.aventstack.extentreports.ExtentTest;

public class ExtentReport_Test {
	
	public static ExtentTest extenttest;
	
	@BeforeSuite
	public static void extentTestReportStartup() {
		
		Baseclass base = new Baseclass();
		base.extentReportStart(null);
				
	}

	
	@AfterSuite
	public void extentReportEnd() throws IOException {
		
		Baseclass base = new Baseclass();
		base.extentReportTearDown(null);
	}
}
