package com.hexaware.Maverics_automation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\yash\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/browser-windows");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    String parentTab = driver.getWindowHandle();
	    driver.findElement(By.id("windowButton")).click();
	    //2tabs get open.
	    Set<String> allTabs = driver.getWindowHandles();//return type is set because Selenium doesn't allow duplicate values to identify new tabs ro windows.
	    for(String tab : allTabs) {
	    	System.out.println(tab);
	    	System.out.println(tab.equals(parentTab));
	    	if(tab.equals(parentTab)==false) {
	    		driver.switchTo().window(tab);
	    		driver.getTitle();
	    		System.out.println(driver.findElement(By.id("sampleHeading")).getText().trim());
	    		Thread.sleep(2000);
	    		driver.close();
	    		break;
	    	}
	    }
		driver.switchTo().window(parentTab);
		System.out.println(driver.getTitle());
		
		
	}

}
