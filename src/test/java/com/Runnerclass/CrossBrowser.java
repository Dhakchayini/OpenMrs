package com.Runnerclass;

import org.junit.Ignore;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass;

public class CrossBrowser extends Baseclass {

	@Test(enabled = false)
	private void chromeBrowser() {

		browserLaunch("chrome");
		launchUrl("https://www.amazon.in/");
		System.out.println("Browser id:" + Thread.currentThread().getId());
	}

	@Test(invocationCount = 5)
	private void edgeBrowser() {

		browserLaunch("edge");
		launchUrl("https://www.amazon.in/");
		System.out.println("Browser id:" + Thread.currentThread().getId());
	}

	
	@Test(timeOut = 1000)
	
	private void firefoxBrowser() {

		browserLaunch("firefox");
		launchUrl("https://www.amazon.in/");
		System.out.println("Browser id:" + Thread.currentThread().getId());
	}

}
