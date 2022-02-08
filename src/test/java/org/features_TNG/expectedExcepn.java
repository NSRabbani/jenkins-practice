package org.features_TNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class expectedExcepn {

	@Test(expectedExceptions = ArithmeticException.class)
	private void math() {

		int a = 10/0;
		
		System.out.println(a);
	}
	
	@Test
	private void demoassrt() {

		Assert.assertEquals(true, true);
		

	}
	@Test
	private void ademoassrtsot() {

		SoftAssert s = new SoftAssert();
		
		
		
	}
	
}
