package com.hexaware.Maverics_automation;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

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
		 WebElement ele = driver.findElement(By.id("windowButton"));
		  FluentWait<WebDriver> fluentWait = new FluentWait(driver);
		    fluentWait.withTimeout(Duration.ofSeconds(120));//Sets how long to wait for the evaluated condition to be true.
		    fluentWait.pollingEvery(Duration.ofSeconds(20));//Sets how often the condition should be evaluated.
		    fluentWait.ignoring(NoSuchElementException.class,StaleElementReferenceException.class);
		    fluentWait.withMessage("Not clickable");
		    fluentWait.until(ExpectedConditions.elementToBeClickable(ele));
		    ele.click();
		driver.close();
		
		
		
		
		
		
		
		
		
	}
	

}
