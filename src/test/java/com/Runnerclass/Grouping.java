package com.Runnerclass;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "School")
	private void srmjvSchool() {
		System.out.println("srmjvSchool");

	}

	@Test(groups = "School")
	private void sreniketanSchool() {
		System.out.println("sreniketanSchool");

	}

	@Test(groups = "School")
	private void beesSchool() {
		System.out.println("beesSchool");

	}

	@Test(groups = "College")
	private void jayaCollege() {
		System.out.println("jayaCollege");

	}

	@Test(groups = "College")
	private void rmkCollege() {
		System.out.println("rmkCollege");

	}

	@Test(groups = "College")
	private void jecCollege() {
		System.out.println("jecCollege");

	}

	@Test(groups = "montessori")
	private void akshayaMontessori() {
		System.out.println("akshayaMontessori");

	}
	@Test(groups = "montessori")
	private void RadhiMontessori() {
		System.out.println("RadhiMontessori");

	}
	
	
	
}
