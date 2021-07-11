package com.automation.dialog.TestCases;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.automation.dialogPages.Welcomepage;


public class TestCasePage {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeTest
	public void verifyPostPaid()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kwickramasingh\\Desktop\\chromedriver.exe");
	   	driver = new ChromeDriver();
	   	driver.manage().window().maximize();
		String baseUrl = "https://www.dialog.lk/";
		driver.get(baseUrl);
	}
	
	@AfterTest
	public void closeDriver()
	{
		driver.quit();
	}
	
	
	@Test(priority=1)
	public void verifyWelcomepage() throws InterruptedException
	{
		Welcomepage welcomePg= new Welcomepage(driver);
		System.out.println("Page loaded");
		pauseExecusion(10);
		welcomePg.openGetSim();
		//WebDriverWait wait=new WebDriverWait(driver, 30);
		
		welcomePg.clickOnPostpaid();
	}
	
	public void pauseExecusion(int value)
	{
		try {
			value=value*1000;
			Thread.sleep(value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
