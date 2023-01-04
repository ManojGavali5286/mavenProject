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

public class TC04_VerifyAllProductsAddToCart_Functionality extends TestBaseClass
{
   	
	@Test
	public void  verifyAllProductsAddToCartFunctionality() 
	{
		POMClass_HomePage hp = new POMClass_HomePage(driver);
		
		//allPrdtClick
		hp.clickAllProduct();
		System.out.println("Clicked on all Product");
		
		System.out.println("Apply the validation");
		
		String expectedProductSelection = "6";
		String actualProductSelected = hp.getTextFromAddToCartBtn();  //1
		
		Assert.assertEquals(actualProductSelected, expectedProductSelection);
	}
	
	

}
