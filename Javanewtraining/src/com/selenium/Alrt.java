package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alrt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		driver.switchTo().alert().sendKeys("Madhu");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-newwin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
	}

}
