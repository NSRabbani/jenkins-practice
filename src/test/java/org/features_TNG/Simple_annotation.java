package org.features_TNG;

import org.apache.log4j.Priority;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
///priority
//Ignore
//ignore in .xml
//(enabled = false)---->ignore
//invocation count

public class Simple_annotation {
	@Ignore
	@Test
	private void productA() {

		System.out.println("Product 2");

	}

	@Test(priority = 1)
	private void productB() {

		System.out.println("product 3");

	}

	@Test(priority = -1)
	private void productC() {
		System.out.println("product 1");
	}
	
	@Test(enabled = false)
	private void productD() {

		System.out.println("Product 5");

	}@Test(invocationCount = 2,priority = 2)
	private void productE() {

		System.out.println("Product 4");

	}
	

	@BeforeTest
	private void browserLaunch() {

		System.out.println("browser launch");
	}

	@BeforeClass
	private void launchUrl() {
		System.out.println("URL");
	}

	@AfterMethod
	private void addToCart() {

		System.out.println("Add to cart");

	}

	@BeforeMethod
	private void homePage() {
		System.out.println("Product home page");
	}

	@AfterClass
	private void proceedTo() {

		System.out.println("Proceed to pay");

	}

	@AfterTest
	private void validation() {

		System.out.println("Validation");
	}

	@BeforeSuite
	private void setProperty() {

		System.out.println("setproperty");
	}

	@AfterSuite
	private void close() {
		System.out.println("close browser");
	}
}
