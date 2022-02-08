package org.features_TNG;

import org.testng.annotations.Test;

public class grouping {

	@Test(groups = { "base" })
	private void abrowserlaunch() {

		System.out.println("browser launch success");
	}

	@Test(groups = { "base" })
	private void bsetprop() {

		System.out.println("setprop sucess");

	}

	@Test(groups = { "base" })
	private void clogin() {

		System.out.println("login sucess");
	}

	@Test(groups = {"base","essentials"})

	private void dpurchaseDress() {

		System.out.println("Dresess purchased");
	}

	@Test(groups = {"base","essentials"})
	private void dpurchaseMobile() {

		System.out.println("Mobile purchased");
	}

	@Test(groups = {"base","accessories"})
	private void dpurchaseHeadphone() {

		System.out.println("Headphone purchased");

	}

	@Test(groups = {"base","essentials"})
	private void dorderFood() {

		System.out.println("Food ordered");
	}

	@Test(groups = { "base" })
	private void elogout() {

		System.out.println("logout sucess");

	}

	@Test(groups = { "base" })

	private void fquit() {

		System.out.println("Browser quit");
	}
}
