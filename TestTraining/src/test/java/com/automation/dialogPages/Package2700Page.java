package com.automation.dialogPages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Package2700Page {
	WebDriver driver;
	String lblPackage;
	WebDriverWait wait;
	
	public Package2700Page(WebDriver driver) {
		this.driver=driver;
	}
	
	public void verifyPackage2700() {
		

		lblPackage=driver.findElement(By.xpath("//div[@class='title-info']/h2")).getText();
		System.out.println("Page Title : "+lblPackage);
		
		assertEquals(lblPackage, "2700 Package");
		
		
		List<WebElement> elements=  driver.findElements(By.xpath("//div[@class='card ']/dl"));
		for(int i=1;i<elements.size();i++)
		{
			String text=driver.findElement(By.xpath("//div[@class='card ']/dl["+i+"]/dt")).getText();
			System.out.println(text);
//			switch (text) {
//			case "Rental":
//				{
//					assertEquals(text,"Rental");
//					break;
//				}
//			case "Free D2D calls":	
//				{
//					assertEquals(text, "Free D2D calls");
//					break;
//				}
//			case "Call Rate":	
//				{
//					assertEquals(text, "Call Rate");	
//					break;
//				}
//			case "Free D2D SMS":	
//				{
//					assertEquals(text, "Free D2D SMS");	
//					break;
//				}
//			case "SMS Rate":	
//				{
//					assertEquals(text, "SMS Rate");	
//					break;
//				}	
//			default:
//				break;
//			}
		}
		
	}
}
