package com.hexaware.Maverics_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathTypess {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\yash\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
   	 	
		WebDriver driver = new ChromeDriver();
   	 	driver.get("https://parabank.parasoft.com");
   	 	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("0");
   	 	////a[text()="ParaBank Is Now Re-Opened"] or //li/a[contains(text(),"ParaBank ")]
   	 	System.out.println(driver.findElement(By.xpath("//li/a[contains(text(),'ParaBank')]")).getText());
   	 	driver.findElement(By.xpath("//li/a[contains(text(),\"ParaBank \")]")).click();
   	 	//tagname[starts-with(@name,'value')] and tagname[ends-with(@name,'value')]
   	 	//tagname[attributename='value' and/or attribute=''value'];
   	 	// to get child element '//tagname[attirbute='value']/child::tagname(of child tag)
   	 	//to get parent element '//tagname[attributename ='value']/parent::tagname(of  parent)'   	 
  
		
		}

}
