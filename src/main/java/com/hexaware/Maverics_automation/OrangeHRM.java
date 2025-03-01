package com.hexaware.Maverics_automation;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class OrangeHRM {
     public static void main(String args[]) {
 		System.setProperty("webdriver.chrome.driver", "D:\\yash\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
   	 	WebDriver driver = new ChromeDriver();
     	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   	 	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   	 	/*If you are getting NoSuchElementException as your provided exception, There may be following reasons :-
		May be when you are going to find element, it would not be present on the DOM, 
		So you should implement WebDriverWait to wait until element visible as below :-*/
   	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
 
   	 	driver.findElement(By.name("username")).sendKeys("Admin");
   	 	driver.findElement(By.name("password")).sendKeys("admin123");
   	 	driver.findElement(By.className("oxd-button")).click();
   	 	int employeeSize = driver.findElements(By.xpath("//div[@class=\"oxd-table-card\"]")).size();
   	 	System.out.println(employeeSize);
   	 	for(int i = 1;i<=employeeSize;i++) {
   	 		WebElement empIdValue = driver.findElement(By.xpath("(//div[@class='oxd-table-card'])["+i+"]/div/div[2]/div"));
   	 		WebElement empName = driver.findElement(By.xpath("(//div[@class='oxd-table-card'])["+i+"]/div/div[3]/div"));
//   	 		System.out.println(empIdValue.getText().trim());
   	 		    if(empIdValue.getText().trim().equals("0070") ) {
   	 		    	System.out.print("Employee "+ empName.getText().trim()+" Found.");
   	 		    driver.findElement(By.xpath("(//div[@class='oxd-table-card'])["+i+"]/div/div[9]/div/button[@class=\"oxd-icon-button oxd-table-cell-action-space\"][1]/i")).click();
   	 		    driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
   	 		    
   	 		    }
   	 	}
;
   	 	
    	 
    	 
    	 
    	 
     }
}
