package org.MiniProjectAddactin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager_Test extends Base_Class{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		
		
		ChromeOptions cc = new ChromeOptions();
		
		cc.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/amazonprime?ref_=nav_cs_primelink_nonmember");
	
	List<WebElement> findElements = driver.findElements(By.xpath("//div[@id='nav-xshop']//child::a"));
	
	for (WebElement webElement : findElements) {
		
		System.out.println(webElement.getText());

		
	}

	WebDriverWait v = new WebDriverWait(driver, 10);
	
	
		
	}
}
