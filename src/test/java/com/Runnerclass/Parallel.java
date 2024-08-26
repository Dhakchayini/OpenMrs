package com.Runnerclass;

import org.testng.annotations.Test;

import com.Baseclass.Baseclass;

public class Parallel extends Baseclass {

	@Test
	private void browserLaunch() {

		browserLaunch("chrome");

		launchUrl("https://www.google.co.in/");
		
		quitbrowser(driver, "quit");

	}

	@Test
	private void amazonBrowser() {

		browserLaunch("chrome");

		launchUrl("https://www.amazon.in/");

		quitbrowser(driver, "quit");
	}

	@Test
	private void flipkartBrowser() {

		browserLaunch("chrome");

		launchUrl("https://www.flipkart.com/");
		
		quitbrowser(driver, "quit");

	}
}
