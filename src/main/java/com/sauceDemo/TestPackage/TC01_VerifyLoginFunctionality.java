package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class TC01_VerifyLoginFunctionality  extends TestBaseClass
{

	@Test
	public void verifyLoginFunctionality() throws IOException 
	{	
		//Validation
		log.info("Apply the Validation");
				
		String givenTitle = "Swag Labs";   //PO/BA/dev		
		String actualTitle = driver.getTitle();
				
		Assert.assertEquals(actualTitle, givenTitle);
	}
	
	
	

}
