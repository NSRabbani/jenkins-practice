package org.features_TNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {

	@Test
	@Parameters({"slno","name","roll_no"})
	private void deme(int slno,@Optional("Sherif")String name, int roll_no) {
	
	System.out.println("Sl no: "+slno+"  name : "+name+"  roll no: "+roll_no);
		
	}
	
	
}
