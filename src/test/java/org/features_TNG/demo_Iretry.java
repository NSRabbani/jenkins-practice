package org.features_TNG;


import org.junit.Assert;
import org.testng.annotations.Test;



public class demo_Iretry {

	@Test
//	@Test(retryAnalyzer = rerun.class)
	private void data1() {
Assert.assertEquals(true, false);		
		
	}
	@Test
	//@Test(retryAnalyzer = rerun.class)
	private void data2() {
Assert.assertEquals(true, false);	
	}	
	
}
