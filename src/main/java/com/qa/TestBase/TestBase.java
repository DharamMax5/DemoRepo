package com.qa.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() throws IOException
	{
		prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\ACT_Assignments\\src\\main\\java\\com\\qa\\Config\\config.properties");
		prop.load(fis);
	}
	
	public static void  initialization()
	{
     String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) { 
			
			
			System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			  
			  //WebDriver Driver = new FirefoxDriver();
			  
			  driver = new ChromeDriver();
       	
			
			
		}else if(browserName.equals("ff")) { 
			
			
		    FirefoxOptions firefoxOptions = new FirefoxOptions();
		    firefoxOptions.setCapability("marionette", true);
		    driver = new FirefoxDriver(firefoxOptions);	
			
			}
		driver.manage().window().maximize();

	    
	    driver.manage().deleteAllCookies();
	
	   // driver.manage().timeouts().pageLoadTimeout(util.PageLoadTimeout, TimeUnit.SECONDS);
	   

	    //driver.manage().timeouts().implicitlyWait(util.implictlywait, TimeUnit.SECONDS);
	    
//	     //   driver.get("atcost.in");
	    
	    try {

	    	Thread.sleep(4000);
		
		    driver.get(prop.getProperty("url"));
		    Thread.sleep(4000);

	    } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
