package com.automation.dialogPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PostPaidPage {
	WebDriver driver;
	WebDriverWait wait;
	WebElement btnPlansForMe;
	WebElement btnGetNow;
	WebElement lblPlan;
	
	
	public PostPaidPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void selectPlansforme() {
		btnPlansForMe=driver.findElement(By.xpath("//*[@id='plansForAll']/a/span"));
		btnPlansForMe.click();
	
	}
	
	public void selectPlan2700() {
				
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
			wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='flex-viewport']/ul/li/div[@class='pp-slider-block']/h3[text()='Rs. 2700 Plan']")));
			WebElement liElement=driver.findElement(By.xpath("//div[@class='flex-viewport']/ul/li/div[@class='pp-slider-block']/h3[text()='Rs. 2700 Plan']"));
			String liHeader=liElement.getText();
			System.out.println("*** "+liHeader+" ***");
			
			btnGetNow=driver.findElement(By.xpath("//div[@class='flex-viewport']/ul/li/div[@class='pp-slider-block']//*[@id='PostpaidPlan2700']"));
			btnGetNow.click();
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			
		
	}
	
}
