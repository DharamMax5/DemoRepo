package com.qa.ACT_Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;



public class Product_Page extends TestBase{

	public Product_Page() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public String Verufy_Title()
	{
		return driver.getTitle();
	}
	
      public void ClickCategoryLink(String Scenario, String StepDesc,String Category_Name, String sub_Category_Name) {
		
		
		String MenuLinkXpath = "//div[@class='box category_module']//ul//li";
		
		List<WebElement> MenuLinkList=driver.findElements(By.xpath("//ul[@class='breadcrumb']/li"));
		int MenuLinkList_Count=MenuLinkList.size();
		System.out.println("Total Number of Product list count are "+MenuLinkList_Count);
		
		for(int i=0; i<=MenuLinkList_Count;i++) {
			
		     
			String MenuListText= MenuLinkList.get(i).getText();
			
			System.out.println(MenuListText);
			
			
		}

}}

