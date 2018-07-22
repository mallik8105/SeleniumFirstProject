package com.operation1;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class CreateAccountTestCase implements SetupInterface {

	public void Createaccount() throws InterruptedException {

		//Set property to open chrome browser
		System.setProperty(CHROME_KEY,CHROME_PATH);

		//createing obj for chrome driver
		WebDriver driver = new ChromeDriver();

		//enter url using driver class and get method
		driver.get("http://www.automationpractice.com");

		driver.findElement(By.className("login")).click();;

		driver.findElement(By.id("email_create")).sendKeys(RandomStringUtils.randomAlphabetic(5)+"@mailinator.com");

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

		Thread.sleep(3000);


		String actualresult = driver.findElement(By.xpath("//p[@class='info-account']")).getText();

		System.out.println("actualresult ::"+actualresult);

		String expectedresult = "Welcome to your account";
		
		

		if(actualresult.contains(expectedresult)) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		driver.quit();
	}

}
	





