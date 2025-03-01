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
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHadling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// implicitwait- applied for all element.default time is 0 sec.
	    //				   - written after the instantiation of webdriver instance variable.
		//			       -The driver is asked to wait for a specific amount of time for the element to be available on the DOM of the page.
		//Explicit wait- for particular elements we are checking.
		//				-The driver is asked to wait till a certain condition is satisfied.
		System.setProperty("webdriver.chrome.driver", "D:\\yash\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/browser-windows");
	    WebElement ele = driver.findElement(By.id("windowButton"));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//NoSuchElement exceptions.Mainly to find elements.
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));  //Element to be clickable ,visible,invisible mainly for actions.
	    wait.until(ExpectedConditions.elementToBeClickable(ele));
	    ele.click();
	    
	    FluentWait<WebDriver> fluentWait = new FluentWait(driver);
	    fluentWait.withTimeout(Duration.ofSeconds(120));//Sets how long to wait for the evaluated condition to be true.
	    fluentWait.pollingEvery(Duration.ofSeconds(20));//Sets how often the condition should be evaluated.
	    fluentWait.ignoring(NoSuchElementException.class,StaleElementReferenceException.class);
	    fluentWait.withMessage("Not clickable");
	    fluentWait.until(ExpectedConditions.elementToBeClickable(ele));
	    ele.click();
	    
	}

}
