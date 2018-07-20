package com.operation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	public void browser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arjun reddy kallem\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.quit();
	}

	
	
}
