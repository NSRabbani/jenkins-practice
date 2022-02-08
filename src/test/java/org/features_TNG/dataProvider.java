package org.features_TNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
@Test(dataProvider = "store")
	private void demo(int a,int b, String c,String d , int j) {

	System.out.println(a+b+c+d+j);
	
	}
	
	@DataProvider
	private Object[][] store() {

		return new Object[][] {
			
			{3,4,"aaa","bbb",9},
			{3,4,"aaa","bbb",9},
			{3,4,"aaa","bbb",9},
			{3,4,"aaa","bbb",9},
			{3,4,"aaa","bbb",9},
			{3,4,"aaa","bbb",9}
		};
		
	}
	
	
}
