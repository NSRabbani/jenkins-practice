package org.MiniProject_TestNG_Addactin;

import org.MiniProjectAddactin.runner_class_addactin;
import org.Mini_Project_Sel.Base_Class1;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.helpers.File_reader_manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pom.Booking_cnfirm;
import org.pom.logout;
import org.pomofpom.Page_Object_Manager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testNG_Adactin extends Base_Class1 {
	public static WebDriver driver= getbrowser("chrome");
	public static Page_Object_Manager pom =new Page_Object_Manager(driver);
	public static Logger log =Logger.getLogger(runner_class_addactin.class);
	
	
	@BeforeSuite
	private void login() throws Throwable{
	
	PropertyConfigurator.configure("log4j.properties");

	String url = File_reader_manager.getinstanceFrm().getinstanceCR().geturl();		
	System.out.println(url);
	geturl(url);

	log.info("Adactin launched successflly");
	
	String usn = File_reader_manager.getinstanceFrm().getinstanceCR().username();
	
	passkeys(pom.login().getUser(), usn);

	String psw = File_reader_manager.getinstanceFrm().getinstanceCR().password();
	
	passkeys(pom.login().getPass(), psw);

	clickonelement(pom.login().getLog_btn());
	log.info("Login successfull");
	
	sleep(3000);
	}
	
	@Test
	private void booking() throws Throwable{
	
	dropdown("value", pom.selct().getLocation(), "Paris");
	
	dropdown("value", pom.selct().getHotels(), "Hotel Hervey");

	dropdown("value", pom.selct().getRoom_type(), "Super Deluxe");

	dropdown("value", pom.selct().getRoom_nos(), "1");

	clear(pom.selct().getDatepick_in());
	
	String getdatein = File_reader_manager.getinstanceFrm().getinstanceCR().getdatein();
	
	passkeys(pom.selct().getDatepick_in(), getdatein);

	clear(pom.selct().getDatepick_out());
	
	String getdateout = File_reader_manager.getinstanceFrm().getinstanceCR().getdateout();
	
	passkeys(pom.selct().getDatepick_out(), getdateout);
	
	dropdown("value",pom.selct().getAdult_room() , "1");

	dropdown("value", pom.selct().getChild_room(), "1");

	clickonelement(pom.selct().getSubmit());

	sleep(3000);
	log.info("Hotel searching successflly done");
	
	clickonelement(pom.clickpage().getRad());
	clickonelement(pom.clickpage().getContinu());
	sleep(3000);
	String fname = File_reader_manager.getinstanceFrm().getinstanceCR().fname();
	
	passkeys(pom.booking().getF_name(),fname);
	
	String lname = File_reader_manager.getinstanceFrm().getinstanceCR().lname();
	
	passkeys(pom.booking().getL_name(),lname);
	
	String addres = File_reader_manager.getinstanceFrm().getinstanceCR().addres();
	
	passkeys(pom.booking().getAdd(), addres);
	
	String cardno = File_reader_manager.getinstanceFrm().getinstanceCR().cardno();
	
	passkeys(pom.booking().getCc_num(),cardno);

	dropdown("value", pom.booking().getCc_type(), "MAST");
	dropdown("value", pom.booking().getCc_exp_month(), "12");
	dropdown("value", pom.booking().getCc_exp_yearame(), "2022");
	
	String ccvno = File_reader_manager.getinstanceFrm().getinstanceCR().ccvno();
	
	passkeys(pom.booking().getCc_cvv(), ccvno);
	
	sleep(3000);
	clickonelement(pom.booking().getBook_now());
	log.info("Hotel booking successflly done");
	sleep(6000);
	clickonelement(pom.bookcnfrm().getMy_itr_btn());
	sleep(3000);

	driver.findElement(By.xpath("//a[text()='Search Hotel']")).click();
	
	}
	@Test
	private void booking2() throws Throwable{
	
	dropdown("value", pom.selct().getLocation(), "Melbourne");
	
	dropdown("value", pom.selct().getHotels(), "Hotel Sunshine");

	dropdown("value", pom.selct().getRoom_type(), "Super Deluxe");

	dropdown("value", pom.selct().getRoom_nos(), "1");

	clear(pom.selct().getDatepick_in());
	
	String getdatein = File_reader_manager.getinstanceFrm().getinstanceCR().getdatein();
	
	passkeys(pom.selct().getDatepick_in(), getdatein);

	clear(pom.selct().getDatepick_out());
	
	String getdateout = File_reader_manager.getinstanceFrm().getinstanceCR().getdateout();
	
	passkeys(pom.selct().getDatepick_out(), getdateout);
	
	dropdown("value",pom.selct().getAdult_room() , "1");

	dropdown("value", pom.selct().getChild_room(), "1");

	clickonelement(pom.selct().getSubmit());

	sleep(3000);
	log.info("Hotel searching successflly done");
	
	clickonelement(pom.clickpage().getRad());
	clickonelement(pom.clickpage().getContinu());
	sleep(3000);
	String fname = File_reader_manager.getinstanceFrm().getinstanceCR().fname();
	
	passkeys(pom.booking().getF_name(),fname);
	
	String lname = File_reader_manager.getinstanceFrm().getinstanceCR().lname();
	
	passkeys(pom.booking().getL_name(),lname);
	
	String addres = File_reader_manager.getinstanceFrm().getinstanceCR().addres();
	
	passkeys(pom.booking().getAdd(), addres);
	
	String cardno = File_reader_manager.getinstanceFrm().getinstanceCR().cardno();
	
	passkeys(pom.booking().getCc_num(),cardno);

	dropdown("value", pom.booking().getCc_type(), "MAST");
	dropdown("value", pom.booking().getCc_exp_month(), "12");
	dropdown("value", pom.booking().getCc_exp_yearame(), "2022");
	
	String ccvno = File_reader_manager.getinstanceFrm().getinstanceCR().ccvno();
	
	passkeys(pom.booking().getCc_cvv(), ccvno);
	
	sleep(3000);
	clickonelement(pom.booking().getBook_now());
	log.info("Hotel booking successflly done");
	sleep(6000);
	clickonelement(pom.bookcnfrm().getMy_itr_btn());
	sleep(3000);

	driver.findElement(By.xpath("//a[text()='Search Hotel']")).click();
	}
	@AfterSuite
	private void signout() {
	//Screenshot("adact");
	driver.findElement(By.xpath("//a[text()='Logout']"));
	log.info("Logout process successflly done");

	}	
}
