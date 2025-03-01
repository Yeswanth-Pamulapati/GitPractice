package com.hexaware.Maverics_automation;

import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesHandling {
	public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\yash\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://demoqa.com/nestedframes"); 
//    List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
    driver.switchTo().frame("frame1");// or driver.switchTo().frame(iframes.get(2));
    Thread.sleep(2000);
    driver.switchTo().frame(0);
    System.out.println(driver.findElement(By.tagName("p")).getText().trim());
	driver.switchTo().defaultContent();
	
	}
}
