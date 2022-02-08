package org.features_TNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class rerun implements IRetryAnalyzer {
int start = 0;
int end = 3;
	public boolean retry(ITestResult result) {

		if(start<end) {
			
			start++;
			
			return true;
		}
		
		return false;
	}

	
}
