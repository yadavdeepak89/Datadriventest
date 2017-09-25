package com.betatest.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.betatest.base.TestBase;

public class LoginTest extends TestBase{
	
	@Test
	public void loginasbankmnger() throws InterruptedException{
		log.debug("Inside login test");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))), "Login not successfully");
		
		Thread.sleep(1000);
		log.debug("Login successfully executed.");
		
	}

}
