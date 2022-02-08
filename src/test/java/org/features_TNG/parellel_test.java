package org.features_TNG;

import org.MiniProjectAddactin.Base_Class;
import org.MiniProjectAddactin.runner_class_addactin;
import org.Mini_Project_Sel.Base_Class1;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.helpers.File_reader_manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pomofpom.Page_Object_Manager;
import org.pomofpom.pageObjectManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parellel_test extends Base_Class {
	
	//public static WebDriver driver = getbrowser("chrome");
	//public static Page_Object_Manager pom =new Page_Object_Manager(driver);
	public static Logger log =Logger.getLogger(runner_class_addactin.class);
	
	
	@Test
	private void login() throws Throwable{
		
	PropertyConfigurator.configure("log4j.properties");
	WebDriver driver = getbrowser("chrome");
	Page_Object_Manager pom =new Page_Object_Manager(driver);
	String url = File_reader_manager.getinstanceFrm().getinstanceCR().geturl();		
	System.out.println(url);
	geturl(url);
System.out.println("launch success");
	//log.info("Adactin launched successflly");
	
	String usn = File_reader_manager.getinstanceFrm().getinstanceCR().username();
	System.out.println(usn);
	passkeys(pom.login().getUser(), usn);

	String psw = File_reader_manager.getinstanceFrm().getinstanceCR().password();
	
	passkeys(pom.login().getPass(), psw);

	clickonelement(pom.login().getLog_btn());
	//log.info("Login successfull");
	
	sleep(3000);
	}

	@Test
	private void alogin1() throws Throwable{
		WebDriver driver = getbrowser("chrome");
		Page_Object_Manager pom =new Page_Object_Manager(driver);
	String url = File_reader_manager.getinstanceFrm().getinstanceCR().geturl();		
	System.out.println(url);
	geturl(url);

	System.out.println("launch success");
	//log.info("Adactin launched successflly");
	
	String usn = File_reader_manager.getinstanceFrm().getinstanceCR().username();
	System.out.println(usn);
	passkeys(pom.login().getUser(), usn);

	String psw = File_reader_manager.getinstanceFrm().getinstanceCR().password();
	
	passkeys(pom.login().getPass(), psw);

	clickonelement(pom.login().getLog_btn());
	//log.info("Login successfull");
	
	sleep(3000);
	}

	
	

}
