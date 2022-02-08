package org.features_TNG;

import org.testng.annotations.Test;

public class practice {

	@Test(groups = {"grp1","grp2"})
	private void login() {

		System.out.println("login");
		
	}
	@Test(groups = "grp1")
	private void p1() {

		System.out.println("product 1");
		
	}

	@Test(groups = "grp1")
	private void p2() {

		System.out.println("product 2");
		
	}

	@Test(groups = "grp2")
	private void p3() {

		System.out.println("product 3");
		
	}
	@Test(groups = "grp2")
	private void p4() {

		System.out.println("product 4");
		
	}


	@Test(groups = {"grp1","grp2"})
	private void logout() {

		System.out.println("logout");
		
	}

	
}
