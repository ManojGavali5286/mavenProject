package com.sauceDemo.POMPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMClass_HomePage 
{
	//1.WebDriver declared
    //2.Find WebElement
	//3.Ele --> action perform
	//4.constructor declare
	
	//1.WebDriver declared
	 private WebDriver driver;
	 private Select s;
	
	//2.Find WebElement
	//3.Ele --> action perform
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement settingBtn;
	
	public void clickSettingBtn()
	{
		settingBtn.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logOutBtn;
	
	public void clickLogOutBtn()
	{
		logOutBtn.click();
	}
	
	//bagprdt
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagProduct;
	
	public void clickBagProduct()
	{
		bagProduct.click();
	}
	
	
	//addToCart
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement addToCartBtn;
	
	public String getTextFromAddToCartBtn()
	{
		String totalProductSelected =addToCartBtn.getText();
	    return totalProductSelected; //1
	}
	
	//all products elents + action
	@FindBy(xpath="//button[text()='Add to cart']")
	List<WebElement> allProducts;
	
	public void clickAllProduct()
	{
		//assignment -> for each loop
		//or click on single-single ele
		
		for(int i=0; i<allProducts.size(); i++)
		{
			allProducts.get(i).click();
		}
	}
	
	//Assignment-> write one scenario
	//fliter dropDown
	@FindBy(xpath="//select[@class='shopping_cart_badge']")
	private WebElement filterDropDown;
	
	public void clickOnFilterButton()
	{
		filterDropDown.click();		
		s.selectByValue("Data");
	}

	
	
	//4.constructor declare
	public POMClass_HomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
//		s = new Select(filterDropDown);
	}

}
