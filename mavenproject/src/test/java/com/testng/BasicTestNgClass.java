package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.sdp.PageObjectManager;

public class BasicTestNgClass extends BaseClass {
	WebDriver driver;

	@BeforeSuite
	private void setProperty() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\mavenproject\\chrome\\chromedriver.exe");
	}

	@BeforeTest
	private void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void getUrl() {
		driver.get("https://adactinhotelapp.com/");
	}

	@BeforeMethod
	private void signIn() {
	driver.findElement(By.id("username")).sendKeys("MadhubalaRavi");
	driver.findElement(By.id("password")).sendKeys("Madhu11bala");
	driver.findElement(By.xpath("//input[@type='Submit']")).click();
	}

	@Test(priority = 0)
	private void bookHotel() {
		WebElement findElement1 = driver.findElement(By.xpath("//select[@name='location']"));
		Select a = new Select(findElement1);
		a.selectByValue("London");
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select b = new Select(findElement2);
		b.selectByValue("Hotel Hervey");
		WebElement findElement3 = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select c = new Select(findElement3);
		c.selectByVisibleText("Deluxe");
		WebElement findElement4 = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select d = new Select(findElement4);
		d.selectByValue("2");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("10/10/2023");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("12/10/2023");
	}

	@AfterMethod
	private void signOut() {

	}

	@AfterClass
	private void validation() {

	}

	@AfterTest
//	private void close() {

//	}

	@AfterSuite
	private void deleteCookies() {

	}
}
