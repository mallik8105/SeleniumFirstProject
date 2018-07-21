package com.operation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUrl {
	
	
	public void url() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Arjun reddy kallem\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.automationpractice.com");
	

	
	driver.findElement(By.xpath("//*[@title='Log in to your customer account']")).click();;
	
	
	driver.quit();
	
	

	}
}
