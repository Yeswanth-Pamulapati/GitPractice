package com.hexaware.Maverics_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {
	public static void main(String[]args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\yash\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.name("firstname")).sendKeys("yash");
		 driver.findElement(By.name("lastname")).sendKeys("Pamulapati");
		 driver.findElement(By.xpath("//input[@value='Male']")).click();
		 driver.findElement(By.xpath("//input[@value=1]")).click();
		 driver.findElement(By.xpath("(//input[@style='width:95%;padding:4px 0px 4px 5px;margin:4px 0px'])[2]")).sendKeys("1/8/2020");
		 driver.findElement(By.xpath("//input[@value='Automation Tester']/parent::span")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
		 System.out.println("For Git");
		
		
		
		
	}

}
