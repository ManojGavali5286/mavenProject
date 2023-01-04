package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.POMClass_HomePage;

public class TC03_VerifyBagProductAddToCartFunctionality  extends TestBaseClass
{
 
	@Test
	public  void verifyBagProductAddToCartFunctionality()
	{	
		POMClass_HomePage hp = new POMClass_HomePage(driver);
		
		//bagPrdtClick
		hp.clickBagProduct();
		System.out.println("Clicked on bagProduct");
		
		System.out.println("Apply the validation");
		String expectedProductSelection = "1";
		String actualProductSelected = hp.getTextFromAddToCartBtn();  //1
		
		Assert.assertEquals(actualProductSelected, expectedProductSelection);
			
	}
	
	
}
