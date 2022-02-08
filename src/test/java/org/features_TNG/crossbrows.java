package org.features_TNG;

import org.MiniProjectAddactin.Base_Class;
import org.helpers.File_reader_manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pomofpom.Page_Object_Manager;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrows extends Base_Class{
	WebDriver driver;
	@Test
	@Parameters({"type_browser"})
	private void allbrowser(String type_browser ) throws Throwable {
		if (type_browser.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver",
//					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (type_browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if (type_browser.equalsIgnoreCase("edge")) {
		
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		
		}
	
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
	}
}
