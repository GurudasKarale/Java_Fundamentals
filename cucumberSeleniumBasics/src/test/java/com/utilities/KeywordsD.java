package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordsD {
	
	

	public static void LoginStep(String username,String pass,WebDriver driver) throws IOException,InterruptedException {
		
		WebElement userfield = driver.findElement(By.xpath(LoadConstants.getPageObjectValue("usernamexpath")));
	    if(userfield.isDisplayed() && userfield.isEnabled()) {
	    	userfield.sendKeys(username);	
	    }
	    
	    WebElement passfield = driver.findElement(By.xpath(LoadConstants.getPageObjectValue("passxpath")));
	    if(passfield.isDisplayed() && passfield.isEnabled()) {
	    	passfield.sendKeys(pass);	
	    }
	    
	    WebElement btnn = driver.findElement(By.xpath(LoadConstants.getPageObjectValue("buttonxpath")));
	    if(btnn.isDisplayed() && btnn.isEnabled()) {
	    	btnn.click();	
	    }
	    StepStatus.setKeywordMap("TestCaseStatus","Pass");
	    StepStatus.setKeywordMap("TestStepStatus","Pass");
	    StepStatus.setKeywordMap("Comment","Login button is clicked");
	    Thread.sleep(4000);
	}
	
	public static void AddItemStep(WebDriver driver) throws IOException,InterruptedException {
		
		Thread.sleep(4000);
		WebElement item = driver.findElement(By.xpath(LoadConstants.getPageObjectValue("item")));
		String itemname = item.getText();
		System.out.println(itemname);
		WebElement itemprice = driver.findElement(By.xpath(LoadConstants.getPageObjectValue("itemprice")));
		String itempricevalue = item.getText();
		
		
			WebElement addcart = driver.findElement(By.xpath(LoadConstants.getPageObjectValue("addtocart")));
			addcart.click();
		
	}
		
	public static void DoCheckout(WebDriver driver) throws IOException,InterruptedException {
		
			Thread.sleep(4000);
			WebElement item = driver.findElement(By.xpath(LoadConstants.getPageObjectValue("gotocart")));
			item.click();
			Thread.sleep(2000);
			WebElement chkout = driver.findElement(By.xpath(LoadConstants.getPageObjectValue("checkout")));
			chkout.click();
				
	}
	
	public static void Finishcheckout(WebDriver driver) throws IOException,InterruptedException {
		
		MaptoStoreExcel.setTestDataMap(ReadExcel.readTheExcel("checkout"));
		WebElement firstnme = driver.findElement(By.xpath(LoadConstants.getPageObjectValue("fname")));
		firstnme.sendKeys(MaptoStoreExcel.getTestDataMap("Name"));
		Thread.sleep(2000);
		WebElement lastnme = driver.findElement(By.xpath(LoadConstants.getPageObjectValue("lname")));
		lastnme.sendKeys(MaptoStoreExcel.getTestDataMap("Address"));
		Thread.sleep(2000);
		WebElement pcode = driver.findElement(By.xpath(LoadConstants.getPageObjectValue("postalcode")));
		pcode.sendKeys(MaptoStoreExcel.getTestDataMap("zip"));
		Thread.sleep(2000);
		
		WebElement infos = driver.findElement(By.xpath(LoadConstants.getPageObjectValue("infosubmit")));
		infos.click();
		Thread.sleep(4000);
		WebElement finishS = driver.findElement(By.xpath(LoadConstants.getPageObjectValue("finish")));
		finishS.click();
			
}
	
}



