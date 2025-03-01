package com.hexaware.Maverics_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTypes {
	 public static WebDriver driver = null;
     public static void main(String[]args)
     {
    	 System.setProperty("webdriver.chrome.driver", "D:\\yash\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
    	 driver = new ChromeDriver();
    	 driver.get("https://google.com");
    	 driver.findElement(By.name("q")).sendKeys("selenium");
   
    	 /* Locator Types are:-
    	  * Id
    	  * Name
    	  * ClassName
    	  * XPath
    	  * CSS Selector
    	  * LinkText
    	  * TagName
    	  * partialLinkText
    	  */
    	 
    	 
    	 
    	 
    	 
     }
}
