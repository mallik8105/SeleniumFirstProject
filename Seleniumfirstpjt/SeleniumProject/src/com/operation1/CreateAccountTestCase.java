package com.operation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountTestCase implements Setup {

	public void Createaccount() throws InterruptedException {

		//Set property to open chrome browser
		System.setProperty(CHROME_KEY,CHROME_PATH);

		//createing obj for chrome driver
		WebDriver driver = new ChromeDriver();

		//enter url using driver class and get method
		driver.get("http://www.automationpractice.com");

		driver.findElement(By.className("login")).click();;

		driver.findElement(By.id("email_create")).sendKeys("k.mreddy9116@gmail.com");;

		//element3.sendKeys("k.mreddy9116@gmail.com");


		driver.findElement(By.id("SubmitCreate")).click();;


		//to slow down the process speed
		Thread.sleep(5000);

		driver.findElement(By.id("uniform-id_gender1")).click();

		driver.findElement(By.id("customer_firstname")).sendKeys("arjunreddy");

		driver.findElement(By.id("customer_lastname")).sendKeys("kallem");

		driver.findElement(By.id("passwd")).sendKeys("Mallik12345");
		
		WebElement DaysDropdown = driver.findElement(By.id("days"));
		
		
		//Select is the class created mainly for dropdown
		
		new Select(DaysDropdown).selectByValue("29");;
		
		WebElement monthdropdown = driver.findElement(By.id("months"));
		
		new Select(monthdropdown).selectByValue("12");
		
		WebElement yeardropdown = driver.findElement(By.id("years"));

		new Select (yeardropdown).selectByValue("1989");
		
		driver.findElement(By.id("newsletter")).click();
		
		driver.findElement(By.id("company")).sendKeys("american express");
		
		driver.findElement(By.id("address1")).sendKeys("Fortlauderdale , FL");
		
		driver.findElement(By.id("city")).sendKeys("Sunrise");
		
		WebElement Statedropdown = driver.findElement(By.id("id_state"));
		
		new Select (Statedropdown).selectByValue("9");
		
		driver.findElement(By.id("postcode")).sendKeys("12345");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("9194485338");
		

		driver.findElement(By.id("alias")).sendKeys(" charolette,NC");
		
		driver.findElement(By.id("submitAccount")).click();
		
		driver.quit();
		
		
	}

}
