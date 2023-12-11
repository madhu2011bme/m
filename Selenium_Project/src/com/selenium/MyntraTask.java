package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(4000);
		WebElement findElement = driver.findElement(By.xpath("//a[@href='https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false']"));
		findElement.click();
		
	}

}