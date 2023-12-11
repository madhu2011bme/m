package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.firstcry.com/?ref=afgbm_self&utm_source=afgbm&utm_medium+"
				+ "=aff&utm_content=afgbm");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement findElement = driver.findElement(By.xpath("//div[@class='baby-faishon-text']//parent::div//child::div[2]//child::a[8]//child::div[1]"));
		findElement.click();
//		driver.findElement(By.partialLinkText("Boutique ends")).click();
	}
}
