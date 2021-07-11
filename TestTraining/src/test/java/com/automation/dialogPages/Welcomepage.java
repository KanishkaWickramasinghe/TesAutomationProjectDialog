package com.automation.dialogPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Welcomepage {
	WebDriver driver;
	WebDriverWait wait;
	WebElement btnSim;
	WebElement btnSPostPaid;
	String lblButtonText;
	public Welcomepage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public void openGetSim()
	  {
		  
		  //waitingForElement(30,"//*[@id='gSMSec']"); 
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='gSMSec']")));
		  btnSim=  driver.findElement(By.xpath("//*[@id='gSMSec']"));
		  btnSim.click(); 
//		  wait = new WebDriverWait(driver, 30);
//		  wait.until(ExpectedConditions.elementToBeClickable(btnSPostPaid));
				
		  
		 
		   
		}
	
	public void clickOnPostpaid() {
		String txt=driver.findElement(By.xpath("//div[4]/div/div/div/div/p")).getText();
		System.out.println("** "+txt+" **");
		  //assertEquals(txt, "Select connetion type");
		btnSPostPaid=  driver.findElement(By.xpath("//*[@id=\"MobPOstPre\"]/div/div/div/div/div/a[1]"));
		btnSPostPaid.click();
	}
	
	
	
	public void waitingForElement(int time,String xpath)
	{
		wait=new WebDriverWait(driver, null);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
	
	
	
}
