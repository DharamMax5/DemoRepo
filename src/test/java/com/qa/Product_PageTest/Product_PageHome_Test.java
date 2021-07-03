package com.qa.Product_PageTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.ACT_Pages.Product_Page;
import com.qa.TestBase.TestBase;
import com.qa.TestUtil.TestUtil;



public class Product_PageHome_Test extends TestBase
{
	public static Product_Page page;
    public static TestUtil util;
	
	public Product_PageHome_Test() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void SetUp() throws IOException, InterruptedException
	{
		initialization();
		page = new Product_Page();
		Thread.sleep(2000);
		
	}
	@Test(priority=1)
	public void Verify_PAgeTitle()
	{
		String TitleText=page.Verufy_Title();
		System.out.println(TitleText);
	}
	
	
//	@DataProvider
//	public Object[][] get_SubModuleTestData() throws Exception
//	{
//		Object[] [] data= util.getTestData(SheetName1);
//		return data;
//	}
//	
//	
//	@Test(priority =2, dataProvider="get_SubModuleTestData", enabled=true)
//	public void selectSubMenu(String Scenario, String StepDesc,String Category_Name, String sub_Category_Name) throws InterruptedException
//	{
//		try {
//			Thread.sleep(1000);
//			Productpage.ClickCategoryLink(Scenario, StepDesc, Category_Name,sub_Category_Name);
//		
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		
//	}
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
