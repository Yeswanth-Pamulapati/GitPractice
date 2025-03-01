package com.hexaware.Maverics_automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//https://chercher.tech/practice/practice-pop-ups-selenium-webdriver
public class AlertHandling {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\yash\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//input[@name='alert']")).click();
		 Thread.sleep(2000);
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		
		 alert.accept();
		 
		 driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		 System.out.println(alert.getText());
		 Thread.sleep(2000);
		 alert.dismiss();
		 
		 driver.findElement(By.xpath("//input[@name='prompt']")).click();
		 System.out.println(alert.getText());
		 Thread.sleep(2000);
		 alert.sendKeys("hello");
		 alert.accept();
		 
		
		
	}

}
