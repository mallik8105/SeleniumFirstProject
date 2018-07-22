package com.operation1;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditAccountTestCase implements SetupInterface {
	
	public void EditAccount() throws InterruptedException {
	
	System.setProperty(CHROME_KEY, CHROME_PATH);
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	
	driver.findElement(By.xpath("//*[@title='Log in to your customer account']")).click();
	
	driver.findElement(By.id("email_create")).sendKeys(RandomStringUtils.randomAlphabetic(5)+"@mailinator.com");
	
	driver.findElement(By.id("SubmitCreate")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.id("id_gender1")).click();
	
	driver.findElement(By.id("customer_firstname")).sendKeys(RandomStringUtils.randomAlphabetic(6));
	
	driver.findElement(By.id("customer_lastname")).sendKeys(RandomStringUtils.randomAlphabetic(8));
	
	driver.findElement(By.id("passwd")).sendKeys("abcd1234");;
	
	WebElement DaysDropDown=driver.findElement(By.id("days"));
	
	new Select(DaysDropDown).selectByValue("10");
	
	WebElement monthdropdown = driver.findElement(By.id("months"));
	
	new Select(monthdropdown).selectByValue("10");
	
	WebElement yeardropdown = driver.findElement(By.id("years"));
	
	new Select(yeardropdown).selectByValue("2000");
	
	driver.findElement(By.id("newsletter")).click();

	driver.findElement(By.id("company")).sendKeys(RandomStringUtils.randomAlphabetic(7));

	driver.findElement(By.id("address1")).sendKeys("Fortlauderdale , FL");

	driver.findElement(By.id("city")).sendKeys(RandomStringUtils.randomAlphabetic(7));

	WebElement Statedropdown = driver.findElement(By.id("id_state"));

	new Select (Statedropdown).selectByValue("9");

	driver.findElement(By.id("postcode")).sendKeys("12345");

	driver.findElement(By.id("phone_mobile")).sendKeys("9194485338");


	driver.findElement(By.id("alias")).sendKeys(" charolette,NC");

	driver.findElement(By.id("submitAccount")).click();
	
	//Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@title='Information']")).click();
	
	driver.findElement(By.id("firstname")).clear();
	

	driver.findElement(By.id("firstname")).sendKeys(RandomStringUtils.randomAlphabetic(7));;
	
	
	driver.findElement(By.id("lastname")).clear();;

	driver.findElement(By.id("lastname")).sendKeys(RandomStringUtils.randomAlphabetic(7));;

	
	driver.findElement(By.id("old_passwd")).sendKeys("abcd1234");
	
	driver.findElement(By.id("passwd")).sendKeys("arjun12345");
	
	driver.findElement(By.id("confirmation")).sendKeys("arjun12345");
	
	driver.findElement(By.xpath("//*[@name='submitIdentity']")).click();
	
	String actualresult = driver.findElement(By.className("page-subheading")).getText();
	
	System.out.println("actual result>>> " + actualresult);
	
	String expectedresult= "YOUR PERSONAL INFORMATION";
	
	System.out.println("expected result>>> "+ expectedresult);
	
	if(actualresult.contains(expectedresult)) {
		System.out.println("test case pass");
	}
	else{
		System.out.println("Test Case fail");
	}
	
	driver.close();
	}
}
	
