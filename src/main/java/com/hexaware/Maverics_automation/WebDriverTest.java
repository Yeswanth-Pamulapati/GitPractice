package com.hexaware.Maverics_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {
	public static WebDriver driver = null;
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\yash\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://google.com");
		driver.navigate().to("https://facebook.com");
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
	}
	

}
